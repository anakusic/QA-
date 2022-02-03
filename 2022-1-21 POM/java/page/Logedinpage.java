package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logedinpage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement addToCart;


    public Logedinpage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getAddToCart() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
}
