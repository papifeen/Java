import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class driveListen {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/papifeen/Desktop/Chrome Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies(); //delete cookies

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://driveandlisten.herokuapp.com/");

        // search box xpath //div[@id='buttonBox']
        // list xpath //div[@id='buttonBox']//ol//li

        List<WebElement> list = driver.findElements(By.xpath("//div[@id='buttonBox']//ol//li"));
        System.out.println(list.size());

        for(int i= 0; i<list.size(); i++){
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().contains("Curitiba")){

        Thread.sleep(2000);
            list.get(i).click();
            break;

            }
        }
    }
}
