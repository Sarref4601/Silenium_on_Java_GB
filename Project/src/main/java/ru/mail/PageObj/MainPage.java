package ru.mail.PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends Base {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(@href, 'http://news.mail.ru/inregions/moscow/90/')]")
    private WebElement moscowNewsButton;

    public MainPage clickOnMoscowNewsButton() {
        actions
                .doubleClick(moscowNewsButton)
                .build()
                .perform();
        return this;
    }

    @FindBy(xpath = "//a[contains(@href, '//news.mail.ru/story/politics/ukraine_conflict/')]")
    public WebElement specialOperationNewsButton;

    public MainPage clickOnSpecialOperationNewsButton() {
        actions
                .doubleClick(specialOperationNewsButton)
                .build()
                .perform();
        return this;
    }
}
