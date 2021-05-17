package login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin
{
    @Test
    public void testValidLogin()
    {
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        //click on login
        driver.findElement(By.xpath("//*[@id='link-to-login']/a")).click();
        //enter email
        driver.findElement(By.id("spree_user_email")).sendKeys("Priya@gmail.com");
        //enter password
        driver.findElement(By.id("spree_user_password")).sendKeys("priyu@123");
        //check box remember me(optional)
        driver.findElement(By.xpath("//*[@id='spree_user_remember_me']")).click();
        //Click on login button
        driver.findElement(By.xpath("//*[@id='new_spree_user']/p[2]/input")).click();
        //content page
        driver.findElement(By.xpath("//*[@id='content']/div[1]")).getText();
        driver.close();
    }

}
