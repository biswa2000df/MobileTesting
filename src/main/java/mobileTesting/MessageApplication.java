package mobileTesting;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MessageApplication {

	public static void main(String[] args) throws Exception {
		

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "d4a4d1d2");

//		dc.setCapability("appPackage", "com.mahindra.fosqa");
//		dc.setCapability("appActivity", "com.mahindra.fosbeta.MainActivity");
		

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(2000);
	
		driver.activateApp("com.android.mms");
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"AX-NSETRA\").instance(0))").click(); //scroll down to the element and click

		/*
		 * driver.findElementByAndroidUIAutomator(
		 * "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
		 * "new UiSelector().textContains(\"AX-NSETRA\"));" ).click();
		 */
		
		driver.findElementByAndroidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollForward()"
			    + ".scrollIntoView(new UiSelector().description(\"AX-NSETRA\"));"
			);
		
		WebElement ApplicationTab =   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"AX-NSETRA\"]"))); 
		ApplicationTab.click();
		

	}

}
