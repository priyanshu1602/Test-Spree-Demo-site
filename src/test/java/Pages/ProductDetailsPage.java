package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductDetailsPage  extends header{
    private WebDriver driver;

    @FindBys(@FindBy(className ="List-group-item"))
    private WebElement similarItemL;

    public  ProductDetailsPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void selectSimilarItems(String itemName)
    {
        List<WebElement>similarItems=driver.findElements(By.className("list-group-item"));
        for(WebElement sItem:similarItems){
            if(sItem.getText().equalsIgnoreCase(itemName)){
                sItem.click();
            }
        }
    }
}
