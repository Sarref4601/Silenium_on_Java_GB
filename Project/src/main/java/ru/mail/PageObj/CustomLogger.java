package ru.mail.PageObj;

import io.qameta.allure.Allure;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import java.io.ByteArrayInputStream;

import static org.openqa.selenium.OutputType.BYTES;

public class CustomLogger implements WebDriverListener {
    public void beforeGetCurrentUrl(WebDriver driver) {
        Allure.addAttachment("Скриншот страницы", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(BYTES)));
    }
}
