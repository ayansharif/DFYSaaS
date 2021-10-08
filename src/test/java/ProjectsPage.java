import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

public class ProjectsPage {


    WebDriver driver;


    @BeforeTest
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://dfysaas.com/");
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

    @Test(priority = 1)
    void openBrowser() throws InterruptedException {
        try {


            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dfysaas.com/projects/']")).click();
            // Assert.assertTrue(logo.isDisplayed(), "Logo is displayed correctly.");
            Thread.sleep(1000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Projects - DFY SaaS";
            Assert.assertEquals(ExpectedTitle, ActualTitle);
        } catch (Exception e) {
            System.out.println("Error Not Found!");
        }

    }

    private void assertTrue(boolean contains) {
    }

    private void assertEquals(String s) {
    }

    @Test(priority = 2)
    void VerifyText() {
        String pageText = driver.findElement(By.xpath("//h2[contains(.,'Here are Some Impressive SaaS ProjectsWe have Worked on in the Past')]")).getText();
        System.out.println("Page Text Found! " + pageText);




    }
}