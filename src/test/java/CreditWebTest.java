import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.testng.annotations.Test;

import javax.annotation.Nonnull;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;


public class CreditWebTest{
    static final Logger log = getLogger(lookup().lookupClass());
    WebDriver driver;
    @Test
    public void creditCustomerTest(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.addArguments("--incognito");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        WebDriverManager wdm = WebDriverManager.chromedriver().watch();
//        driver = wdm.create();
        wdm.clearDriverCache();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admin:1nfr4.m4rk3t@web.inframarket.cloud/credit/applications");

        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7908071774");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Digit 6']")).sendKeys("123456");
        String title = driver.getTitle();
        System.out.println(title);

        }
    }

//        driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")).sendKeys("1");
//        driver.findElement(By.xpath("//input[@aria-label='Digit 2']")).sendKeys("2");
//        driver.findElement(By.xpath("//input[@aria-label='Digit 3']")).sendKeys("3");
//        driver.findElement(By.xpath("//input[@aria-label='Digit 4']")).sendKeys("4");
//        driver.findElement(By.xpath("//input[@aria-label='Digit 5']")).sendKeys("5");
//        driver.findElement(By.xpath("//input[@aria-label='Digit 6']")).sendKeys("6");