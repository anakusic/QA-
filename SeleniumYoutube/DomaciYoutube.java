package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DomaciYoutube {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com/");

        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("Rick Astley - Never Gonna Give You Up (Official Music Video)");

        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        Thread.sleep(2000);

        WebElement song = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)"));
        song.click();

        String actualURL = driver.getCurrentUrl();

        String expectedURL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";

        Assert.assertEquals(expectedURL, actualURL);






    }


}
