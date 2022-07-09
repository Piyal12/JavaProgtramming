import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

@Test
public class SelenideDemo {
    public void flipkartScenario() {

//        Configuration.browser="chrome";
//        Configuration.browserSize="1024x768";
//        Configuration.headless=true;
//        Configuration.baseUrl="";
        Configuration.screenshots = false;
//        Configuration.timeout=10000;
        open("https://www.flipkart.com/");
        System.out.println("1. Flipkart Page opened");
//        WebDriverRunner.clearBrowserCache();
        $(By.xpath("//button[contains(.,'✕')]")).click();
        System.out.println("2. Close the popup");
        $(By.xpath("//*[@class='xtXmba'][normalize-space()='Top Offers']")).click();
        System.out.println("3. Click on top offers");
        $(By.xpath("//*[normalize-space()='Deals of the Day']")).shouldHave(appear);
        System.out.println("4. Validate deals of the day text message");
//        WebElement link = $(By.xpath("//h3[normalize-space()='Books, & Hobby Picks']"));
        WebElement guiterLink = $(By.xpath("//*[normalize-space()='Acoustic Guitars']"));
//        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);", link);
        guiterLink.click();
        System.out.println("5. scroll and click the last guiter link");
        WebElement secDrop = $(By.xpath("(//*[contains(@class,'FdLqY')])[2]"));
        actions().dragAndDropBy(secDrop, -50, 0).build().perform();
        System.out.println("6. Drag and drop the price button");
        WebElement ele = $(By.xpath("//div[contains(@class,'oc-S')]//a[2]"));
        ele.click();
        System.out.println("7. click on the 1st guiter link");
        switchTo().window(1);
        System.out.println("8. switch to new window");
        System.out.println(title());
        $(By.xpath("//ul[@class='row']//button")).click();
        System.out.println("9. click on Add to Cart button");
    }
}
