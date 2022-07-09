import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SelenideConditional {
    public static void main(String[] args) {
//        Configuration.holdBrowserOpen=true;
        open("https://opensource-demo.orangehrmlive.com/");
        SelenideElement $ = $(By.xpath("//span[normalize-space()='Username']"));
        if($.isDisplayed()){
            System.out.println($.getText()+"Blank space");
        }else {
            System.out.println("nothing");
        }
    }
}
