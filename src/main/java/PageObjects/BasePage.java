package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected int defaultTimeout = 5;

    public BasePage(WebDriver _driver, WebDriverWait _wait) {
        this.driver = _driver;
        this.driverWait = _wait;
    }

    public BasePage(WebDriver _driver) {
        this.driver = _driver;
        this.driverWait = new WebDriverWait(driver, defaultTimeout);
    }

    protected boolean IsElementPresent(By by) {
        return driverWait.until(driver -> !driver.findElements(by).isEmpty());
    }
}
