import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUs {
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
    public void ContactUs() throws InterruptedException {
        {
            //WebDriverWait wait1 = new WebDriverWait(driver, 10);
            //WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/button/div")));
            //element1.click();

            /*Thread.sleep(10000);
            //driver.findElement(By.xpath("//div[@class='drift-controller-icon--close']")).click(); //Clicking popup window to close
            WebElement element = driver.findElement(By.xpath("//div[@class='drift-controller-icon--close']"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);*/
            //driver.findElement(By.cssSelector("#root > button > div"));
            //WebDriverWait wait=new WebDriverWait(Duration.ofSeconds(30));
            //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > button > div")));

            Thread.sleep(100);
            driver.findElement(By.xpath("//button[@class='btn btn-primary get_started ']")).click();
            Thread.sleep(100);
            driver.findElement(By.xpath("//input[contains(@name,'f_name')]")).sendKeys("AdamTest");
            driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("123444555");
            driver.findElement(By.xpath("(//input[contains(@type,'email')])[1]")).sendKeys("ayantest12@gmail.com");
            driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();





            /*Thread.sleep(100);
            driver.findElement(By.xpath("//input[contains(@name,'b_name')]")).sendKeys("Test Business");
            Select dropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'been_in_business')]")));
            driver.findElement(By.xpath("//select[@name='been_in_business']")).isSelected();
            dropdown.selectByIndex(1);
            driver.findElement(By.xpath("//input[contains(@name,'website')]")).sendKeys("Testing Business Text");*/
            //driver.findElement(By.xpath("//textarea[@name='about_business']")).sendKeys("This is my testing project");
            //Thread.sleep(1000);
            //driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();

             /*Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(.,'Book An Appointment Now!')]")).click();

           Thread.sleep(1000);
            Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(.,'Thank You!')]")).getText(), "Thank You!");
            driver.findElement(By.xpath("//h2[contains(.,'Thank You!')]")).getText();*/

        }

            }
            @Test(priority = 2)
            public void TextVerification() throws InterruptedException {
                Thread.sleep(1000);
                String pageText = driver.findElement(By.xpath("//h2[contains(.,'Thank You!')]")).getText();
                System.out.println("Page Text Found!" + pageText);
            }


}
