package webdriverbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
    	
    	
    	/*
    	 * 
    	 * 1 - DriverManager() can be used to automate the browser binary setup instead of calling setProperty for manual effort.
    	 * Else Selenium 4 or above can be used to initialize with the single line
    	 * WebDriver driver =new ChromerDriver(); 
    	 * 
    	 * 
    	 * 
    	 * 2 -  Driver instance is not generic, only defined for Chrome browser. Broswer variable should be passed as an input and based on the input browser should be instantiated.
    	 * Different browser driver implementation is missing
    	 * 
    	 */
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\D drive\\automation\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


