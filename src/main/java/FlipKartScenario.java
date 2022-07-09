import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class FlipKartScenario {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
        driver.findElement(By.xpath("//*[@class='xtXmba'][normalize-space()='Top Offers']")).click();
        WebElement dealsText = driver.findElement(By.xpath("//*[normalize-space()='Deals of the Day']"));
        System.out.println(dealsText.getText());
        WebElement link = driver.findElement(By.xpath("//h3[normalize-space()='Books, & Hobby Picks']"));
        WebElement guiterLink = driver.findElement(By.xpath("//*[normalize-space()='Acoustic Guitars']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", link);
        guiterLink.click();
        WebElement secDrop = driver.findElement(By.xpath("(//*[contains(@class,'FdLqY')])[2]"));
        Actions act = new Actions(driver);
        act.dragAndDropBy(secDrop, -200, 0).build().perform();
        WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'oc-S')]//a[2]"));
        try {
            ele.click();
        } catch (Exception e) {
            ele = driver.findElement(By.xpath("//div[contains(@class,'oc-S')]//a[2]"));
            ele.click();

        }
        String mainID = driver.getWindowHandle();
        Set<String> allWinID = driver.getWindowHandles();
        for (String iD : allWinID) {
            if (!iD.equalsIgnoreCase(mainID)) {
                driver.switchTo().window(iD);
                driver.findElement(By.xpath("//ul[@class='row']//button")).click();
            }
        }
    }
}
