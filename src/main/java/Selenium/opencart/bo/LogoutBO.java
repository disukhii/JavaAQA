package Selenium.opencart.bo;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import Selenium.Driver;
import Selenium.opencart.po.LogoutPO;
import org.testng.Assert;
public class LogoutBO {
    @Step
    public boolean logout() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("http://localhost/index.php?route=common/home");
        LogoutPO logoutBO= new LogoutPO(driver);
        logoutBO.selectMyAccount();
        logoutBO.selectLogout();
        //Assert.assertEquals(logoutBO.titleAccountLogout(), "Account Logout");
        logoutBO.continueButton();
        logoutBO.selectMyAccount();
        logoutBO.selectLogin();
        return true;
    }
}
