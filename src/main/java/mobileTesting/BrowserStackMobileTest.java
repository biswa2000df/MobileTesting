package mobileTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "OnePlus 9"); // Example device
        caps.setCapability("platformVersion", "11"); // Example version

        caps.setCapability("name", "Test Name");
//        caps.setCapability("appPackage", "com.zinghr.app");
//        caps.setCapability("appActivity", "com.zinghr.app.MainActivity");
//        caps.setCapability("appPackage", "com.miui.calculator");
//        caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        // Set up the WebDriver session
        AndroidDriver driver = new AndroidDriver(new URL(URL1), caps);
        
        driver.activateApp("com.zinghr.app");
        
        Thread.sleep(10000);
       
		WebElement ele = driver.findElement(By.xpath("//android.widget.FrameLayout[@index='0']"));// sendKeys("MMFSLOUT");
		System.out.println(ele.getSize());
		driver.findElement(By.className("android.widget.EditText")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("MMFSLOUT");
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]")).sendKeys("100005482");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]")).sendKeys("Kanha@@316");
        
      
        driver.quit();
    }
}
