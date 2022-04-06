package ru.mail.PageObj;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class SpecialOperationNewsPage extends Base {

    public SpecialOperationNewsPage(WebDriver driver) {
        super(driver);
    }

    public void switchTabToSpecialOperationNewsPage () {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
