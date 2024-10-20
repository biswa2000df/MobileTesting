package NormalPracticeFor;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class FOS_QA {

	public static void main(String[] args) throws Exception{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "d4a4d1d2");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		Thread.sleep(2000);
		driver.activateApp("com.mahindra.fosqa");
		Thread.sleep(4000);
		
		driver.getKeyboard().sendKeys("1");
		driver.getKeyboard().sendKeys("4");
		driver.getKeyboard().sendKeys("7");
		driver.getKeyboard().sendKeys("8");
		
		WebElement ApplicationTab =   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@index='1'])[2]"))); 
		ApplicationTab.click();   //click on Lead List
		
		WebElement Lead = explicityWait(wait, "(//*[@class=\"android.view.View\"])[18]"); //click on leads
		Lead.click();
		
		Thread.sleep(2000);
		
		
		
//==========================================================CONSENT for Primary====================================================//
		
//		co_ordinatesClick(driver, 910, 1100);  //co-cordinate for consent
		WebElement Applicant_Consent_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[2]");
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
		
		WebElement consent_Proceed_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
		consent_Proceed_Button.click();
		
		WebElement consent_Provided_Successfully= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
		consent_Provided_Successfully.click();
		
		System.out.println("Applicant Consent completed"); 
		
		
//		***************************************** Add new CoApplicant ******************************************************************
		
			WebElement kebabMenu= explicityWait(wait, "//android.widget.Button[@content-desc=\"kebabMenu\"]");
			kebabMenu.click();	
			
			WebElement Select_Add_CoApplicant_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Add Co-Applicant\"]");
			Select_Add_CoApplicant_Button.click();
			
			WebElement ClickOn_Add_New_CoApplicant_Plus_Button= explicityWait(wait, "//android.view.View[@content-desc=\"Add new Co - applicant\"]");
			ClickOn_Add_New_CoApplicant_Plus_Button.click();
			
			WebElement FirstName_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"First Name\"]/android.view.View/android.widget.EditText");
			FirstName_CoApplicant.click();
			FirstName_CoApplicant.sendKeys("NAMRATA");
			driver.navigate().back();
			
			WebElement MiddleName_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Middle Name\"]/android.view.View/android.widget.EditText");
			MiddleName_CoApplicant.click();
			MiddleName_CoApplicant.sendKeys("ARUN");
			driver.navigate().back();
			    
			WebElement LastName_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Last Name\"]/android.view.View/android.widget.EditText");
			LastName_CoApplicant.click();
			LastName_CoApplicant.sendKeys("SHETE");
			driver.navigate().back();
			 
			WebElement MobileNumber_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Mobile Number\"]/android.view.View/android.widget.EditText");
		    MobileNumber_CoApplicant.click();
		    MobileNumber_CoApplicant.sendKeys("7744008734");
			driver.navigate().back();
			  
			WebElement GenderMaping_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Gender\"]/android.view.View");
			GenderMaping_CoApplicant.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Female", "GenderMaping_CoApplicant");
	     
			WebElement AddToFinancialIncome_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Yes\"]/android.widget.RadioButton");
			AddToFinancialIncome_CoApplicant.click();
			
			WebElement SaveBtn_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save\"]");
			SaveBtn_CoApplicant.click();  
			
			//Click on Particular CoApplicant 
			WebElement ClickOn_One_CoApplicant= explicityWait(wait, "//android.widget.Button[contains(@content-desc,'NAMRATA ARUN SHETE')]");
			ClickOn_One_CoApplicant.click(); 
		
			//========================================================== CONSENT for Co-Applicant ====================================================//
			
			
			WebElement CoApplicant_Consent_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[2]");
			CoApplicant_Consent_Tab.click();
			
			WebElement CoApplicant_ConsentPrimaryDetails = explicityWait(wait, "//android.view.View[@content-desc=\"Primary Details\"]");
			CoApplicant_ConsentPrimaryDetails.click();
			
			WebElement CoApplicant_ModeOfConsent = explicityWait(wait, "(//android.view.View[@content-desc=\"Mode Of Consent\"])[1]");
			CoApplicant_ModeOfConsent.click();
			
			WebElement CoApplicant_ModeOfConsent_Select_Form = explicityWait(wait, "//android.view.View[@content-desc=\"Form\"]/android.widget.RadioButton");
			CoApplicant_ModeOfConsent_Select_Form.click();
			
			Thread.sleep(2000);
			
			ScrollDown(driver);//ScrollDown
			
			WebElement clickOn_CaptureImageIcon_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Capture Image\"]");
			clickOn_CaptureImageIcon_CoApplicant.click();
			
			WebElement clickOn_AddImage_Page_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Add Image\"]");
			clickOn_AddImage_Page_CoApplicant.click();
			
			WebElement SaveDocumentButtonConsent_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
			SaveDocumentButtonConsent_CoApplicant.click();
			
			WebElement SaveAndUploadButtonConsent_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
			SaveAndUploadButtonConsent_CoApplicant.click();
			
			WebElement consent_Proceed_Button_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			consent_Proceed_Button_CoApplicant.click();
			
			WebElement consent_Provided_Successfully_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			consent_Provided_Successfully_CoApplicant.click();
			
			System.out.println("Applicant Consent completed"); 
			
			Thread.sleep(1000);	
			
//			Go back to applicant tab
			driver.navigate().back();
			driver.navigate().back();
			
			WebElement Again_GoBack_ClickOnApplicant= explicityWait(wait, "(//android.view.View[contains(@content-desc,'Applicant')])[2]");
			Again_GoBack_ClickOnApplicant.click();
			
			
			
					//==========================================================Primary KYC====================================================//
			
			
			//Cick on Primary KYC tab
					
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
			
		
			WebElement selectPanImage= explicityWait(wait, "//android.widget.LinearLayout[contains(@content-desc,'pancard.jpg')]");
			selectPanImage.click();
			
			WebElement SaveDocumentButtonKYC_PAN= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
			SaveDocumentButtonKYC_PAN.click();
				
			WebElement SaveAndUploadButtonKYC_PAN= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
			SaveAndUploadButtonKYC_PAN.click();
			
			WebElement PAN_VerifyBtn= explicityWait(wait, "//android.widget.Button[@content-desc=\"Verify\"]");
			PAN_VerifyBtn.click();
			
			WebElement KYC_PAN_Verify_Proceed_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			KYC_PAN_Verify_Proceed_Button.click();
			
			Thread.sleep(2000);
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
			
			WebElement selectPOIImage= explicityWait(wait, "//android.widget.LinearLayout[contains(@content-desc,'aadhaar.jpg')]");
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
			
			try {
				WebElement KYC_Proceed_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
				KYC_Proceed_Button.click();
			} catch (Exception e) {
				WebElement KYC_Proceed_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
				KYC_Proceed_Button.click();
			}
			
			
			
			//==========================================================SANCTION====================================================//
			
			
			//***************************AssetDetails****************************************
			
//			WebElement Applicant_Sanction_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[4]");
//			Applicant_Sanction_Tab.click();
			
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
			
			WebElement Select_AssetUsage_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Personal\"]");
			Select_AssetUsage_SanctionTab.click();
			
			Thread.sleep(1000);
//			ScrollDown(driver);
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			
			Thread.sleep(1000);
			Asset_Details_SanctionTab.click();//close the Asset Details Tab
			
			
			
			
			
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
			
			ScrollDown_LittleBit(driver);
			
			WebElement ClickOn_RepaymentAccount_Form_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Repayment Account from\"]");
			ClickOn_RepaymentAccount_Form_SanctionTab.click();
			
			WebElement Select_RepaymentAccount_Form_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Borrower - Biswajit Sahoo\"]");
			Select_RepaymentAccount_Form_SanctionTab.click();
			
			
			Thread.sleep(1000);
//			ScrollDown_LittleBit(driver);  
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			Thread.sleep(1000);
			ClickOn_LoanInfo_SanctionTab.click();
			
			
			
			//***************************Personal $ Contact Details****************************************

			
			
			WebElement Personal$ContactDetails_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Personal & Contact Details\"])[1]");
			Personal$ContactDetails_SanctionTab.click();
			
			Thread.sleep(2000);
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"]", "Personal Details", "Personal Details");
			Thread.sleep(2000);
			
			ScrollDown(driver);
			Thread.sleep(1000);
			
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
			Co_Ordinate_Scroll(driver, 460, 1757, 460, 900);//scrolldown
//			ScrollDown(driver);
			
			WebElement MaritalStatus_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Marital Status\"]/android.view.View/android.view.View");
			MaritalStatus_SanctionTab.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Unmarried", "MaritalStatus_SanctionTab");

			
			WebElement No_of_Dependents_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"No. of Dependents\"]/android.view.View/android.view.View");
			No_of_Dependents_SanctionTab.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "2", "No_of_Dependents_SanctionTab");
			
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
			
			ScrollDown_LittleBit(driver);
			Thread.sleep(1000);
			
			WebElement Education_qualification_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Education Qualification\"]/android.view.View/android.view.View");
			Education_qualification_SanctionTab.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Post Graduate", "Education_qualification_SanctionTab");

			Thread.sleep(2000);
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
//			Thread.sleep(2000);
//			ScrollDown(driver);
//			Thread.sleep(2000); 
			
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
			Thread.sleep(1000);
			
			WebElement Enter_PinCode_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Pincode\"]/android.widget.EditText");
			Enter_PinCode_SanctionTab.click();
			Enter_PinCode_SanctionTab.clear();
			Enter_PinCode_SanctionTab.sendKeys("754204");
			
			WebElement Select_PinCode_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"754204\"]");
			Select_PinCode_SanctionTab.click();
			
			WebElement Select_Taluk_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Taluk\"]/android.view.View/android.view.View");
			Select_Taluk_SanctionTab.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"] ", "Mahanga", "Taluk");
			Thread.sleep(1000);
			
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			Personal$ContactDetails_SanctionTab.click();
			
//			ScrollDown(driver);
//			Thread.sleep(3000);
			
			
			
			
			
			
			
			//***************************Basic Customer Profile****************************************

			
			 
			WebElement Basic_Customer_Profile_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Basic Customer Profile\"])[1]");
			Basic_Customer_Profile_SanctionTab.click();
			
//			ScrollDown(driver);
			Thread.sleep(2000);
			Co_Ordinate_Scroll(driver, 460, 1757, 460, 900);//scrolldown
			
			WebElement Total_Employment_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Total Employment\"]/android.view.View/android.widget.EditText");
			Total_Employment_SanctionTab.click();
			Total_Employment_SanctionTab.clear();
			Total_Employment_SanctionTab.sendKeys("5");
			driver.hideKeyboard();
			
			ScrollDown_LittleBit(driver);
			
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
			
			ScrollDown_LittleBit(driver);
			
			WebElement Name_Of_Orgination_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Name of Organization\"]/android.view.View/android.widget.EditText");
			Name_Of_Orgination_SanctionTab.click();
			Name_Of_Orgination_SanctionTab.clear();
			Name_Of_Orgination_SanctionTab.sendKeys("Mahindra Finance");
			driver.hideKeyboard();
			
			WebElement Years_in_current_profession_SanctionTab= explicityWait(wait, "//android.view.View[@content-desc=\"Years in current profession\"]/android.view.View/android.widget.EditText");
			Years_in_current_profession_SanctionTab.click();
			Years_in_current_profession_SanctionTab.clear();
			Years_in_current_profession_SanctionTab.sendKeys("5");
			driver.hideKeyboard();
			
			
			

			//***************************Payout Details****************************************			
			
			
			ScrollDown(driver);
			
			WebElement PayOut_Details_SanctionTab= explicityWait(wait, "(//android.view.View[@content-desc=\"Payout Details\"])[1]");
			PayOut_Details_SanctionTab.click();
			Thread.sleep(3000);
			PayOut_Details_SanctionTab.click();
			
			WebElement ProceedBtn_SanctionTab= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			ProceedBtn_SanctionTab.click();  
			
			WebElement DetailsIncomplete_ProceedBtn_SanctionTab= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			DetailsIncomplete_ProceedBtn_SanctionTab.click(); 
			
			Thread.sleep(2000);
			driver.navigate().back();
			
			
			
//			*****************************************CoApplicant******************************************************************
			
			WebElement kebabMenu1 = explicityWait(wait, "//android.widget.Button[@content-desc=\"kebabMenu\"]");
			kebabMenu1.click();	
			
			WebElement Select_Add_CoApplicant_Button1 = explicityWait(wait, "//android.widget.Button[@content-desc=\"Add Co-Applicant\"]");
			Select_Add_CoApplicant_Button1.click();
			
			//CLick on particular Co-Applicant
			WebElement ClickOn_One_CoApplicant1= explicityWait(wait, "//android.widget.Button[contains(@content-desc,'NAMRATA ARUN SHETE')]");
			ClickOn_One_CoApplicant1.click(); 
			
			//==========================================================KYC for Co-Applicant====================================================//
			
			
			//CLick on KYC tab
					
			WebElement CoApplicant_KYC_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[3]");  //click on KYC Tab
			CoApplicant_KYC_Tab.click();
			
			WebElement clickOn_CaptureImageIconKYC_PAN_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Capture Image\"]");
			clickOn_CaptureImageIconKYC_PAN_CoApplicant.click();
			
			WebElement clickOn_Gallery_Image_PAN_Co_Applicant= explicityWait(wait, "//android.widget.Button[@index=\"3\"]");
			clickOn_Gallery_Image_PAN_Co_Applicant.click();
			
			WebElement clickOn_Gallery_Button_PAN_Co_Applicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Gallery\"]");
			clickOn_Gallery_Button_PAN_Co_Applicant.click();
			
			Thread.sleep(2000);
			co_ordinatesClick(driver, 870, 157);// click on search button
			
			WebElement clickOn_SearchBar_PAN_Co_Applicant= explicityWait(wait, "//android.widget.EditText[contains(@text,'Search')]");
			clickOn_SearchBar_PAN_Co_Applicant.click();
			clickOn_SearchBar_PAN_Co_Applicant.sendKeys("NAMRATA_PAN");
			
		
			WebElement selectPanImage_PAN_Co_Applicant= explicityWait(wait, "//android.widget.LinearLayout[contains(@content-desc,'NAMRATA_PAN.jpg')]");
			selectPanImage_PAN_Co_Applicant.click();
			
			WebElement SaveDocumentButtonKYC_PAN_Co_Applicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
			SaveDocumentButtonKYC_PAN_Co_Applicant.click();
				
			WebElement SaveAndUploadButtonKYC_PAN_Co_Applicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
			SaveAndUploadButtonKYC_PAN_Co_Applicant.click();
			
			WebElement PAN_VerifyBtn_Co_Applicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Verify\"]");
			PAN_VerifyBtn_Co_Applicant.click();
			
			WebElement KYC_PAN_Verify_Proceed_Button_Co_Applicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			KYC_PAN_Verify_Proceed_Button_Co_Applicant.click();
			
			Thread.sleep(2000);
			ScrollDown(driver);
			
			WebElement OSV_PAN_CheckBox_Co_Applicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Original seen and verified\"])[1]/android.widget.CheckBox");
			OSV_PAN_CheckBox_Co_Applicant.click();
			
			
			
			//CoApplicant applicant KYC tab POI
			
			WebElement POI_tab_CoApplicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Proof Of Identity\"])[1]");
			POI_tab_CoApplicant.click();
			
			WebElement TypeOfIdentityFor_PrimaryOn_KYC_Tab_CoApplicant= explicityWait(wait, "//android.view.View[@content-desc=\"Aadhaar Card(Preferred)\"]");
			TypeOfIdentityFor_PrimaryOn_KYC_Tab_CoApplicant.click();
			
			List<WebElement> options1 = driver.findElements(By.xpath("//*[@class='android.widget.ScrollView']/android.view.View"));
			System.out.println("Number of options: " + options1.size());
			Thread.sleep(2000);

			for (WebElement option : options1) {
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
			
			WebElement clickOn_CaptureImageIconKYC_POI_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Capture Image\"]");
			clickOn_CaptureImageIconKYC_POI_CoApplicant.click();
			
			WebElement clickOn_Gallery_Image_POI_CoApplicant= explicityWait(wait, "//android.widget.Button[@index=\"3\"]");
			clickOn_Gallery_Image_POI_CoApplicant.click();
			
			WebElement clickOn_Gallery_Button_POI_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Gallery\"]");
			clickOn_Gallery_Button_POI_CoApplicant.click();
			
			Thread.sleep(2000);
			co_ordinatesClick(driver, 870, 157);// click on search button
			
			WebElement clickOn_SearchBar_POI_CoApplicant= explicityWait(wait, "//android.widget.EditText[contains(@text,'Search')]");
			clickOn_SearchBar_POI_CoApplicant.click();
			clickOn_SearchBar_POI_CoApplicant.sendKeys("NAMRATA_AADHAAR");
			
		
			WebElement selectPOIImage_CoApplicant= explicityWait(wait, "//android.widget.LinearLayout[contains(@content-desc,'NAMRATA_AADHAAR.jpg')]");
			selectPOIImage_CoApplicant.click();
			
			WebElement SaveDocumentButtonKYC_POI_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save Document\"]");
			SaveDocumentButtonKYC_POI_CoApplicant.click();
			
			
			WebElement SaveAndUploadButtonKYC_POI_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Save and Upload\"]");
			SaveAndUploadButtonKYC_POI_CoApplicant.click();
			
			ScrollDown(driver);
			
			try {
			WebElement OSV_POI_CheckBox_CoApplicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Original seen and verified\"])[1]/android.widget.CheckBox");
			OSV_POI_CheckBox_CoApplicant.click();
			}catch(Exception e) {
				ScrollDown(driver);
				WebElement OSV_POI_CheckBox_CoApplicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Original seen and verified\"])[1]/android.widget.CheckBox");
				OSV_POI_CheckBox_CoApplicant.click();
			}
			
			
			//CoApplicant Applicant POA
			
			WebElement POA_tab_CoApplicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Proof Of Address\"])[1]");
			POA_tab_CoApplicant.click();
			Thread.sleep(2000);
			POA_tab_CoApplicant.click();
			
			WebElement KYC_Proceed_Button_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			KYC_Proceed_Button_CoApplicant.click();
			
			
			//**************************************************Customer Profile for Co-Applicant****************************************************************
		
//			//CLick on particular Co-Applicant
//			WebElement ClickOn_One_CoApplicant1= explicityWait(wait, "//android.widget.Button[contains(@content-desc,'NAMRATA ARUN SHETE')]");
//			ClickOn_One_CoApplicant1.click(); 
//			
//			WebElement kebabMenu= explicityWait(wait, "//android.widget.Button[@content-desc=\"kebabMenu\"]");
//			kebabMenu.click();	
//			
//			WebElement Select_Add_CoApplicant_Button= explicityWait(wait, "//android.widget.Button[@content-desc=\"Add Co-Applicant\"]");
//			Select_Add_CoApplicant_Button.click();
//			
//			WebElement CoApplicant_CustomerProfile = explicityWait(wait, "(//android.widget.Button[@index='1'])[4]");
//			CoApplicant_CustomerProfile.click();
			
			WebElement Personal$ContactDetails_CoApplicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Personal & Contact Details\"])[1]");
			Personal$ContactDetails_CoApplicant.isDisplayed();
			
			Thread.sleep(2000);
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"]", "Personal Details", "Personal Details");
			
			Thread.sleep(2000);
			WebElement CoApplicant_CustomerProfile_ClickOn_TitleField = explicityWait(wait, "//android.view.View[@content-desc=\"Title / Salutation\"]/android.view.View/android.view.View");
			CoApplicant_CustomerProfile_ClickOn_TitleField.click();
			
			WebElement CoApplicant_CustomerProfile_Select_Title = explicityWait(wait, "//android.view.View[@content-desc=\"Miss\"]");
			CoApplicant_CustomerProfile_Select_Title.click();
			Thread.sleep(2000);
			
			Co_Ordinate_Scroll(driver, 400, 1700, 423, 1017);//scrolldown
//			ScrollDown_LittleBit(driver);
			
			WebElement MaritalStatus_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Marital Status\"]/android.view.View/android.view.View");
			MaritalStatus_CustomerProfile_Co_Applicant.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Unmarried", "MaritalStatus_CustomerProfile_Co_Applicant");

//			Co_Ordinate_Scroll(driver, 400, 1700, 423, 850);//scrolldown
			ScrollDown(driver);
			
			
			WebElement No_of_Dependents_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"No. of Dependents\"]/android.view.View/android.view.View");
			No_of_Dependents_CustomerProfile_Co_Applicant.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "2", "No_of_Dependents_CustomerProfile_Co_Applicant");
			
//			ScrollDown_LittleBit(driver);
			Thread.sleep(2000);
			
			WebElement No_of_Earning_Members_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"No. of Earning Members\"]/android.view.View//android.view.View");
			No_of_Earning_Members_CustomerProfile_Co_Applicant.click();
				
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "3", "No_of_Earning_Members_CustomerProfile_Co_Applicant");
			
			ScrollDown_LittleBit(driver);
			Thread.sleep(2000);
			
			WebElement Vehicles_Owned_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Vehicles Owned\"]/android.view.View/android.view.View");
			Vehicles_Owned_CustomerProfile_Co_Applicant.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "1", "Vehicles_Owned_CustomerProfile_Co_Applicant");
			
			ScrollDown_LittleBit(driver);
			Thread.sleep(1000);
			
			WebElement Education_qualification_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Education Qualification\"]/android.view.View/android.view.View");
			Education_qualification_CustomerProfile_Co_Applicant.click();
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.widget.ScrollView\"]/android.view.View", "Post Graduate", "Education_qualification_CustomerProfile_Co_Applicant");

			Thread.sleep(1000);
			ScrollDown(driver);
			Thread.sleep(2000); 
			
			//select sister
			
			WebElement Click_RelationShip_With_Customers_CoApplicant_CustomerProfile= explicityWait(wait, "//android.view.View[@content-desc=\"Relationship with Customer\"]/android.view.View/android.view.View");
			Click_RelationShip_With_Customers_CoApplicant_CustomerProfile.click();
			
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator(
				    "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollForward()"
				    + ".scrollIntoView(new UiSelector().description(\"Sister\"));"
				).click();
			
			
			
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"]", "Address Details", "Address Details");
			
			ScrollDown_LittleBit(driver);
			
			WebElement Address_Line1_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Address Line 1\"]/android.view.View/android.widget.EditText");
			Address_Line1_CustomerProfile_Co_Applicant.click();
			Address_Line1_CustomerProfile_Co_Applicant.clear();
			Address_Line1_CustomerProfile_Co_Applicant.sendKeys("Pune");
			driver.navigate().back();
			
			ScrollDown_LittleBit(driver);
			Thread.sleep(2000);
			
			WebElement Address_Line2_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Address Line 2\"]/android.view.View/android.widget.EditText");
			Address_Line2_CustomerProfile_Co_Applicant.click();
			Address_Line2_CustomerProfile_Co_Applicant.clear();
			Address_Line2_CustomerProfile_Co_Applicant.sendKeys("Pune");
			driver.navigate().back();
			
			ScrollDown_LittleBit(driver);
			Thread.sleep(1000);
			
			WebElement Enter_PinCode_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Pincode\"]/android.widget.EditText");
			Enter_PinCode_CustomerProfile_Co_Applicant.click();
			Enter_PinCode_CustomerProfile_Co_Applicant.clear();
			Enter_PinCode_CustomerProfile_Co_Applicant.sendKeys("411014");
			
			Thread.sleep(2000);
			
//			WebElement Select_PinCode_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"411014\"]");
//			Select_PinCode_CustomerProfile_Co_Applicant.click();
			
			co_ordinatesClick(driver, 200, 1033);
			
			WebElement Select_Taluk_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Taluk\"]/android.view.View/android.view.View");
			Select_Taluk_CustomerProfile_Co_Applicant.click();
//			Select_Taluk_CustomerProfile_Co_Applicant.click();
		
			SelectOneElementInsideListOfElement(driver, "//*[@class=\"android.view.View\"] ", "Pune", "Taluk");
			Thread.sleep(1000);
			
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			
			WebElement Personal$ContactDetails_CustomerProfile_Co_Applicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Personal & Contact Details\"])[1]");
			Personal$ContactDetails_CustomerProfile_Co_Applicant.click();
			
			
			
			
			
			
			//*********************************************Basic Customer Profile for Co-Applicant******************************************************************
			
			WebElement Basic_Customer_Profile_CustomerProfile_Co_Applicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Basic Customer Profile\"])[1]");
			Basic_Customer_Profile_CustomerProfile_Co_Applicant.click();
			
//			ScrollDown(driver);
			Thread.sleep(2000);
			Co_Ordinate_Scroll(driver, 460, 1757, 460, 900);//scrolldown
			
			WebElement Total_Employment_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Total Employment\"]/android.view.View/android.widget.EditText");
			Total_Employment_CustomerProfile_Co_Applicant.click();
			Total_Employment_CustomerProfile_Co_Applicant.clear();
			Total_Employment_CustomerProfile_Co_Applicant.sendKeys("5");
			driver.hideKeyboard();
			
			ScrollDown_LittleBit(driver);
			
			WebElement Annual_Gross_Income_CustomerProfile_Co_Applicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Declared Annual Gross Income\"])[2]/android.view.View/android.widget.EditText");
			Annual_Gross_Income_CustomerProfile_Co_Applicant.click();
			Annual_Gross_Income_CustomerProfile_Co_Applicant.clear();
			Annual_Gross_Income_CustomerProfile_Co_Applicant.sendKeys("500000");
			driver.hideKeyboard();
			
			ScrollDown_LittleBit(driver);
			
			WebElement Annual_Gross_Obligations_CustomerProfile_Co_Applicant= explicityWait(wait, "(//android.view.View[@content-desc=\"Declared Annual Gross Obligations\"])[2]/android.view.View/android.widget.EditText");
			Annual_Gross_Obligations_CustomerProfile_Co_Applicant.click();
			Annual_Gross_Obligations_CustomerProfile_Co_Applicant.clear();
			Annual_Gross_Obligations_CustomerProfile_Co_Applicant.sendKeys("500000");
			driver.hideKeyboard();
			
			ScrollDown_LittleBit(driver);
			
			WebElement Name_Of_Orgination_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Name of Organization\"]/android.view.View/android.widget.EditText");
			Name_Of_Orgination_CustomerProfile_Co_Applicant.click();
			Name_Of_Orgination_CustomerProfile_Co_Applicant.clear();
			Name_Of_Orgination_CustomerProfile_Co_Applicant.sendKeys("Mahindra Finance");
			driver.hideKeyboard();
			
			WebElement Years_in_current_profession_CustomerProfile_Co_Applicant= explicityWait(wait, "//android.view.View[@content-desc=\"Years in current profession\"]/android.view.View/android.widget.EditText");
			Years_in_current_profession_CustomerProfile_Co_Applicant.click();
			Years_in_current_profession_CustomerProfile_Co_Applicant.clear();
			Years_in_current_profession_CustomerProfile_Co_Applicant.sendKeys("5");
			driver.hideKeyboard();
			
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			Co_Ordinate_Scroll(driver, 460, 760, 460, 1757);//scrollup
			
			Basic_Customer_Profile_CustomerProfile_Co_Applicant.click();
			
			
			WebElement ProceedBtn_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			ProceedBtn_CoApplicant.click();  
			
			WebElement Dedupe_SelectBtn_PrimaryApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Select￼\"]");
			Dedupe_SelectBtn_PrimaryApplicant.click();
			
			WebElement Dedupe_ProceedBtn_For_Applicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			Dedupe_ProceedBtn_For_Applicant.click(); 
			
			WebElement ClickOn_Back_To_HomeBtn = explicityWait(wait, "//android.widget.Button[@content-desc=\"Back to Home\"]");
			ClickOn_Back_To_HomeBtn.click(); 
			
			Thread.sleep(5000);
			WebElement AgainClickOnSanctionTab =  explicityWait(wait, "(//android.widget.Button[@index='1'])[4]");
			AgainClickOnSanctionTab.click();
			
			WebElement Again_ProceedBtn_For_Applicant_Sanction= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			Again_ProceedBtn_For_Applicant_Sanction.click(); 
			
			WebElement Dedupe_ProceedBtn_For_1st_CoApplicant= explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			Dedupe_ProceedBtn_For_1st_CoApplicant.click(); 
			
			WebElement ClickOn_Back_To_HomeBtn1 = explicityWait(wait, "//android.widget.Button[@content-desc=\"Back to Home\"]");
			ClickOn_Back_To_HomeBtn1.click(); 
			
			Thread.sleep(5000);
			explicityWait(wait, "(//android.widget.Button[@index='1'])[4]").isDisplayed();  //sanction is display
			
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();
			
			Thread.sleep(5000);
			WebElement ApplicationTab_isDisplay =   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@index='1'])[2]"))); 
			ApplicationTab_isDisplay.isDisplayed();   //click on Application Button
			
			Thread.sleep(5000);
			RefreshPage(driver);
			
			Thread.sleep(5000);
			WebElement ClickOn_Lead_AfterCompleteSanction = explicityWait(wait, "(//*[@class=\"android.view.View\"])[18]"); //click on leads
			ClickOn_Lead_AfterCompleteSanction.click();
			
			WebElement Applicant_Sanction_Tab = explicityWait(wait, "(//android.widget.Button[@index='1'])[4]");
			Applicant_Sanction_Tab.click();	
			
			WebElement Select_Offer_Applicant_Sanction_Tab = explicityWait(wait, "//android.widget.Button[@content-desc=\"Select\"]");
			Select_Offer_Applicant_Sanction_Tab.click();				
			
			WebElement ClickOn_RepaymentSchedule_Applicant_Sanction_Tab = explicityWait(wait, "//android.view.View[@content-desc=\"Repayment Schedule\"]");
			ClickOn_RepaymentSchedule_Applicant_Sanction_Tab.click();
			
			WebElement ClickOn_Repayment_GenerateScheduleBtn_Applicant_Sanction_Tab = explicityWait(wait, "//android.widget.Button[@content-desc=\"Generate Schedule\"]");
			ClickOn_Repayment_GenerateScheduleBtn_Applicant_Sanction_Tab.click();
			
			ScrollDown(driver);
			ScrollDown(driver);
			
			WebElement ClickOn_RepaymentSchedule_ProceedBtn_Applicant_Sanction_Tab = explicityWait(wait, "//android.widget.Button[@content-desc=\"Proceed\"]");
			ClickOn_RepaymentSchedule_ProceedBtn_Applicant_Sanction_Tab.click();
			
			  
						
							
			
			
		

	}
	
	
	
	
	
	
	//********************************************Here Onwards start method***************************************************************************************
	
	
	
	
	public static WebElement explicityWait(WebDriverWait wait, String webElement) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));
		return element;
	}
	
	public static WebElement explicityWaitUsing_ClassName(WebDriverWait wait, String webElement) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));
		return element;
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
	
	public static void Co_Ordinate_Scroll(AndroidDriver<WebElement> driver, int startX1, int startY1, int endX1, int endY1) {
		TouchAction touchAction = new TouchAction(driver);

		// Define the start and end points for the swipe
		int startX = startX1; // X coordinate for the start point
		int startY = startY1; // Y coordinate for the start point
		int endX = endX1;   // X coordinate for the end point
		int endY = endY1;   // Y coordinate for the end point

		// Perform the swipe action
		touchAction.press(PointOption.point(startX, startY))
		            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		            .moveTo(PointOption.point(endX, endY))
		            .release()
		            .perform();
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

}
