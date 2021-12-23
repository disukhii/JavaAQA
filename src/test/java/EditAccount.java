import Selenium.parallel_run.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.EditAccountBO;
import Selenium.opencart.bo.LoginBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;
import Base.BaseTCDriver;

public class EditAccount extends BaseTCDriver{
    @Test(dataProvider = "browserDataProvider")
    public void editAccount(String nameBrowser) {
        BrowserFactory.initDriver(nameBrowser);
        LoginBO loginBO = new LoginBO();
        EditAccountBO editAccountBO = new EditAccountBO();
        String login= (String) new PropertyUtil().getProperty("login");
        String pass= (String) new PropertyUtil().getProperty("pass");
        loginBO.login(login, pass);

        String firstname= (String) new PropertyUtil().getProperty("firstname");
        String lastname= (String) new PropertyUtil().getProperty("lastname");
        String phonenumber= (String) new PropertyUtil().getProperty("phonenumber");
        Assert.assertTrue(editAccountBO.editAccount(firstname,lastname, phonenumber));
    }
}
