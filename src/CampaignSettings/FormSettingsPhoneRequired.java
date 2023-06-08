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

public class FormSettingsPhoneRequired {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ======================================================================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Robot robot = new Robot();
		Elements _elements = new Elements();

		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

		// ============================================================== L O G I N
		Thread.sleep(6000);
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
		Thread.sleep(5000);

		robot.mouseMove(65, 330);
		Thread.sleep(10000);

		WebElement _gotoSettingsTab = driver.findElement
		(By.cssSelector(_campaign._gotoSettingsTab));
		Thread.sleep(1000);
		_gotoSettingsTab.click();
		Thread.sleep(1500);

		WebElement _makePhoneRequired = driver.findElement(By.xpath(_campaign._makePhoneRequiredButton));
		_makePhoneRequired.click();
		Thread.sleep(600);
		
		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(8000);
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-1400)", "");
		
		
		WebElement _gotoDeliverySettingsTab = driver.findElement
		(By.cssSelector(_elements._gotoDeliverySettingsTab));
		Thread.sleep(100);
		_gotoDeliverySettingsTab.click();
		Thread.sleep(700);
		
		
		WebElement _gotoPublishTab = driver.findElement
		(By.cssSelector(_campaign._gotoPublishTab));
		_gotoPublishTab.click();
		Thread.sleep(1000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1400)", "");
		
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
			_emailTextArea.sendKeys(_allText._email);
			Thread.sleep(500);
			
			WebElement _addressTextArea = driver.findElement
			(By.cssSelector(_campaign._addressTextArea));
			_addressTextArea.click();
			_addressTextArea.sendKeys(_allText._address);
			Thread.sleep(500);
		
			WebElement _cityTextArea = driver.findElement
			(By.cssSelector(_campaign._cityTextArea));
			_cityTextArea.click();
			_cityTextArea.sendKeys(_allText._city);
			Thread.sleep(500);
			
			WebElement _stateTextArea = driver.findElement
			(By.cssSelector(_campaign._stateTextArea));
			_stateTextArea.click();
			_stateTextArea.sendKeys(_allText._state);
			Thread.sleep(500);
			
			WebElement _ZIPTextArea = driver.findElement
			(By.cssSelector(_campaign._ZIPTextArea));
			_ZIPTextArea.click();
			_ZIPTextArea.sendKeys(_allText._ZIP);
			Thread.sleep(500);
			
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("window.scrollBy(0,1000)", "");
						
			Thread.sleep(4000);
			WebElement _clickSendMailButton = driver.findElement
			(By.cssSelector(_campaign._sendMailButton));
			_clickSendMailButton.click();
			Thread.sleep(2500);
						
			WebElement _phoneRequiredErrorMessage = driver.findElement
			(By.cssSelector(_campaign._phoneRequiredErrorMessage));
					
				if(_phoneRequiredErrorMessage.isEnabled()) {
					Thread.sleep(1000);
					System.out.println("=====================================================");
					System.out.println("Phone is Required. Please fill in your phone number..");
					System.out.println("=====================================================");
					Thread.sleep(2000);
					WebElement _flag2 = driver.findElement
					(By.cssSelector(_campaign._flag2));
					_flag2.click();
					Thread.sleep(2000);
					}else {
						System.out.println("=====================================================");
						System.out.println("Email Successfully Submitted..");
						System.out.println("=====================================================");
					}						
			
		}
		
			

	}

}
