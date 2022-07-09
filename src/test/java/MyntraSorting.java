import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class MyntraSorting {
    @Test
    public void myntraSnenario() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.myntra.com/");
        WebElement mousehover = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));
        Actions act = new Actions(driver);
        act.moveToElement(mousehover).build().perform();
        List actualList = new ArrayList();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='desktop-categoryContainer']/li//a"));
        list.stream().filter(e -> !e.getText().isBlank()).forEach(e -> actualList.add(e.getText()));
//        list.stream().filter(e -> !e.getText().isBlank()).forEach(r-> System.out.println(r.getText()));
        Stream<WebElement> sorted = list.stream().filter(f -> !f.getText().isBlank()).collect(Collectors.toList()).stream().sorted();

//        System.out.println(actualList);

//        List tempList;
//        tempList = actualList;
//        Collections.sort(tempList);
//        System.out.println(tempList);
        driver.close();


    }
}
