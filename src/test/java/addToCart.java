import org.testng.Assert;
import org.testng.annotations.Test;
import Selenium.opencart.bo.AddToCartBO;
import test_helper.BaseTest;
import PropertyUtil.PropertyUtil;

public class addToCart extends BaseTest{
    @Test
    public void addCart() {
        AddToCartBO addToCartBO = new AddToCartBO();
        String qty= (String) new PropertyUtil().getProperty("qty");

        Assert.assertTrue(addToCartBO.cart(qty));
    }
}
