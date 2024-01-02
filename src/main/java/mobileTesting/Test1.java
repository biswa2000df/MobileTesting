package mobileTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		/* To write to the appium folder
		 * {
			  "platformName": "Android",
			  "platformVersion": "11",
			  "deviceName": "d4a4d1d2",
			  "appPackage": "com.microsoft.bing",
			  "appActivity": "com.microsoft.sapphire.app.main.SapphireMainActivity"
			}*/

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "d4a4d1d2");

//		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\biswa\\Documents\\Bing.apk");

		dc.setCapability("appPackage", "com.microsoft.bing");

		dc.setCapability("appActivity", "com.microsoft.sapphire.app.main.SapphireMainActivity");

		URL url = new URL("http://localhost:4723/wd/hub"); //192.168.0.105  											//192.168.15.70 office

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
		Actions actions = new Actions(driver);
		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	       
       

		Thread.sleep(8000);
		try {

		WebElement ele1=	driver.findElement(By.id("com.microsoft.bing:id/sapphire_fre_get_started"));
//			actions.click(ele1).perform();
//			 actions.sendKeys(ele1, Keys.RETURN).perform();
//			 jsExecutor.executeScript("arguments[0].click();", ele1);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(ele1));
	        ele1.click();

		}

		catch (Exception e) {
			Thread.sleep(3000);

			WebElement ele2=driver.findElement(By.xpath("//android.widget.TextView[@text='Ask me anything…']"));
//				 actions.click(ele2).perform();
//				 actions.sendKeys(ele2, Keys.RETURN).perform();
//				 jsExecutor.executeScript("arguments[0].click();", ele2);
			 WebDriverWait wait = new WebDriverWait(driver, 10);
		        wait.until(ExpectedConditions.elementToBeClickable(ele2));
		        ele2.click();
		}
		Thread.sleep(14000);

		driver.findElement(By.xpath("//android.widget.Button[@text='WHILE USING THE APP']")).click();

		Thread.sleep(4000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.findElement(By.id("com.microsoft.bing:id/sa_profile_button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@index='1'])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//android.widget.TextView[@text='Sign in'])[1]")).click();/// clickon signin
																								/// button

		Thread.sleep(7000);

		driver.findElement(By.xpath("//*[@bounds='[121,396][962,500]']")).sendKeys("biswajit62sahoo@outlook.com");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[68,385][1012,486]']")).sendKeys("Kanha@@316");

//		Thread.sleep(1000);

		driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']")).click();

		for (int i = 0; i < 2; i++) {

			Thread.sleep(1000);

			driver.navigate().back();
		}

		Thread.sleep(2000);

		Robot robot = new Robot();

		WebElement search = driver.findElement(By.xpath("//*[@text='Ask me anything…']"));

		search.click();
		
		
		char[] alphabetArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String s=" ";
		for (int j = 1; j < 29; j++) {
			
			 UUID uuid = UUID.randomUUID();

		        // Convert the UUID to a string
		        String randomString = uuid.toString();
		        
		        s=Character.toString(alphabetArray[j]);

			try {

				Thread.sleep(1000);
				WebElement search2 = driver.findElement(By.xpath("//*[@text='Ask me anything…']"));	////*[@text='Search or type URL']
				Thread.sleep(1000);
				search2.click();
				System.out.println("click on search bar");
				search2.sendKeys(randomString);
				System.out.println("search bar check");
				actions.sendKeys(search2, Keys.ENTER).perform();
				System.out.println("key enter first search bar ");

			} catch (Exception e) {
				try {
					
				
				Thread.sleep(2000);
				WebElement search1 = driver
						.findElement(By.xpath("//android.widget.TextView[@bounds='[176,134][678,190]']"));
				search1.click();
				Thread.sleep(2000);
				} catch (Exception e2) {
					WebElement search3=driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.microsoft.bing:id/sapphire_search_header_input']"));
//					search3.click();
					search3.sendKeys(s);
					actions.sendKeys(search3, Keys.ENTER).perform();
					
					System.out.println("search bar check===="+j+" time "+"The search word is "+s);
					Thread.sleep(1000);

//					System.out.println(e2);
				}
			}
				
			
		}

		Thread.sleep(5000);
		
		for (int i = 0; i < 2; i++) {

			Thread.sleep(1000);

			driver.navigate().back();
		}
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@bounds='[88,2056][198,2166]']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("com.microsoft.bing:id/sa_profile_button")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@index='1'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sign out']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
		
		System.out.println("Successfully completed...");
		
		


//		driver.close();
	}
////
}
