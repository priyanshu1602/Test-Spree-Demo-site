package constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void  setup()
    {
        String chromedriverPath=System.getProperty("user.dir")+"/chromedriver";
        System.setProperty("webdriver.chrome.driver",chromedriverPath);
        driver=new ChromeDriver();
        driver.get(Constants.BASE_URL);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
