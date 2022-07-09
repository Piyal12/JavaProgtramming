import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
public class MyntraScenario {
    @Test
    public void myntraSnenario() throws InterruptedException {
        open("https://www.myntra.com/");
        SelenideElement men=$(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));
        actions().moveToElement(men).build().perform();
        ElementsCollection menuList=$$(By.xpath("//div[@class='desktop-categoryContainer']/li//a"));
        List actualList=new ArrayList();
//        System.out.println("With space Links : "+menuList.size());
//        menuList.stream().filter(e->!e.getText().isBlank()).forEach(e-> System.out.println(e.getText()));
        menuList.stream().filter(e->!e.getText().isBlank()).forEach(e->actualList.add(e.getText()));
        System.out.println(actualList);
        List tempList;
        tempList=actualList;
        Collections.sort(tempList);
        System.out.println(tempList);
    }
}
