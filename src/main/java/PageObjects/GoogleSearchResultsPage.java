package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResultsPage extends BasePage {
    private final String SearchResultLabel = "#resultStats";

    public GoogleSearchResultsPage(WebDriver _driver) {
        super(_driver);
    }

    public GoogleSearchResultsPage(WebDriver _driver, WebDriverWait _wait) {
        super(_driver, _wait);
    }

    protected WebElement SearchResultLabel() {
        return this.driver.findElement(By.cssSelector(SearchResultLabel));
    }

    public boolean IsSearchResultLabelPresent() {
        return IsElementPresent(By.cssSelector(SearchResultLabel));
    }
}
