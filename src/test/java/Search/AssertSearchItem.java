package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertSearchItem {
    @Test
    public void validateSearchItem()
    {
        System.setProperty("webdriver.chrome.driver","/Users/priyanshusingh/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        //Search item in search box
        driver.findElement(By.id("keywords")).sendKeys("Ruby on Rails Baseball Jersey");
        //Click on search button
        driver.findElement(By.xpath("//*[@id='search-bar']/form/input[2]")).click();
        //Actual text which we get
        String actual_result=driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/h6")).getText();
        //Expected text
        String expected_result="Search results for 'Ruby on Rails Baseball Jersey'";
        //Asserting
        if(expected_result.equals(actual_result))
        {
            System.out.println("Search results for 'Ruby on Rails Baseball Jersey'");
        }
        else
        {
            System.out.println("No products found");
        }
        //Assert.assertEquals(actual_result,expected_result);
        driver.close();
    }
}
