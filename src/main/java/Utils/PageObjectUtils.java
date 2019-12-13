package Utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PageObjectUtils {
    public static void FillInput(WebElement target, String inputText) {
        target.click();
        target.clear();
        target.sendKeys(inputText);
    }

    public static void FillInputAndClickEnterKey(WebElement target, String inputText) {
        target.click();
        target.clear();
        target.sendKeys(inputText);
        target.sendKeys(Keys.ENTER);
    }
}
