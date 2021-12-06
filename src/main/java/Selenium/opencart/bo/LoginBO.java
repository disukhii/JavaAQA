package Selenium.opencart.bo;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import Selenium.Driver;
import Selenium.opencart.po.LoginPO;
import org.testng.Assert;

public class LoginBO {

    @Step
    public boolean login(String login, String pass) {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("http://localhost/index.php?route=common/home");
        LoginPO loginPO= new LoginPO(driver);
        loginPO.selectMyAccount();
        loginPO.selectLogin();
        loginPO.inputEmail(login);
        loginPO.inputPassword(pass);
        loginPO.submit();
        Assert.assertEquals(loginPO.myAccountPage(), "My Account");
        return true;
    }
}