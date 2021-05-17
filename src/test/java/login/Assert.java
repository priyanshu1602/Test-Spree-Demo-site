package login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assert {
    @Test
    public void validate_login(){
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        //Click on login
        driver.findElement(By.id("link-to-login")).click();
        //enter email
        driver.findElement(By.xpath("//*[@id='spree_user_email']")).sendKeys("Priya1@gmail.com");
        //enter password
        driver.findElement(By.id("spree_user_password")).sendKeys("priyu@123");
        //check remember me box
        driver.findElement(By.xpath("//*[@id='spree_user_remember_me']")).click();
        //click login button
        driver.findElement(By.xpath("//*[@id='new_spree_user']/p[2]/input")).click();
        //actual message
        String actual_message=driver.findElement(By.xpath("//*[@id='content']/div[1]")).getText();
        System.out.println(actual_message);
        //expected message
        String expected_message="Logged in successfully";
        org.testng.Assert.assertEquals(actual_message,expected_message);
        driver.close();
    }
}
