package mobileTesting;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub

		/*
		 * To write to the appium folder { "platformName": "Android", "platformVersion":
		 * "11", "deviceName": "d4a4d1d2", "appPackage": "com.microsoft.bing",
		 * "appActivity": "com.microsoft.sapphire.app.main.SapphireMainActivity" }
		 */
		String arr[][] = {{"27036109","Pass@1234","MMFSL"},{"100005482","Kanha@@316","MMFSLOUT"}};
		for (int i = 0; i < 2; i++) {
			DesiredCapabilities dc = new DesiredCapabilities();

			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");

		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\biswa\\Documents\\base.apk");

			/*
			 * if u want to run the application to the direct then use the this appPackage
			 * and appActivity otherwise to go to the chrome browser to set the apth and do
			 * all the things dc.setCapability("appPackage", "com.microsoft.bing");
			 * dc.setCapability("appActivity",
			 * "com.microsoft.sapphire.app.main.SapphireMainActivity");
			 */

//		dc.setCapability("appPackage", "com.miui.calculator"); 
//		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

			dc.setCapability("appPackage", "com.zinghr.app");
			dc.setCapability("appActivity", "com.zinghr.app.MainActivity");

			// Capabilities for Chrome browser
//		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		dc.setCapability("chromedriverExecutable", System.getProperty("user.dir") + File.separator + "BrowserDriver" + File.separator + "chromedriver.exe");

			URL url = new URL("http://0.0.0.0:4723/wd/hub"); // 192.168.0.105 //192.168.15.70 office

			
			
			// Use AndroidDriver instead of WebElement for mobile browser automation
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, dc);

//		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);   that also u can write

			// for calculator

//       System.out.println("Normal check to the chrome driver after hit url");
//       
//       Thread.sleep(5000);
//       
//       driver.findElement(By.xpath("//android.widget.FrameLayout[@bounds='[0,96][1080,2210]']")).click();
//       Thread.sleep(3000);
//       
//       driver.findElement(By.xpath("//android.widget.TextView[@text = '7']")).click();
//       driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"plus\"]")).click();
//       driver.findElement(By.xpath("//android.widget.TextView[@text = '7']")).click();
//       
//       Thread.sleep(3000);
//       driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"equals\"]")).click();

			AndroidDriver androidDriver = (AndroidDriver) driver;

//        for zing hr
			Thread.sleep(10000);
			WebElement ele = driver.findElement(By.xpath("//android.widget.FrameLayout[@index='0']"));// sendKeys("MMFSLOUT");
			System.out.println(ele.getSize());
			driver.findElement(By.className("android.widget.EditText")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys(arr[i][2]);
			Thread.sleep(2000);
			driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]")).sendKeys(arr[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]")).sendKeys(arr[i][1]);
			// Press the back button
			androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@bounds='[154,1347][926,1443]']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//android.widget.Button[@text='WHILE USING THE APP']")).click();
			Thread.sleep(10000);
			
			WebElement UserNameElement = null;
			if(i==0) {
			 UserNameElement = driver.findElement(By.xpath("(//android.widget.TextView[@index='2'])[2]"));
			 }else
			 {
				 UserNameElement = driver.findElement(By.xpath("//android.widget.TextView[@index='2']"));
			 }
			String userName = UserNameElement.getText();
			System.out.println(userName);
			Thread.sleep(2000);
			String[] splitUserName = userName.split(" ");
			if(i==0) {
			driver.findElement(By.xpath("//android.widget.Image[@bounds='[885,261][998,376]']")).click();
			}else {
			driver.findElement(By.xpath("//android.view.View[@bounds='[882,261][1034,431]']")).click();
			}
			
			Thread.sleep(5000);
//       Dimension size = driver.manage().window().getSize();

			// Define the coordinates where you want to click
			int x = 725; // X-coordinate
			int y = 1408; // Y-coordinate

			// Perform the tap action at the specified coordinates
			new TouchAction(driver).tap(PointOption.point(x, y)).perform();

			Thread.sleep(5000);

			TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
			File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

			String DestFile = System.getProperty("user.dir") + File.separator + splitUserName[1] + ".png";
			FileUtils.copyFile(screenshotFile, new File(DestFile));

			x = 514;
			y = 1265;
			new TouchAction(driver).tap(PointOption.point(x, y)).perform();

			driver.quit();
			
			String appPackage = "com.zinghr.app";

			// Execute ADB command to uninstall the application
			String adbCommand = String.format("adb uninstall %s", appPackage);
			Runtime.getRuntime().exec(adbCommand);
		}
	}
}
