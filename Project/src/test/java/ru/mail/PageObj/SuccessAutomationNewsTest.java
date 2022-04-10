package ru.mail.PageObj;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class SuccessAutomationNewsTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    public static void driverRegister () {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void initDriver () {
        driver = new EventFiringDecorator(new CustomLogger()).decorate(new ChromeDriver()) ;
        driver.get("https://mail.ru/");
        webDriverWait = new  WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    void successOpenMoscowNews() {
        new MainPage(driver)
                .clickOnMoscowNewsButton();
        new MoscowNewsPage(driver)
                .switchTabToMoscowNewsPage();

        Assertions.assertEquals(driver.getCurrentUrl(),"https://news.mail.ru/inregions/moscow/90/");
    }

    @Test
    void successOpenSpecialOperationNewsPage() {
        new MainPage(driver)
                .clickOnSpecialOperationNewsButton();
        new SpecialOperationNewsPage(driver)
                .switchTabToSpecialOperationNewsPage();

        Assertions.assertEquals(driver.getCurrentUrl(), "https://news.mail.ru/story/politics/ukraine_conflict/");

    }

    @AfterEach
    public void tearDown() {
            driver.quit();
    }
}
