package mobileTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "d4a4d1d2");

//		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\biswa\\Documents\\Bing.apk");

		dc.setCapability("appPackage", "com.microsoft.bing");

		dc.setCapability("appActivity", "com.microsoft.sapphire.app.main.SapphireMainActivity");

		URL url = new URL("http://192.168.15.70:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

		Thread.sleep(7000);


		driver.findElement(By.id("com.microsoft.bing:id/sapphire_fre_get_started")).click();

		
		System.out.println("ljahsjkfhhljlkgsajlkjsalk");

		Thread.sleep(25000);

		driver.findElement(By.xpath("(//*[@bounds='[0,0][1440,2816]'])[5]"));

		System.out.println("click on the middle framelayout");

		driver.findElement(By.xpath("(//*[@index='0'])[14]")).click();

//		driver.findElement(By.id("com.microsoft.bing:id/sa_profile_button")).click();
//		driver.switchTo().frame(driver.findElement(By.id("android:id/content")));

		System.out.println("hfffffffffffffffffffffffffff");

		driver.findElement(By.xpath("//*[@index='4']")).click();

		System.out.println("dkhsssssssssssssssssssssssxh");

		Thread.sleep(18000);

		driver.findElement(By.xpath("//*[@bounds='[154,640][1291,773]']")).sendKeys("biswajit64sahoo@outlook.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@index='1'])[3]")).click();

		Thread.sleep(25000);

		driver.findElement(By.xpath("(//*[@bounds='[91,626][1354,755]'])[2]")).sendKeys("Kanha@@316");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@class='android.widget.Button'])[1]")).click();

		Thread.sleep(15000);

//		WebElement TotalCoin=driver.findElement(By.id("com.microsoft.bing:id/pointsRatio"));
//		System.out.println(TotalCoin.getText());
//		

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@index='0'])[19]"));
		System.out.println("1");
		driver.findElement(By.xpath("(//*[@index='0'])[22]"));
		System.out.println("2");
		driver.findElement(By.xpath("(//*[@index='0'])[23]"));
		System.out.println("3");
		driver.findElement(By.xpath("(//*[@index='0'])[20]")).click();
		Thread.sleep(10000);

		Robot robot = new Robot();

		WebElement send;

		for (int i = 0; i < 5; i++) {
			Thread.sleep(5000);

			try {

				send = driver.findElement(By.xpath("(//*[@index='0'])[13]"));
			} catch (Exception e) {
				// TODO: handle exception
				Thread.sleep(5000);
				send = driver.findElement(By.xpath("(//*[@index='1'])[3]"));
			}

			send.click();
			System.out.println("s;lkjlhflhlkjlkjfslklsflkjlkfsjlkfsj");
			Thread.sleep(12000);
			send.sendKeys("k");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.microsoft.bing:id/sapphire_footer_icon")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.microsoft.bing:id/sa_profile_button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@index='1'])[2]")).click();

	}

}
