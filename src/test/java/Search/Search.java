package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Search {
    @Test
    public void testSearch()
    {
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        WebDriverWait wait=new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search-bar']/form/input[2]")));
        //Search item in Search box
        driver.findElement(By.id("keywords")).sendKeys("Ruby on Rails Baseball Jersey");
        //Click on search button
        driver.findElement(By.xpath("//*[@id='search-bar']/form/input[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search-bar']/form/input[2]")));
        driver.close();
    }
}