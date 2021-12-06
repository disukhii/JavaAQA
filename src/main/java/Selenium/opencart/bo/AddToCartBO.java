package Selenium.opencart.bo;

import Selenium.opencart.po.AddToCartPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import Selenium.Driver;
import org.testng.Assert;

public class AddToCartBO {

    @Step
    public boolean cart(String qty) {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("http://localhost/index.php?route=common/home");
        AddToCartPO addToCartPO = new AddToCartPO(driver);
        addToCartPO.selectMacBook();
        addToCartPO.inputQty(qty);
        addToCartPO.addToCartButton();
        addToCartPO.openCart();
        addToCartPO.viewCartButton();
       /* Assert.assertEquals(addToCartPO.cartPage(), "Shopping Cart\n" +
                "                 (0.00kg)\n" +
                "         "); */
        return true;
    }

}
