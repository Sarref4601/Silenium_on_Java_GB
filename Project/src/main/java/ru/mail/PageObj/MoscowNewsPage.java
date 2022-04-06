package ru.mail.PageObj;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class MoscowNewsPage extends Base {

    public MoscowNewsPage(WebDriver driver) {
        super(driver);
    }
    public void switchTabToMoscowNewsPage () {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

}
