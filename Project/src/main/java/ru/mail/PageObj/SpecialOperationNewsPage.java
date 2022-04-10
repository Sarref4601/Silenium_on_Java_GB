package ru.mail.PageObj;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class SpecialOperationNewsPage extends Base {

    public SpecialOperationNewsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверить, что открылась страница новостей Специальной операции")
    public void switchTabToSpecialOperationNewsPage () {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
