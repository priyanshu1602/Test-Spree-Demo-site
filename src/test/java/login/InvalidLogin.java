package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidLogin {
    @Test
    public void InvalidLoginIntoSpree()
    {
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        //Click on loin button
        driver.findElement(By.id("link-to-login")).click();
        //Enter email
        driver.findElement(By.id("spree_user_email")).sendKeys("Priya@gmail");
        //enter password
        driver.findElement(By.id("spree_user_password")).sendKeys("priyu@123");
        //Click login
        driver.findElement(By.xpath("//*[@id='new_spree_user']/p[2]/input")).click();
        //After login page
        driver.findElement(By.xpath("//*[@id='content']/div[1]")).getText();
        driver.close();
    }
}
