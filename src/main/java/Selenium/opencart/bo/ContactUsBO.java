package Selenium.opencart.bo;

import Selenium.opencart.po.ContactUsPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import Selenium.Driver;
import org.testng.Assert;

public class ContactUsBO {
    @Step
    public boolean contact(String name, String email, String enquiry) {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("http://localhost/index.php?route=common/home");
        ContactUsPO contactUsPO = new ContactUsPO(driver);
        contactUsPO.selectContactUs();
       /* contactUsPO.submitButton();
        Assert.assertEquals(contactUsPO.exceptionMessageName(), "Name must be between 3 and 32 characters!");
        Assert.assertEquals(contactUsPO.exceptionMessageEmail(), "E-Mail Address does not appear to be valid!");
        Assert.assertEquals(contactUsPO.exceptionMessageEnquiry(), "Enquiry must be between 10 and 3000 characters!"); */
        contactUsPO.inputName(name);
        contactUsPO.inputEmail(email);
        contactUsPO.inputEnquiry(enquiry);
        contactUsPO.submitButton();
        contactUsPO.buttonContinue();

        return true;
    }
}
