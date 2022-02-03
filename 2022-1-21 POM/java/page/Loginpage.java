package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement username;
    WebElement password;
    WebElement loginButton;

    //konstruktor
    public Loginpage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    //geteri
    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    //------------------------------------------------------------

    //metoda username-a
    public void insertUsername (String validUsername) {

        this.getUsername().sendKeys(validUsername);

    }

    //metoda passworda
    public void insertPass (String validPass) {

        this.getPassword().sendKeys(validPass);

    }

    //metoda kliktanja login
    public void clickLogin () {

        this.getLoginButton().click();

    }
}
