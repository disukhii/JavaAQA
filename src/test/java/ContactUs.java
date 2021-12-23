import Selenium.parallel_run.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.ContactUsBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;
import Base.BaseTCDriver;
public class ContactUs extends BaseTCDriver{
    @Test(dataProvider = "browserDataProvider")
    public void contactUs(String browserName) {

        BrowserFactory.initDriver(browserName);
        ContactUsBO contactUsBO = new ContactUsBO();
        String name= (String) new PropertyUtil().getProperty("name");
        String email= (String) new PropertyUtil().getProperty("email");
        String enquiry= (String) new PropertyUtil().getProperty("enquiry");
        Assert.assertTrue(contactUsBO.contact(name, email, enquiry));
    }
}
