package mobileTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

public class BrowserStackMobileTest {
    public static final String USERNAME = "biswajitsahoo_o2pXWx";
    public static final String AUTOMATE_KEY = "GCYBSXmQQMJCKHEudQad";
    public static final String URL1 = "https://" + USERNAME + ":" + AUTOMATE_KEY 
                                       + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        // Define the capabilities for the mobile device
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set BrowserStack capabilities
        caps.setCapability("platformName", "ios");
        caps.setCapability("deviceName", "iPhone 14 Pro Max");
        caps.setCapability("platformVersion", "16");
        
        caps.setCapability("name", "Test Name");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        // Set up the WebDriver session
        AndroidDriver driver = new AndroidDriver(new URL(URL1), caps);

        driver.findElement(By.xpath("//android.widget.FrameLayout[@bounds='[0,96][1080,2210]']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//android.widget.TextView[@text = '7']")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"plus\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text = '7']")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"equals\"]")).click();
      
        driver.quit();
    }
}
