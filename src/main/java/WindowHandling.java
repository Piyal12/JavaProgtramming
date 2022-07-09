import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> twoId = driver.getWindowHandles();
        Iterator<String> it = twoId.iterator();
        while (it.hasNext()){
            String win1= it.next();//1st Window
            String win2=it.next();//2nd window
            driver.switchTo().window(win2);
            driver.findElement(By.xpath("//a[@href='/service-and-support/']")).click();
            Set<String> threeId = driver.getWindowHandles();
            Iterator<String> it1 = threeId.iterator();
            String win11= it1.next();//1st window
            String win22= it1.next();//2nd window
            String win33= it1.next();//2nd window
            driver.switchTo().window(win33);
            System.out.println(driver.getTitle());
            System.out.println(driver.findElement(By.xpath("//div[@class='service-sup-main-content']")).getText());
        }
    }
}

