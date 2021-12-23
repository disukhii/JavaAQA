import Selenium.parallel_run.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.LoginBO;
import Selenium.opencart.bo.LogoutBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;
import Base.BaseTCDriver;
public class Logout extends BaseTCDriver{
    @Test(dataProvider = "browserDataProvider")
    public void logout(String browserName) {
        BrowserFactory.initDriver(browserName);
        LoginBO loginBO = new LoginBO();
        String login= (String) new PropertyUtil().getProperty("login");
        String pass= (String) new PropertyUtil().getProperty("pass");
        loginBO.login(login,pass);
        LogoutBO logoutBO = new LogoutBO();
        Assert.assertTrue(logoutBO.logout());
    }
}
