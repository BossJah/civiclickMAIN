package CampaignSettings;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import Test.AllTextInputs;
import Test.Browser;
import Test.CampaignElements;
import Test.LoginElements;

public class DeliverySettings_RedirectAdvocatesAfterTakingAction {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
				
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");

		Thread.sleep(6000);
		WebElement _email = driver.findElement
		(By.xpath(_login._email));
		_email.click();
		_email.sendKeys(_login._emailAccount);
		WebElement _password = driver.findElement
		(By.xpath(_login._password));
		_password.click();
		_password.sendKeys(_login._passwordAccount);
		Thread.sleep(100);
		WebElement _loginButton = driver.findElement
		(By.xpath(_login._loginButton));
		_loginButton.click();
		Thread.sleep(16000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(17000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Settings Tab..");
		System.out.println("=====================================================");
		WebElement _gotoSettingsTab = driver.findElement
		(By.cssSelector(_campaign._gotoSettingsTab));
		Thread.sleep(1000);
		_gotoSettingsTab.click();
		//Thread.sleep(300);
		
		WebElement _gotoDeliverySettingsTab = driver.findElement
		(By.cssSelector(_elements._gotoDeliverySettingsTab));
		Thread.sleep(100);
		_gotoDeliverySettingsTab.click();
		Thread.sleep(700);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,450)", "");
				
		WebElement _clickRedirectAdvocatesButton = driver.findElement
		(By.cssSelector(_elements._redirectAdvocatesButton));
		Thread.sleep(200);
		_clickRedirectAdvocatesButton.click();
		Thread.sleep(1000);
			
		WebElement _redirectLink = driver.findElement
		(By.cssSelector(_elements._redirectAdvocatesLinkTextArea));
		Thread.sleep(200);
		_redirectLink.click();
		_redirectLink.clear();
		_redirectLink.sendKeys(_allText._redirectLink);
		Thread.sleep(1000);		
		
		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(8000);
		
		//System.out.println("=====================================================");
		System.out.println("Navigate to Publish Tab..");
		System.out.println("=====================================================");
				
		WebElement _gotoPublishTab = driver.findElement
		(By.cssSelector(_campaign._gotoPublishTab));
		_gotoPublishTab.click();
		Thread.sleep(1000);

		JavascriptExecutor jah = (JavascriptExecutor) driver;
		jah.executeScript("window.scrollBy(0,2200)", "");
		
		
		//System.out.println("=====================================================");
		System.out.println("Navigate to Widget Link..");
		System.out.println("=====================================================");
		Thread.sleep(1000);
		WebElement _clickWidgetLink = driver.findElement
		(By.cssSelector(_campaign._clickWidgetLink));
		_clickWidgetLink.click();
		Thread.sleep(13000);

		//======================SWITCH TO NEW WINDOW==================================//			
		Set <String> handles = driver.getWindowHandles();		
		Iterator<String> it = handles.iterator();		
		String parentID = (String) it.next();
		String childID = (String) it.next();
		
		driver.switchTo().window(childID);
		//=========================================================================//			

				
		//===================================================W I D G E T   N E W   T A B =====================================================//		
		
		if(!handles.equals(parentID)) {			
			Thread.sleep(4000);
			WebElement _widgetFirstName = driver.findElement
			(By.cssSelector(_campaign._widgetFirstname));
			_widgetFirstName.click();
			_widgetFirstName.sendKeys(_allText._widgetFirstName);
			
			Thread.sleep(500);
			WebElement _widgetLastName = driver.findElement
			(By.cssSelector(_campaign._widgetLastname));
			_widgetLastName.click();
			_widgetLastName.sendKeys(_allText._widgetLastName);
			Thread.sleep(500);
			
			Thread.sleep(500);
			WebElement _phoneNumber = driver.findElement
			(By.cssSelector(_campaign._phoneTextArea));
			_phoneNumber.click();
			_phoneNumber.sendKeys(_allText._phone);
			Thread.sleep(1000);
			
			WebElement _testTextarea1 = driver.findElement
			(By.cssSelector(_campaign._testTextAreaRedirectAdvocates));
			_testTextarea1.click();
			_testTextarea1.sendKeys(_allText._test);
			Thread.sleep(500);
			
			WebElement _testTextarea2 = driver.findElement
			(By.cssSelector(_campaign._testTextArea2));
			_testTextarea2.click();
			Thread.sleep(500);
			
			WebElement _testTextarea2_DropdownValue = driver.findElement
			(By.cssSelector(_campaign._testTextArea2_DropdownValue));
			_testTextarea2_DropdownValue.click();
			Thread.sleep(500);
			
			WebElement _emailTextArea = driver.findElement
			(By.cssSelector(_campaign._emailTextArea));
			_emailTextArea.click();
			_emailTextArea.sendKeys(_allText._email);
			Thread.sleep(500);
			
			WebElement _addressTextArea = driver.findElement
			(By.cssSelector(_campaign._addressTextArea));
			_addressTextArea.click();
			_addressTextArea.sendKeys(_allText._constituentAddress);
			Thread.sleep(500);
		
			WebElement _cityTextArea = driver.findElement
			(By.cssSelector(_campaign._cityTextArea));
			_cityTextArea.click();
			_cityTextArea.sendKeys(_allText._constituentCity);
			Thread.sleep(500);
			
			WebElement _stateButton = driver.findElement
			(By.cssSelector(_elements._constituentStateButton));
			_stateButton.click();			
			Thread.sleep(500);
			
			WebElement _stateButtonValue = driver.findElement
			(By.cssSelector(_elements._constituentStateButtonValue));
			_stateButtonValue.click();
			Thread.sleep(500);
			
			WebElement _ZIPTextArea = driver.findElement
			(By.cssSelector(_campaign._ZIPTextArea));
			_ZIPTextArea.click();
			_ZIPTextArea.sendKeys(_allText._constituentZIP);
			Thread.sleep(500);
		
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(3000);
			
			WebElement _clickSendMailButton = driver.findElement
			(By.cssSelector(_campaign._sendMailButton));
			_clickSendMailButton.click();
			Thread.sleep(8000);
						
			WebElement _getSendEmailConfirmationMessage = driver.findElement
			(By.xpath(_elements._sendEmailConfirmationMessage));
			Thread.sleep(1000);
			if(_getSendEmailConfirmationMessage.isDisplayed()) {
				Thread.sleep(1000);
				String _confirmationMessage = _getSendEmailConfirmationMessage.getText();
				//System.out.println("=====================================================");
				System.out.println("Email successfully sent..");
				System.out.println("=====================================================");
				System.out.println(_confirmationMessage);
				System.out.println("=====================================================");
				Thread.sleep(2000);
						
			}else {
				//System.out.println("=====================================================");
				System.out.println("Please Fill up required fields..");
				System.out.println("=====================================================");
				}	
						
			}
			Thread.sleep(13000);
						
		Set <String> handles2 = driver.getWindowHandles();		
		Iterator<String> it2 = handles2.iterator();		
		String parentID2 = (String) it2.next();
		String childID2 = (String) it2.next();
		String subChildID = (String) it2.next();
		
		parentID2=parentID;
		childID2=childID;
		
		driver.switchTo().window(subChildID);
		
		if(!handles2.equals(parentID2)) {	
			if(!handles2.equals(childID2)) {	
			
			File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				//System.out.println("=====================================================");
				System.out.println("Taking Screenshot..");
				System.out.println("=====================================================");
	            FileUtils.copyFile(screenshotMid, new File("C:\\CiviTestScreenshot\\RedirectAdvocatesLink.png"));   	           
	            Thread.sleep(2000);
	                 	            
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
							
			}	
		}
							

	}
	

}
