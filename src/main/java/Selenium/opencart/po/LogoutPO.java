package Selenium.opencart.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class LogoutPO {
    WebDriver driver;
    public LogoutPO(WebDriver driver) {
        this.driver=driver;
    }

    //*[@id="top-links"]/ul/li[2]/a
    public void selectMyAccount() {
        WebElement myAccount=driver.findElement(By.xpath("//*[@title='My Account']"));
        myAccount.click();
    }
    public void selectLogout() {
        WebElement logout=driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]/a"));
        logout.click();
    }
    public String titleAccountLogout() {
        WebElement text=driver.findElement(By.xpath("//*[@id='content']/h1"));
        text.getText();
        return text.toString();
    }
    public void continueButton() {
        WebElement submit=driver.findElement(By.xpath("//*[@id='content']/div/div/a"));
        submit.click();
    }
    public void selectLogin() {

        WebElement login=driver.findElement(By.xpath("//a[@href='http://localhost/index.php?route=account/login']"));
        login.click();
    }

}
