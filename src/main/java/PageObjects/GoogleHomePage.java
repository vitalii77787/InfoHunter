package PageObjects;

import Utils.PageObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver _driver) {
        super(_driver);
    }

    public GoogleHomePage(WebDriver _driver, WebDriverWait _wait) {
        super(_driver, _wait);
    }

    protected WebElement InputField() {
        return this.driver.findElement(By.cssSelector(".gLFyf.gsfi"));
    }

    protected WebElement SearchButton() {
        return this.driver.findElement(By.cssSelector(".gNO89b"));
    }

    protected WebElement IAmLuckyButton() {
        return this.driver.findElement(By.cssSelector(".FPdoLc.tfB0Bf .RNmpXc"));
    }

    public void FillInputAndClickEnter(String inputText) {
        PageObjectUtils.FillInputAndClickEnterKey(InputField(), inputText);
    }

    public void FillInputAndClickSearchButton(String inputText) {
        PageObjectUtils.FillInput(InputField(), inputText);
        SearchButton().click();
    }

    public void FillInputAndClickIAmLuckyButton(String inputText) {
        PageObjectUtils.FillInput(InputField(), inputText);
        IAmLuckyButton().click();
    }
}
