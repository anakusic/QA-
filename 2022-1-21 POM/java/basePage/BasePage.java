package basePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.Logedinpage;
import page.Loginpage;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Loginpage loginpage;
    public Logedinpage logedin;


    @BeforeClass
    public void setUp () {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginpage = new Loginpage(driver,wdwait);
        logedin = new Logedinpage(driver,wdwait);


    }

    @AfterClass
    public void tearDown () {

        driver.close();
        driver.quit();


    }



}
