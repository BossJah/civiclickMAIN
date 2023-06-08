package CampaignSettings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import Test.AllTextInputs;
import Test.Browser;
import Test.CampaignElements;
import Test.LoginElements;

public class DeliverySettings_ConstituentMailOnly {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		Robot robot = new Robot();

		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

		// ==============================================================
		Thread.sleep(4000);
		WebElement _email = driver.findElement
		(By.xpath(_login._email));
		_email.click();
		_email.sendKeys(_login._emailAccount);
		WebElement _password = driver.findElement
		(By.xpath(_login._password));
		_password.click();
		_password.sendKeys(_login._passwordAccount);
		WebElement _loginButton = driver.findElement
		(By.xpath(_login._loginButton));
		_loginButton.click();
		Thread.sleep(15000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._clickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(17000);

//		robot.mouseMove(65, 330);
//		Thread.sleep(10000);

		WebElement _gotoSettingsTab = driver.findElement
		(By.cssSelector(_campaign._gotoSettingsTab));
		Thread.sleep(1000);
		_gotoSettingsTab.click();
		Thread.sleep(300);
		
		WebElement _gotoDeliverySettingsTab = driver.findElement
		(By.cssSelector(_elements._gotoDeliverySettingsTab));
		Thread.sleep(100);
		_gotoDeliverySettingsTab.click();
		Thread.sleep(700);
				
		WebElement _clickConstituentMailOnlyButton = driver.findElement
		(By.cssSelector(_elements._clickConstituentMailOnlyButton));
		Thread.sleep(200);
		//_clickConstituentMailOnlyButton.click();
		Thread.sleep(1000);
										
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollBy(0,400)", "");
			
		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(8000);
		WebElement _gotoPublishTab = driver.findElement
		(By.cssSelector(_campaign._gotoPublishTab));
		_gotoPublishTab.click();
		Thread.sleep(1000);

		JavascriptExecutor jah = (JavascriptExecutor) driver;
		jah.executeScript("window.scrollBy(0,2200)", "");
		
		Thread.sleep(1000);
		WebElement _clickWidgetLink = driver.findElement
		(By.cssSelector(_campaign._clickWidgetLink));
		_clickWidgetLink.click();
		Thread.sleep(13000);

		//======================SWITCH TO NEW WINDOW==================================//			
		Set <String> handles = driver.getWindowHandles();		
		Iterator it = handles.iterator();		
		String parentID = (String) it.next();
		String childID = (String) it.next();		
		driver.switchTo().window(childID);
		//=========================================================================//			

		
		
		//===================================================W I D G E T   N E W   T A B =====================================================//		
		
		if(!handles.equals(parentID)) {			
			Thread.sleep(3000);
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
			_phoneNumber.sendKeys(_allText._constituentPhone);
			Thread.sleep(500);
			
			WebElement _testTextarea1 = driver.findElement
			(By.cssSelector(_campaign._testTextArea1));
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
			_emailTextArea.sendKeys(_allText._kioskEmail);
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
			
			System.out.println("=====================================================");
			System.out.println("Getting the First Address details..");					
			System.out.println("=====================================================");
			
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollBy(0,1000)", "");
			
						
			Thread.sleep(1000);			
			WebElement _clickSendMeTextMessageCheckbox = driver.findElement
			(By.cssSelector(_elements._sendMeTextMessageCheckbox));
			//_clickSendMeTextMessageCheckbox.click();
			Thread.sleep(7000);		
			
					String _getSendingToDetais_Address1 = driver.findElement
					(By.xpath(_elements._constituentSendingToDetails_Address1)).getText();
					Thread.sleep(1000);			
					String _detailsAddress1 = _getSendingToDetais_Address1;
			
					//System.out.println("=====================================================");
					System.out.println(_detailsAddress1);
					System.out.println("=====================================================");
					Thread.sleep(2000);		
			
			//System.out.println("=====================================================");
			System.out.println("Getting the Second Address details..");					
			System.out.println("=====================================================");
			Thread.sleep(500);
			WebElement _phoneNumberSecondAddress = driver.findElement
			(By.cssSelector(_campaign._phoneTextArea));
			_phoneNumberSecondAddress.click();
			_phoneNumberSecondAddress.clear();
			_phoneNumberSecondAddress.sendKeys(_allText._constituentSecondPhone);
			Thread.sleep(500);
			
			WebElement _addressForSecondAddress = driver.findElement
			(By.cssSelector(_campaign._addressTextArea));
			_addressForSecondAddress.click();
			_addressForSecondAddress.clear();
			_addressForSecondAddress.sendKeys(_allText._constituentSecondAddress);
			Thread.sleep(500);
			
			WebElement _citySecondAddressTextArea = driver.findElement
			(By.cssSelector(_campaign._cityTextArea));
			_citySecondAddressTextArea.click();
			_citySecondAddressTextArea.clear();
			_citySecondAddressTextArea.sendKeys(_allText._constituentSecondCity);
			Thread.sleep(500);
			
			WebElement _stateButtonSecondAddress = driver.findElement
			(By.cssSelector(_elements._constituentStateButton));
			_stateButtonSecondAddress.click();			
			Thread.sleep(500);
					
			WebElement _stateButtonSecondAddressValue = driver.findElement
			(By.cssSelector(_elements._constituentSecondStateButtonValue));
			_stateButtonSecondAddressValue.click();
			Thread.sleep(500);
			
			WebElement _ZIPSecondAddressTextArea = driver.findElement
			(By.cssSelector(_campaign._ZIPTextArea));
			_ZIPSecondAddressTextArea.click();
			_ZIPSecondAddressTextArea.clear();
			_ZIPSecondAddressTextArea.sendKeys(_allText._constituentSecondZIP);
			Thread.sleep(500);
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("window.scrollBy(0,1000)", "");
			
					Thread.sleep(4000);
					String _getSendingToDetais_Address2 = driver.findElement
					(By.xpath(_elements._constituentSendingToDetails_Address1)).getText();
					Thread.sleep(1000);			
					String _detailsAddress2 = _getSendingToDetais_Address2;
					
					//System.out.println("=====================================================");
					System.out.println(_detailsAddress2);
					System.out.println("=====================================================");
					Thread.sleep(2000);		
		}
		
			

	}

}
