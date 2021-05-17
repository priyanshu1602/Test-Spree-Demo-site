package Add;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItem {
    @Test
    public void AddItemToCart()
    {
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        //search item
        driver.findElement(By.id("keywords")).sendKeys("Ruby on Rails Baseball Jersey");
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='keywords']")));
        //click on search
        driver.findElement(By.xpath("//*[@id='keywords']")).click();
        //select item
        driver.findElement(By.xpath("//*[@id='product_3']/div/div[1]/a/span")).click();
        //add no of items
        driver.findElement(By.id("quantity")).sendKeys("1");
        //Add variants
        driver.findElement(By.xpath("//*[@id='product-variants']/ul/li[1]/label/span")).click();
        //add to cart
        driver.findElement(By.id("add-to-cart-button")).click();
        //driver.findElement(By.xpath("//*[@id='content']/div/h1")).equals("Shopping Cart");
        //String actual_message=driver.findElement(By.xpath("//*[@id='checkout-link']")).getText();
        //System.out.println(actual_message);
        //String expected_message="Checkout";
        //Assert.assertEquals(actual_message,expected_message);
        driver.close();
    }

}
