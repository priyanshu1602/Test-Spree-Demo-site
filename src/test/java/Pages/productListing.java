package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productListing extends header{

    private WebDriver driver;

    public productListing(WebDriver driver,WebDriverWait wait)
    {
        super(driver);
        this.driver=driver;
    }
}