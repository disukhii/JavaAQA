package Selenium.opencart.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPO {
    WebDriver driver;
    public LoginPO(WebDriver driver) {
        this.driver=driver;
    }

    public void selectMyAccount() {

        WebElement myAccount=driver.findElement(By.xpath("//*[@title='My Account']"));
        myAccount.click();
    }
    public void selectLogin() {

        WebElement login=driver.findElement(By.xpath("//a[@href='http://localhost/index.php?route=account/login']"));
        login.click();
    }
    public void inputEmail(String login) {

        WebElement emailInput=driver.findElement(By.xpath("//*[@id='input-email']"));

        WebElement waiterResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(emailInput));

        waiterResult.sendKeys(login);
    }

    public void inputPassword(String pass) {
        WebElement passwordInput=driver.findElement(By.xpath("//*[@id='input-password']"));

        WebElement waiterResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(passwordInput));

        waiterResult.sendKeys(pass);
    }

    public void submit() {
        WebElement buttonSubmit=driver.findElement(By.xpath("//*[@value='Login']"));
        buttonSubmit.click();
    }
    public String myAccountPage() {
        WebElement textMyAccount=driver.findElement(By.xpath("//*[@id='content']/h2[1]"));
        textMyAccount.getText();
        return textMyAccount.toString();
    }
}