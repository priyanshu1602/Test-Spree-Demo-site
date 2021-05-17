package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginAndLogout {
    @Test
    public void testLogin(){
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();//INSTANSE
        driver.get("https://spree-vapasi.herokuapp.com/");
        //Click on login button
        WebElement loginIcon=driver.findElement(By.id("link-to-login"));
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("link-to-login")));
        loginIcon.click();
        //Enter email in email textbox
        driver.findElement(By.id("spree_user_email")).sendKeys("Priya1@gmail.com");
        //Enter password in password textbox
        driver.findElement(By.id("spree_user_password")).sendKeys("priyu@123");
        //click on login button
        WebElement loginButton=driver.findElement(By.name("commit"));
        loginButton.click();
        //click on logout button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
        WebElement logout_icon=driver.findElement(By.xpath("//*[@id=\"nav-bar\"]/li[2]/a"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
        logout_icon.click();
        driver.close();
    }

}
