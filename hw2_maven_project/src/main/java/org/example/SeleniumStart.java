/**
 *   EndToEnd test for
 *   check authorisation on https://passport.yandex.ru/
 *   @author Andrei Boiko
 *   @version 22/03/2022
 */

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumStart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)");
        chromeOptions.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //Ожидание появления элемента в течение 3-х секунд. Выставляется настройка один раз.

        driver.get("https://passport.yandex.ru/auth?retpath=https%3A%2F%2Fpassport.yandex.ru%2Fprofile&noreturn=1");
        driver.findElement(By.id("passp-field-login")).sendKeys("testyaform01");
        driver.findElement(By.id("passp:sign-in")).click();
        //Вводим логин и нажимаем кнопку "Войти".

        driver.findElement(By.id("passp-field-passwd")).sendKeys("%c%6yD$QS25bk55");
        driver.findElement(By.id("passp:sign-in")).click();
        //Вводим пароль и нажимаем кнопку "Войти".

        driver.findElement((By.id("passp-field-question"))).sendKeys("Лермонтова");
        driver.findElement(By.id("passp:sign-in")).click();
        //Вводим ответ на вопрос и нажимаем кнопку "Войти".

        driver.findElement(By.xpath("//div[3]/button")).click();
        //Отказываемся оставлять свой номер.

        Thread.sleep(3000);
        driver.quit();
    }
}
