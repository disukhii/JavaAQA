package Selenium.opencart.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactUsPO {
    WebDriver driver;
    public ContactUsPO(WebDriver driver) {
        this.driver=driver;
    }
    public void selectContactUs() {
        WebElement contact=driver.findElement(By.xpath("//*[@id='top-links']/ul/li[1]/a"));
        contact.click();
    }
    public void submitButton() {
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input"));
        submit.click();
    }
    public String exceptionMessageName(){
        WebElement name=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/div/div"));
        name.getText();
        return name.toString();
    }
    public String exceptionMessageEmail(){
        WebElement email=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[2]/div/div"));
        email.getText();
        return email.toString();
    }
    public String exceptionMessageEnquiry(){
        WebElement enquiry=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[3]/div/div"));
        enquiry.getText();
        return enquiry.toString();
    }
    public void inputName(String names){
        WebElement name=driver.findElement(By.xpath("//*[@id='input-name']"));
        name.sendKeys(names);
    }
    public void inputEmail(String emails){
        WebElement email=driver.findElement(By.xpath("//*[@id='input-email']"));
        email.sendKeys(emails);
    }
    public void inputEnquiry(String enquirys){
        WebElement enquiry=driver.findElement(By.xpath("//*[@id='input-enquiry']"));
        enquiry.sendKeys(enquirys);
    }
    public void buttonContinue(){
        WebElement button=driver.findElement(By.xpath("//*[@id='content']/div/div/a"));
        button.click();
    }

}
