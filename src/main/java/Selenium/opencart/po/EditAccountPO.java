package Selenium.opencart.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class EditAccountPO {
    WebDriver driver;
    public EditAccountPO(WebDriver driver) {
        this.driver=driver;
    }

    public void selectEditAccount() {
        WebElement editAccountLink=driver.findElement(By.xpath("//*[@id='content']/ul[1]/li[1]/a"));
        editAccountLink.click();
    }
    public void inputFirstName(String name) {

        WebElement fsName=driver.findElement(By.xpath("//*[@id='input-firstname']"));

        WebElement waiterResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(fsName));
        waiterResult.clear();
        waiterResult.sendKeys(name);
    }
    public void inputLastName(String name) {

        WebElement lsName=driver.findElement(By.xpath("//*[@id='input-lastname']"));

        WebElement waiterResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(lsName));
        waiterResult.clear();
        waiterResult.sendKeys(name);
    }
    public void inputPhoneNumber(String number) {

        WebElement num=driver.findElement(By.xpath("//*[@id='input-telephone']"));

        WebElement waiterResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(num));
        waiterResult.clear();
        waiterResult.sendKeys(number);
    }

    public void submitButton() {
        WebElement submit=driver.findElement(By.xpath("//*[@id='content']/form/div/div[2]/input"));
        submit.click();
    }

    public String alertSuccess(){
        WebElement text=driver.findElement(By.xpath("//*[@id='account-account']/div[1]"));
        text.getText();
        return text.toString();
    }
}
