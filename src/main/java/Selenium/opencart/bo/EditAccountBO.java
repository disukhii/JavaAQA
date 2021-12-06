package Selenium.opencart.bo;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import Selenium.Driver;
import Selenium.opencart.po.EditAccountPO;
import org.testng.Assert;

public class EditAccountBO {
    @Step
    public boolean editAccount(String name, String lastname, String phoneNumber) {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("http://localhost/index.php?route=account/account");
        EditAccountPO editAccountPO= new EditAccountPO(driver);
        editAccountPO.selectEditAccount();
        editAccountPO.inputFirstName(name);
        editAccountPO.inputLastName(lastname);
        editAccountPO.inputPhoneNumber(phoneNumber);
        editAccountPO.submitButton();
        //Assert.assertEquals(editAccountPO.alertSuccess(), " Success: Your account has been successfully updated.");
        return true;
    }
}
