package Selenium.opencart.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class AddToCartPO {
    WebDriver driver;
    public AddToCartPO(WebDriver driver) {
        this.driver=driver;
    }

    public void selectMacBook() {
        WebElement mcBookImage=driver.findElement(By.xpath("//*[@src='http://localhost/image/cache/catalog/demo/macbook_1-200x200.jpg']"));
        mcBookImage.click();
    }
    public void inputQty(String qty) {

        WebElement nmQty=driver.findElement(By.xpath("//*[@id='input-quantity']"));

        WebElement waiterResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(nmQty));

        waiterResult.clear();
        waiterResult.sendKeys(qty);
    }

    public void addToCartButton() {

        WebElement submit=driver.findElement(By.xpath("//*[@id='button-cart']"));
        submit.click();
    }

    public void openCart() {

        WebElement cart=driver.findElement(By.xpath("//*[@id='cart']/button"));
        cart.click();
    }

    public void viewCartButton(){

        WebElement viewCart=driver.findElement(By.xpath("//*[@title='Shopping Cart']"));
        viewCart.click();
    }

    public String cartPage(){
        WebElement titleCartPage=driver.findElement(By.xpath("//*[@id='content']/h1"));
        titleCartPage.getText();
        return titleCartPage.toString();
    }
}
