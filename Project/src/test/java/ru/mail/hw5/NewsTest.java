package ru.mail.hw5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class NewsTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    ChromeOptions chromeOptions;
    Actions actions;
    private static final String MAIL_URL = "https://mail.ru/";

    @BeforeAll
    static void driverRegister () {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver () {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(MAIL_URL);
        chromeOptions = new ChromeOptions().addArguments("--disable-notifications");
        driver.manage().window().maximize();
    }

    @Test
    void openMoscowNewsTest() {
        actions.doubleClick(driver.findElement(By.xpath("//a[contains(@href, 'http://news.mail.ru/inregions/moscow/90/')]")))
                .build()
                .perform();
        Assertions.assertEquals(driver.getTitle(), "В Москве в выходные выпадет до 60% месячной нормы осадков");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }




}
