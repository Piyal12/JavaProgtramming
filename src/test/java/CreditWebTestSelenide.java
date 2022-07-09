import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SimpleReport;
import im.com.SelenideElement1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CreditWebTestSelenide {
    SimpleReport report = new SimpleReport();
    @Test
    public void creditCustomerTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl="https://admin:1nfr4.m4rk3t@web.inframarket.cloud";
        Configuration.screenshots=false;
//        open("credit/applications");
        open("/");
        $(By.xpath("//div[@id='root']//*[name()='svg'][contains(@class,'Svg')]")).shouldHave(Condition.cssValue("font-size","24px"));
        $(By.xpath("//div[@id='root']//*[text()='Phoenix']")).shouldHave(Condition.cssValue("font-size","20px"));
        $(By.xpath("//div[@id='root']//*[contains(text(),'Login to your Account')]")).shouldHave(Condition.cssValue("font-size","12px"));
        SelenideElement phTf = $(By.xpath("//input[@name='phoneNumber']"));
        phTf.shouldHave(Condition.cssValue("font-size","16px"));
        phTf.click();
        SelenideElement loginBtn = $(By.xpath("//button[normalize-space()='Login']"));
        loginBtn.shouldHave(Condition.cssValue("font-size","15px")).click();
        $(By.xpath("//input[@aria-label='Digit 2']")).setValue("123456");

        String title = title();
        System.out.println(title);
    }

}
