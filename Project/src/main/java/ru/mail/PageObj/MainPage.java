package ru.mail.PageObj;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
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

    @Story("Проверка меню 'Новости' ")
    @Feature("Страница новостей 'Москва'")
    @Step("Дважды кликнуть на кнопку 'Москва' в новостной ленте")
    public MainPage clickOnMoscowNewsButton() {
        actions
                .doubleClick(moscowNewsButton)
                .build()
                .perform();
        return this;
    }

    @FindBy(xpath = "//a[contains(@href, '//news.mail.ru/story/politics/ukraine_conflict/')]")
    public WebElement specialOperationNewsButton;
    @Story("Проверка меню 'Новости' ")
    @Feature("Страница новостей 'Специальная операция'")
    @Step("Дважды кликнуть на кнопку 'Специальная операция' в новостной ленте")
    public MainPage clickOnSpecialOperationNewsButton() {
        actions
                .doubleClick(specialOperationNewsButton)
                .build()
                .perform();
        return this;
    }
}
