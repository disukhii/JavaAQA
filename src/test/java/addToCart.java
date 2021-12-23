import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.AddToCartBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;
import Selenium.parallel_run.BrowserFactory;
import Base.BaseTCDriver;

public class addToCart extends BaseTCDriver{
    @Test(dataProvider = "browserDataProvider")

     public void addCart(String browserName) {

        BrowserFactory.initDriver(browserName);
        AddToCartBO addToCartBO = new AddToCartBO();
        String qty= (String) new PropertyUtil().getProperty("qty");
        Assert.assertTrue(addToCartBO.cart(qty));
    }
}
