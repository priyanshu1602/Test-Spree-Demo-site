package login_to_spree;

import Pages.Login;
//import UserActions.Common;
import constants.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
public class LoginAndLogout extends BaseTest {
    @Parameters({"email"})
    @Test
    public void testValidLoginAndLogout(){
        Login login=new Login(driver);
        login.clickLoginButton();
        login.as("Priya1@gmail.com","priyu@123");
        Assert.assertEquals(login.getLoginMessage(),"Logged in successfully","Validate successful message");
    }
}
