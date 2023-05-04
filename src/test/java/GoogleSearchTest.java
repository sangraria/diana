import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    public String baseUrl = "http://www.google.com/";
    public WebDriver driver = new ChromeDriver();

    @Test
    public void verifyHomePageTitle() {
        driver.get(baseUrl);

        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();

        WebElement element = driver.findElement(By.xpath("XDyW0e"));

        element.click();

        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();

        // public WebDriver driver = new ChromeDriver();
        //
        //    @Test
        //    public void verifyHomePageTitle() {
        //        driver.get(baseUrl);
        //
        //        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        //        cookies.click();
        //
        //        WebElement element = driver.findElement(By.xpath("XDyW0e"));
        //
        //        element.click();
        //
        //        System.out.println("Page title is: " + driver.getTitle());
        //        driver.quit();

    }


}
