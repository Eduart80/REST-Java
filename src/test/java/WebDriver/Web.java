package WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {

    private static WebDriver driver;

    @Before
    public void inDriver(){
        System.setProperty("webdriver.chrome.driver","./chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://gorest.co.in/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }
    //@After
    public void quitDriver(){
        driver.quit();
    }

}
