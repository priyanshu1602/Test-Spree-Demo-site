package Pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class header {
    private   WebDriver driver;

    @FindBy(css=".alert")
    private WebElement loginMessage;

    public header(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickLoginButton()
    {
        driver.findElement(By.id("link-to-login")).click();

    }
    public String getLoginMessage()
    {
        WebDriverWait wait=new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        wait.until(ExpectedConditions.visibilityOf(loginMessage));
        return loginMessage.getText();
    }
    public void clickLogoutButton()
    {
       driver.findElement(By.linkText("Logout")).click();
    }
}
