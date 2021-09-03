package pl.tmobile.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.tmobile.pages.TMobileMainPage;
import pl.tmobile.pages.TMobilePopupPage;

public class TestBase {
    String url = "https://www.t-mobile.pl/";

    WebDriver driver;
    public TMobileMainPage tMobileMainPage;
    public TMobilePopupPage tMobilePopupPage;

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        tMobileMainPage = new TMobileMainPage(driver);
        tMobilePopupPage = new TMobilePopupPage(driver);
    }

    @BeforeEach
    void openSession(){
        setup();
        driver.get(url);
        driver.manage().window().maximize();
    }

    /*@AfterEach
    void closeSession(){
        driver.quit();
        System.out.printf("session is closed");
    }*/
}
