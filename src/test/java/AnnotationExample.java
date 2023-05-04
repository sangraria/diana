import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class AnnotationExample {
    public String baseUrl = "https://browserstack.com/";

    String driverPath = "/C:/Users/diana/Desktop/chromedriver_win32/chromedriver.exe";

    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching Chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }


}
