import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.LoginBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;


public class LoginTC extends BaseTest {

    @Test
    public void loginTest() {
        LoginBO loginBO = new LoginBO();
        String login= (String) new PropertyUtil().getProperty("login");
        String pass= (String) new PropertyUtil().getProperty("pass");;

        Assert.assertTrue(loginBO.login(login,pass));
    }



}