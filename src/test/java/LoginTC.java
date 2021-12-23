import Selenium.parallel_run.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.LoginBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;
import Base.BaseTCDriver;

public class LoginTC extends BaseTCDriver{

    @Test(dataProvider = "browserDataProvider")
    public void loginTest(String browserName){
        BrowserFactory.initDriver(browserName);
        LoginBO loginBO = new LoginBO();
        String login= (String) new PropertyUtil().getProperty("login");
        String pass= (String) new PropertyUtil().getProperty("pass");

        Assert.assertTrue(loginBO.login(login,pass));
    }

}