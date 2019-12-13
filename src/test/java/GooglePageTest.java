import PageObjects.GoogleHomePage;
import PageObjects.GoogleSearchResultsPage;
import Utils.BrowserTypes;
import Utils.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GooglePageTest {
    private DriverFactory driverFactory;
    private int timeOut = 5;

    @BeforeClass
    public void SetUp() {
        driverFactory = new DriverFactory();
        driverFactory.StartBrowser(BrowserTypes.Chrome, timeOut);
        driverFactory.GetDriver().navigate().to(Data.BaseUrl);
    }

    @Test
    public void VerifingGoogleSearchPage() {
        //Arrange
        boolean expectedResult = true;

        // Act
        GoogleSearchResultsPage searchResultsPage = TypeResultsInSearchField(Data.TestData1);
        boolean actualResult = searchResultsPage.IsSearchResultLabelPresent();

        // Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    // Typing google main page input
    private GoogleSearchResultsPage TypeResultsInSearchField(String input) {
        GoogleHomePage homePage = new GoogleHomePage(driverFactory.GetDriver(), driverFactory.getDriverWait());
        homePage.FillInputAndClickEnter(input);
        return new GoogleSearchResultsPage(driverFactory.GetDriver(), driverFactory.getDriverWait());
    }

    @AfterClass
    public void TierDown() {
        driverFactory.StopDriver();
    }
}
