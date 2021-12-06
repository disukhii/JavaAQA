import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.EditAccountBO;
import Selenium.opencart.bo.LoginBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;

public class EditAccount extends BaseTest{
    @Test
    public void editAccount() {
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
