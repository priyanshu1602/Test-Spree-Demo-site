package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void testLoginIntoSpree() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        //WebElement login_icon= driver.findElement(By.id("link-to-login"));
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("link-to-login")));
        //Click on login
        WebElement login_icon= driver.findElement(By.id("link-to-login"));
        login_icon.click();

    }
}
