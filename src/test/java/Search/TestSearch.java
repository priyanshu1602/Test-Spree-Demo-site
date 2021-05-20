package Search;

import constants.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSearch extends BaseTest {
    @Test
    public void searchItemAndAddToCart() throws InterruptedException
    {
        WebElement login=driver.findElement(By.id("link-to-login"));
        login.click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("link-to-login")));
        driver.findElement(By.xpath("//*[@id='spree_user_email']")).sendKeys("Priya1@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("priyu@123");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.id("keywords")).sendKeys("shirt");
        driver.findElement(By.xpath("//*[@id=\"product_5\"]/div/div[1]/a/img")).click();
        //*[@id="product_5"]/div/div[1]/a/img

        WebElement cart=driver.findElement(By.id("add-to-cart-button"));
        cart.click();
        //WebDriverWait wait1=new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
        WebElement logout=driver.findElement(By.xpath("//*[@id=\"nav-bar\"]/li[2]/a"));
        logout.click();
        WebDriverWait wait2=new WebDriverWait(driver,10);
        wait2.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
    }
}