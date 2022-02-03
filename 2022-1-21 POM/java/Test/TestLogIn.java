package Test;

import basePage.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Logedinpage;
import page.Loginpage;

public class TestLogIn extends BasePage {


    @BeforeMethod
    public void setUpPage () {

        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

    }

    @Test
    public void positiveLogIn () {

        //WebElement textUser = driver.findElement(By.id("login_credentials"));
        //String username = textUser.getText();
        //WebElement textPass = driver.findElement(By.id("login_password"));
        //String pass = textPass.getText();

        //ovo je bila neka zamisao za preuzimanje teksta kredencijala sa web strane. Na ovaj nacin mi preuzme
        //i sve username i password, ali cak i tekst naslvova. Ja te molim da na slack-u dobijem neki hint, kako
        //se to moze resiti.
        //Da sam uspela da prnadjem nacin koji radi, plan je bio da web element textUser i textPas ne bude ovde vec
        // u Loginpage-u, a u testu samo kreirala String username i pass, koji se dobijaju preuzimanjem teksta
        //sa zadatok web elementa.

        String username = "standard_user";
        String pass = "secret_sauce";

        loginpage.insertUsername(username); //metoda iz Loginpage
        loginpage.insertPass(pass);//metoda iz Loginpage
        loginpage.clickLogin();//metoda iz Loginpage

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualUrl,expectedUrl);

        Assert.assertTrue(logedin.getAddToCart().isDisplayed()); //iz logedin page








    }


}
