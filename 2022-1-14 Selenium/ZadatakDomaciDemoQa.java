package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ZadatakDomaciDemoQa {
    ////Zadatak 3 - Ulogovati se na
    // sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(10)); //na kraju ga nisam iskoristila
        //nisam skroz obnovila kako funkcionise, a kasnicu sa domacim, pa cu to naknadno doraditi.
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");


        WebElement bookStore = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]"));
        bookStore.click(); //prvo sam pokusala preko class, ali ne pronalazi mi na taj nacin jer se
        // podudara sa svim ostalim ovim skecijama. Nisam uspela da se snadjem drugacije sem preko xpath;

        Thread.sleep(2000);

        WebElement logInButton = driver.findElement(By.id("login"));
        logInButton.click();
        Thread.sleep(2000);


        Cookie userKolacic = new Cookie("userName", "anakusic");
        driver.manage().addCookie(userKolacic);
        driver.navigate().refresh();

        Cookie idKolacic = new Cookie("userID", "79e208b4-d6ff-4a4a-8cc4-cc0ded564eb6");
        driver.manage().addCookie(idKolacic);
        driver.navigate().refresh();

        Cookie expiresKolacic = new Cookie("expires", "2022-01-23T14%3A48%3A25.614Z");
        driver.manage().addCookie(expiresKolacic);
        driver.navigate().refresh();

        Cookie tokenKolacic = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImFuYWt1c2ljIiwicGFzc3dvcmQiOiJRd2VydHkxMjMhQCMiLCJpYXQiOjE2NDIzNDQ1MDV9.zIIwn7WAYp35vEq4H0yOGwLMXTQrDi7qz9l-jx7dpvg");
        driver.manage().addCookie(tokenKolacic);
        driver.navigate().refresh();

        //prvo sam otvorila stranicu i tamo pogledala koji su kolacicii pre logovanja, zatim sam se ulogovala,
        //ponovo pogledala kolacice i oni koji su se razlikovali sam umetnula u zadatak

        driver.navigate().to("https://demoqa.com/profile");
        Thread.sleep(2000);

        WebElement logOut = driver.findElement(By.id("submit"));
        logOut.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demoqa.com/login";

        Assert.assertEquals(actualUrl, expectedUrl);

        Assert.assertTrue(logInButton.isDisplayed());

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();


















    }

}
