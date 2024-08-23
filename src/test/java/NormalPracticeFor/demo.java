package NormalPracticeFor;


import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class demo {

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
	
		driver.activateApp("com.mahindra.fosqa");
		Thread.sleep(4000);
		
		/*
		
		driver.findElement(By.xpath("//android.widget.Button[@text=\"WHILE USING THE APP\"]")).click();//click on while using the app button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Grant\"]")).click();//click on grant button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"WHILE USING THE APP\"]")).click();//click on while using the app button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//*[@bounds=\"[55,983][1025,1145]\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("100005482");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();//click on continue button
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"android.miui:id/masklayout\"])[1]")).click();//click on chrome button
		Thread.sleep(4000);

		
		
		//Chrome Login
		
		driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[1]")).sendKeys("100005482");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[2]")).sendKeys("Biswajitsahookanha@@316");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"SMS Authenticator\"]")).click();  
		
		
		
		//Open Message Application

		driver.activateApp("com.android.mms");

		Thread.sleep(5000);

		WebElement message = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, ' is your OTP')]"));//get message
		 String Msg = message.getText();
		 System.out.println(Msg);
		String firstNum = Msg.substring(0, 1);
		String secondNum = Msg.substring(1, 2);
		String thirdNum = Msg.substring(2, 3);
		String fourthNum = Msg.substring(3, 4);
		
		System.out.println(firstNum + "=" + secondNum + "=" + thirdNum + "=" + fourthNum);
		driver.terminateApp("com.android.mms");
		
		
		driver.activateApp("com.android.chrome");
		Thread.sleep(1000);
		
		// Get available contexts
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println("Available context: " + contextName); // Debugging output to see available contexts
		}
		
		//Available context: NATIVE_APP
		//Available context: WEBVIEW_chrome

		// Switch to the WebView/Chrome context dynamically
		for (String contextName : contextNames) {
		    if (contextName.contains("WEBVIEW_chrome") || contextName.contains("CHROMIUM")) {
		        driver.context(contextName);
		        System.out.println("Switched to: " + contextName);
		        break;
		    }
		}
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		// Create a new instance of TouchAction
		TouchAction touchAction = new TouchAction(driver);

		// Specify the coordinates where you want to tap (x, y)
		int x = 137;
		int y = 800;

		// Perform the tap action at the specified coordinates
		touchAction
		    .tap(PointOption.point(x, y))
		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Optional wait after tap
		    .perform();
	

		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "(//*[@class=\"android.widget.EditText\"])[1]"))); element.click();
		 * element.sendKeys(firstNum);
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[1]")).
		 * click();
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[1]")).
		 * sendKeys(firstNum);
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[2]")).
		 * click();
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[2]")).
		 * sendKeys(secondNum);
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[3]")).
		 * click();
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[3]")).
		 * sendKeys(thirdNum);
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[4]")).
		 * click();
		 * driver.findElement(By.xpath("(//*[@class=\"android.widget.EditText\"])[4]")).
		 * sendKeys(fourthNum);
		 * 
		 * Thread.sleep(2000);
		 */
	
		
		/*
		
		TouchAction touchAction = new TouchAction(driver);

		// Specify the coordinates where you want to tap (x, y)
		int x = 400;
		int y = 1023;

		// Perform the tap action at the specified coordinates
		touchAction
		    .tap(PointOption.point(x, y))
		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))) // Optional wait after tap
		    .perform();  */
		
		driver.getKeyboard().sendKeys("2");
		
		driver.getKeyboard().sendKeys("5");
	
		driver.getKeyboard().sendKeys("8");
	
		driver.getKeyboard().sendKeys("0");
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		
		
		WebElement ApplicationTab =   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@index='1'])[2]"))); 
		ApplicationTab.click();
		
		//Thread.sleep(40000);
		
		//RefreshPage(driver);//call to refresh Application Page
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class=\"android.view.View\"])[18]"))).click();
		WebElement Lead = explicityWait(wait, "(//*[@class=\"android.view.View\"])[19]");
		Lead.click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		//==========================================================CONSENT====================================================//
		
//		co_ordinatesClick(driver, 910, 1100);  //co-cordinate for consent
	/*	WebElement Applicant_Consent_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[2]");
		Applicant_Consent_Tab.click();
		
		
		WebElement Applicant_ConsentPrimaryDetails = explicityWait(wait, "//android.view.View[@content-desc=\"Primary Details\"]");
		Applicant_ConsentPrimaryDetails.click();
		
		WebElement Applicant_ModeOfConsent = explicityWait(wait, "(//android.view.View[@content-desc=\"Mode Of Consent\"])[1]");
		Applicant_ModeOfConsent.click();
		
		
		WebElement Applicant_ModeOfConsent_Select_Form = explicityWait(wait, "//android.view.View[@content-desc=\"Form\"]/android.widget.RadioButton");
		Applicant_ModeOfConsent_Select_Form.click();
		
		Thread.sleep(2000);
		
		ScrollDown(driver);//ScrollDown
		
		WebElement clickOn_CaptureImageIcon= explicityWait(wait, "//android.widget.Button[@content-desc=\"Capture Image\"]");
		clickOn_CaptureImageIcon.click();
		
		WebElement clickOn_AddImage_Page= explicityWait(wait, "//android.view.View[@content-desc=\"Add Image\"]");
		clickOn_AddImage_Page.click();
		
		
		WebElement SaveDocumentButtonConsent= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
		SaveDocumentButtonConsent.click();
		
		
		WebElement SaveAndUploadButtonConsent= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
		SaveAndUploadButtonConsent.click();
		
//		WebElement consent_Proceed_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
//		consent_Proceed_Button.click();
//		
//		WebElement consent_Provided_Successfully= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
//		consent_Provided_Successfully.click();
		
		System.out.println("Applicant Consent completed"); */
		
		
		
		
		
		
		
		
		
		
	
		
		/*
		
		//		//==========================================================KYC====================================================//
		
		
		//CLick on KYC tab
				
		WebElement Applicant_KYC_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[3]");
		Applicant_KYC_Tab.click();
		
		WebElement clickOn_CaptureImageIconKYC_PAN= explicityWait(wait, "//android.widget.Button[@content-desc=\"Capture Image\"]");
		clickOn_CaptureImageIconKYC_PAN.click();
		
		WebElement clickOn_Gallery_Image= explicityWait(wait, "//android.widget.Button[@index=\"3\"]");
		clickOn_Gallery_Image.click();
		
		WebElement clickOn_Gallery_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Gallery\"]");
		clickOn_Gallery_Button.click();
		
		Thread.sleep(2000);
		co_ordinatesClick(driver, 870, 157);// click on search button
		
		WebElement clickOn_SearchBar= explicityWait(wait, "//android.widget.EditText[contains(@text,'Search')]");
		clickOn_SearchBar.click();
		clickOn_SearchBar.sendKeys("pancard");
		
	
		WebElement selectPanImage= explicityWait(wait, "//android.widget.LinearLayout[@content-desc=\"pancard.jpg, 5.42 MB, 3:14 pm\"]");
		selectPanImage.click();
		
		WebElement SaveDocumentButtonKYC_PAN= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
		SaveDocumentButtonKYC_PAN.click();
			
		WebElement SaveAndUploadButtonKYC_PAN= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
		SaveAndUploadButtonKYC_PAN.click();
		
//		WebElement PAN_VerifyBtn= explicityWait(wait, "//android.widget.Button[@content-desc=\"Verify\"]");
//		PAN_VerifyBtn.click();
		
		//ProceedButton paei lekhibi after pan verify
		
		ScrollDown(driver);
		
		WebElement OSV_PAN_CheckBox= explicityWait(wait, "(//android.view.View[@content-desc=\"Original seen and verified\"])[1]/android.widget.CheckBox");
		OSV_PAN_CheckBox.click();
		
		
		
		//Primary applicant KYC tab POI
		
		WebElement POI_tab= explicityWait(wait, "(//android.view.View[@content-desc=\"Proof Of Identity\"])[1]");
		POI_tab.click();
		
		WebElement TypeOfIdentityFor_PrimaryOn_KYC_Tab= explicityWait(wait, "//android.view.View[@content-desc=\"Aadhaar Card(Preferred)\"]");
		TypeOfIdentityFor_PrimaryOn_KYC_Tab.click();
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='android.widget.ScrollView']/android.view.View"));
		System.out.println("Number of options: " + options.size());
		Thread.sleep(2000);

		for (WebElement option : options) {
		    try {
		        // Retrieve the content description (content-desc attribute)
		        String optionText = option.getAttribute("content-desc");
		        
		        System.out.println("Dropdown Value = " + optionText);
		        
		        // Compare and click if it matches the desired text
		        if (optionText.contains("Aadhaar Card")) {
		            option.click();
		            break;
		        }
		    } catch (Exception e) {
		        System.out.println("Error retrieving content-desc for option: " + e.getMessage());
		    }
		}
		
		WebElement clickOn_CaptureImageIconKYC_POI= explicityWait(wait, "//android.widget.Button[@content-desc=\"Capture Image\"]");
		clickOn_CaptureImageIconKYC_PAN.click();
		
		WebElement clickOn_Gallery_Image_POI= explicityWait(wait, "//android.widget.Button[@index=\"3\"]");
		clickOn_Gallery_Image.click();
		
		WebElement clickOn_Gallery_Button_POI= explicityWait(wait, "//android.widget.Button[@content-desc=\"Gallery\"]");
		clickOn_Gallery_Button.click();
		
		Thread.sleep(2000);
		co_ordinatesClick(driver, 870, 157);// click on search button
		
		WebElement clickOn_SearchBar_POI= explicityWait(wait, "//android.widget.EditText[contains(@text,'Search')]");
		clickOn_SearchBar.click();
		clickOn_SearchBar.sendKeys("aadhaar");
		
	
		WebElement selectPOIImage= explicityWait(wait, "//android.widget.LinearLayout[@content-desc=\"aadhaar.jpg, 5.00 MB, 4:59 pm\"]");
		selectPOIImage.click();
		
		WebElement SaveDocumentButtonKYC_POI= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
		SaveDocumentButtonKYC_PAN.click();
		
		
		WebElement SaveAndUploadButtonKYC_POI= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
		SaveAndUploadButtonKYC_PAN.click();
		
		ScrollDown(driver);
		
		try {
		WebElement OSV_POI_CheckBox= explicityWait(wait, "(//android.view.View[@content-desc=\"Original seen and verified\"])[1]/android.widget.CheckBox");
		OSV_PAN_CheckBox.click();
		}catch(Exception e) {
			ScrollDown(driver);
			WebElement OSV_POI_CheckBox= explicityWait(wait, "(//android.view.View[@content-desc=\"Original seen and verified\"])[1]/android.widget.CheckBox");
			OSV_PAN_CheckBox.click();
		}
		
		
		//Primary Applicant POA
		
		WebElement POA_tab= explicityWait(wait, "(//android.view.View[@content-desc=\"Proof Of Address\"])[1]");
		POA_tab.click();
		Thread.sleep(2000);
		POA_tab.click();
		
		WebElement KYC_Proceed_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
		KYC_Proceed_Button.click();
		
		
		*/
		
		
		
		
		//==========================================================SANCTION====================================================//
		
		
		//***************************AssetDetails****************************************
		
		WebElement Applicant_Sanction_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[4]");
		Applicant_Sanction_Tab.click();
		
		WebElement KYC_Details_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"KYC Details\"])[1]");
		KYC_Details_SanctionTab.click();
		
		WebElement Asset_Details_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Asset Details\"])[1]");
		Asset_Details_SanctionTab.click();
		
		WebElement DealerName$Code_Search_SanctionTab= explicityWait(wait, "(//*[@class=\"android.widget.EditText\"])[1]");
		DealerName$Code_Search_SanctionTab.click();
		DealerName$Code_Search_SanctionTab.clear();
		DealerName$Code_Search_SanctionTab.sendKeys("AAKAR");
		
		WebElement DealerName$Code_Click_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"AAKAR AUTOMOTIVES PVT LTD - 38175\"]");
		DealerName$Code_Click_SanctionTab.click();
		
		WebElement ClickOn_DealerLocation_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Select\"])[1]");
		ClickOn_DealerLocation_SanctionTab.click();
		
		WebElement Select_DealerLocation_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"POWAI AAKAR AUTOMOTIVES PVT LTD 38175\"]");
		Select_DealerLocation_SanctionTab.click();
		
		WebElement ClickOn_AssetName_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Asset Name\"]/android.widget.EditText");
		ClickOn_AssetName_SanctionTab.click();
		ClickOn_AssetName_SanctionTab.sendKeys("HYUNDAI VERNA SX CRDI AT");
		
		WebElement Select_AssetName_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"HYUNDAI VERNA SX CRDI AT\"]");
		Select_AssetName_SanctionTab.click();
		
		WebElement ClickOn_ManufacturingYears_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Manufacturing Year\"]/android.view.View/android.view.View");
		ClickOn_ManufacturingYears_SanctionTab.click();
		
		WebElement Select_ManufacturingYears_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"2024\"]");
		Select_ManufacturingYears_SanctionTab.click();
		
		WebElement ClickOn_AssetUsage_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Asset Usage\"]/android.view.View/android.view.View");
		ClickOn_AssetUsage_SanctionTab.click();
		
		WebElement Select_AssetUsage_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Commercial\"]");
		Select_AssetUsage_SanctionTab.click();
		
		Thread.sleep(1000);
		ScrollDown(driver);
		
		
		
		//***************************LoanInfo****************************************
		
		WebElement ClickOn_LoanInfo_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Loan Info\"])[1]");
		ClickOn_LoanInfo_SanctionTab.click();
		
		WebElement LoanTenure_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Loan Tenure (months)\"]/android.view.View/android.widget.EditText");
		LoanTenure_SanctionTab.click();
		LoanTenure_SanctionTab.clear();
		LoanTenure_SanctionTab.sendKeys("31");
		driver.hideKeyboard();
		
		ScrollDown_LittleBit(driver);
		
		WebElement CreditDays_SanctionTab= explicityWait(wait, "//android.widget.EditText[(ancestor::android.view.View[@content-desc=\"Credit Days\"]/android.view.View[1]) or (ancestor::android.view.View[@content-desc=\"0\"])]");
		CreditDays_SanctionTab.click();
		CreditDays_SanctionTab.clear();
		CreditDays_SanctionTab.sendKeys("5");
		driver.navigate().back();
		
		Thread.sleep(1000);
		ScrollDown_LittleBit(driver);
		
		
		
		//***************************Personal $ Contact Details****************************************
		
		WebElement Personal$ContactDetails_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Personal & Contact Details\"])[1]");
		Personal$ContactDetails_SanctionTab.click();
		
		Thread.sleep(3000);
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"]", "Personal Details", "Personal Details");
		
		ScrollDown_LittleBit(driver);
		ScrollDown_LittleBit(driver);
		Thread.sleep(2000);
		
		WebElement DOB_CLickOn_CalenderIcon_SanctionTab= explicityWait(wait, "//android.widget.Button[@content-desc=\"calendar\"] ");
		DOB_CLickOn_CalenderIcon_SanctionTab.click();
		 
		WebElement DOB_CLickOn_editBtn_SanctionTab= explicityWait(wait, "(//*[@class=\"android.widget.Button\"])[1]");
		DOB_CLickOn_editBtn_SanctionTab.click();
		
		WebElement EnterDOB_SanctionTab= explicityWaitUsing_ClassName(wait, "android.widget.EditText");
		EnterDOB_SanctionTab.click();
		EnterDOB_SanctionTab.clear();
		EnterDOB_SanctionTab.sendKeys("04/05/2000");
		
		WebElement OK_Btn_SanctionTab= explicityWait(wait, "//android.widget.Button[@content-desc=\"OK\"]");
		OK_Btn_SanctionTab.click();
		
		Thread.sleep(2000);
		ScrollDown(driver);
		
		WebElement MaritalStatus_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Marital Status\"]/android.view.View/android.view.View");
		MaritalStatus_SanctionTab.click();
		
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Unmarried", "MaritalStatus_SanctionTab");

		
		WebElement No_of_Dependents_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"No. of Dependents\"]/android.view.View/android.view.View");
		No_of_Dependents_SanctionTab.click();
		
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "2", "No_of_Dependents_SanctionTab");
		
		Thread.sleep(2000);
		ScrollDown_LittleBit(driver);
		Thread.sleep(2000);
		
		WebElement No_of_Earning_Members_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"No. of Earning Members\"]/android.view.View//android.view.View");
		No_of_Earning_Members_SanctionTab.click();
			
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "3", "No_of_Earning_Members_SanctionTab");
		
		ScrollDown_LittleBit(driver);
		Thread.sleep(2000);
		
		WebElement Vehicles_Owned_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Vehicles Owned\"]/android.view.View/android.view.View");
		Vehicles_Owned_SanctionTab.click();
		
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "1", "Vehicles_Owned_SanctionTab");
		
		Thread.sleep(2000);
		ScrollDown_LittleBit(driver);
		Thread.sleep(2000);
		
		WebElement Education_qualification_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Education Qualification\"]/android.view.View/android.view.View");
		Education_qualification_SanctionTab.click();
		
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Post Graduate", "Education_qualification_SanctionTab");

		
		Thread.sleep(2000);
		ScrollDown(driver);
		Thread.sleep(2000); 
		
		WebElement Basic_Customer_Profile_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Basic Customer Profile\"])[1]");
		Basic_Customer_Profile_SanctionTab.click();
		Basic_Customer_Profile_SanctionTab.click();
		
		WebElement Personal$ContactDetails_again_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Personal & Contact Details\"])[1]");
		Personal$ContactDetails_again_SanctionTab.click();
		Personal$ContactDetails_again_SanctionTab.click(); 
		
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"]", "Address Details", "Address Details");
		
		ScrollDown_LittleBit(driver);
		
		WebElement Address_Line1_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Address Line 1\"]/android.view.View/android.widget.EditText");
		Address_Line1_SanctionTab.click();
		Address_Line1_SanctionTab.clear();
		Address_Line1_SanctionTab.sendKeys("Odisha");
		driver.navigate().back();
		
		ScrollDown_LittleBit(driver);
		Thread.sleep(2000);
		
		WebElement Address_Line2_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Address Line 2\"]/android.view.View/android.widget.EditText");
		Address_Line2_SanctionTab.click();
		Address_Line2_SanctionTab.clear();
		Address_Line2_SanctionTab.sendKeys("Odisha");
		driver.navigate().back();
		
		ScrollDown_LittleBit(driver);
		Thread.sleep(2000);
		
		WebElement Enter_PinCode_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Pincode\"]/android.widget.EditText");
		Enter_PinCode_SanctionTab.click();
		Enter_PinCode_SanctionTab.clear();
		Enter_PinCode_SanctionTab.sendKeys("754204");
		
		WebElement Select_PinCode_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"754204\"]");
		Select_PinCode_SanctionTab.click();
		
		WebElement Select_Taluk_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Taluk\"]/android.view.View/android.view.View");
		Select_Taluk_SanctionTab.click();
		
		SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"] ", "Mahanga", "Taluk");
		
		ScrollDown(driver);
		Thread.sleep(3000);
		
		
		
		
		
		
		
		//***************************Basic Customer Profile****************************************
		
		Basic_Customer_Profile_SanctionTab.click();
		
		ScrollDown(driver);
		Thread.sleep(3000);
		
		WebElement Total_Employment_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Total Employment\"]/android.view.View/android.widget.EditText");
		Total_Employment_SanctionTab.click();
		Total_Employment_SanctionTab.clear();
		Total_Employment_SanctionTab.sendKeys("5");
		driver.hideKeyboard();
		
		WebElement Annual_Gross_Income_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Declared Annual Gross Income\"])[2]/android.view.View/android.widget.EditText");
		Annual_Gross_Income_SanctionTab.click();
		Annual_Gross_Income_SanctionTab.clear();
		Annual_Gross_Income_SanctionTab.sendKeys("500000");
		driver.hideKeyboard();
		
		ScrollDown_LittleBit(driver);
		
		WebElement Annual_Gross_Obligations_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Declared Annual Gross Obligations\"])[2]/android.view.View/android.widget.EditText");
		Annual_Gross_Obligations_SanctionTab.click();
		Annual_Gross_Obligations_SanctionTab.clear();
		Annual_Gross_Obligations_SanctionTab.sendKeys("500000");
		driver.hideKeyboard();
		
		WebElement Name_Of_Orgination_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Name of Organization\"]/android.view.View/android.widget.EditText");
		Name_Of_Orgination_SanctionTab.click();
		Name_Of_Orgination_SanctionTab.clear();
		Name_Of_Orgination_SanctionTab.sendKeys("Mahindra Finance");
		driver.hideKeyboard();
		
		ScrollDown_LittleBit(driver);
		Thread.sleep(3000);
		
		WebElement Years_in_current_profession_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Years in current profession\"]/android.view.View/android.widget.EditText");
		Years_in_current_profession_SanctionTab.click();
		Years_in_current_profession_SanctionTab.clear();
		Years_in_current_profession_SanctionTab.sendKeys("5");
		driver.hideKeyboard();
						
		
		

		//***************************Payout Details****************************************			
						
		
		
		WebElement PayOut_Details_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Payout Details\"])[1]");
		PayOut_Details_SanctionTab.click();
		
		
		
				
	
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static void SelectOneElementInsideListOfElement(AndroidDriver<WebElement> driver, String WebElement, String value, String section) throws Exception {
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath(WebElement));
		System.out.println("Number of option Size : " + options.size());
		

		for (WebElement option : options) {
		    try {
		        String optionText = option.getAttribute("content-desc");
		        System.out.println("Dropdown Value for "+ section + " = " + optionText);
		        
		        if (optionText.contains(value)) {
		            option.click();
		            break;
		        }
		    } catch (Exception e) {
//		        System.out.println("Error retrieving content-desc for option: " + e.getMessage());
		    }
		}
	}
	
	
	
	public static void co_ordinatesClick(AndroidDriver<WebElement> driver, int coOrdinate_x, int coOrdinate_y) {
		TouchAction touchAction = new TouchAction(driver);

		// Specify the coordinates where you want to tap (x, y)
		int x = coOrdinate_x;
		int y = coOrdinate_y;

		// Perform the tap action at the specified coordinates
		touchAction
		    .tap(PointOption.point(x, y))
		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))) // Optional wait after tap
		    .perform();
	}
	
	
	public static WebElement explicityWait(WebDriverWait wait, String webElement) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));
		return element;
	}
	
	public static WebElement explicityWaitUsing_ClassName(WebDriverWait wait, String webElement) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));
		return element;
	}
	
	
	public static void RefreshPage(AndroidDriver<WebElement> driver) {

		// Get the size of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
//		System.out.println("screenHeight = " + screenHeight);
//		System.out.println("screenWidth = " + screenWidth);
		
		
		// Calculate the start and end points for the swipe
		int startX = screenWidth / 2; // Horizontal center of the screen
		int startY = (int) (screenHeight * 0.3); // Start from the top 30% of the screen
		int endY = (int) (screenHeight * 0.8); // Swipe down to 80% of the screen height

		// Perform the swipe gesture for pull down to refresh
		TouchAction touchAction = new TouchAction(driver);
		touchAction
		    .press(PointOption.point(startX, startY))
		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Hold for a moment
		    .moveTo(PointOption.point(startX, endY))
		    .release()
		    .perform();
	}
	
	public static void ScrollDown(AndroidDriver<WebElement> driver) {

		// Get the size of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
//		System.out.println("screenHeight = " + screenHeight);
//		System.out.println("screenWidth = " + screenWidth);
		
		
		// Calculate the start and end points for the swipe
		int startX = screenWidth / 2; // Horizontal center of the screen
		int startY = (int) (screenHeight * 0.8); // Start from the top 80% of the screen
		int endY = (int) (screenHeight * 0.3); // Swipe down to 30% of the screen height

		// Perform the swipe gesture for pull down to refresh
		TouchAction touchAction = new TouchAction(driver);
		touchAction
		    .press(PointOption.point(startX, startY))
		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))) // Hold for a moment
		    .moveTo(PointOption.point(startX, endY))
		    .release()
		    .perform();
	}
	
	public static void ScrollDown_LittleBit(AndroidDriver<WebElement> driver) {

		// Get the size of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
//		System.out.println("screenHeight = " + screenHeight);
//		System.out.println("screenWidth = " + screenWidth);
		
		
		 int startX = screenWidth / 2; // Horizontal center of the screen
		 int startY = (int) (screenHeight * 0.6); // Start from 60% of the screen height
		 int endY = (int) (screenHeight * 0.5); // Swipe down to 50% of the screen height

		// Perform the swipe gesture for pull down to refresh
		TouchAction touchAction = new TouchAction(driver);
		touchAction
		    .press(PointOption.point(startX, startY))
		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Hold for a moment
		    .moveTo(PointOption.point(startX, endY))
		    .release()
		    .perform();
	}
	
	public static void ScrollUp(AndroidDriver<WebElement> driver) {

	    // Get the size of the screen
	    int screenHeight = driver.manage().window().getSize().getHeight();
	    int screenWidth = driver.manage().window().getSize().getWidth();
	    System.out.println("screenHeight = " + screenHeight);
	    System.out.println("screenWidth = " + screenWidth);

	    // Calculate the start and end points for a big swipe up
	    int startX = screenWidth / 2; // Horizontal center of the screen
	    int startY = (int) (screenHeight * 0.2); // Start from 30% of the screen height (near the top)
	    int endY = (int) (screenHeight * 0.8); // Swipe up to 80% of the screen height (near the bottom)

	    // Perform the swipe gesture for a big scroll up
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction
	        .press(PointOption.point(startX, startY))
	        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))) // Hold for a moment
	        .moveTo(PointOption.point(startX, endY))
	        .release()
	        .perform();
	}


}
