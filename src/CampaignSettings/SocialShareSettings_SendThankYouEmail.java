package CampaignSettings;

import org.apache.commons.io.FileUtils;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class SocialShareSettings_SendThankYouEmail {

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
		WebElement _loginButton = driver.findElement
		(By.xpath(_login._loginButton));
		_loginButton.click();
		Thread.sleep(16000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(16000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Settings Tab..");
		System.out.println("=====================================================");
		WebElement _gotoSettingsTab = driver.findElement
		(By.cssSelector(_campaign._gotoSettingsTab));
		Thread.sleep(1000);
		_gotoSettingsTab.click();
		//Thread.sleep(300);
		
		WebElement _gotoSocialShareSettings = driver.findElement
		(By.cssSelector(_elements._gotoSocialShareSettings));
		Thread.sleep(100);
		_gotoSocialShareSettings.click();
		Thread.sleep(700);
						
		WebElement _clickSendThankYouEmailCheckBox = driver.findElement
		(By.cssSelector(_elements._clickSendThankYouEmailCheckBox));
		Thread.sleep(200);
		_clickSendThankYouEmailCheckBox.click();
		Thread.sleep(1000);
					
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		WebElement _sendFromNameTextArea = driver.findElement
				(By.cssSelector(_elements._sendFromNameTextArea));
				Thread.sleep(200);
				_sendFromNameTextArea.click();
				_sendFromNameTextArea.clear();
				_sendFromNameTextArea.sendKeys(_allText._sendFromNameInput);
				Thread.sleep(100);						
				WebElement _sendFromEmailTextArea = driver.findElement
						(By.cssSelector(_elements._sendFromEmailTextArea));
						Thread.sleep(200);
						//_sendFromEmailTextArea.click();
//						_sendFromEmailTextArea.clear();
//						_sendFromEmailTextArea.sendKeys(_allText._sendFromNameInput);
						Thread.sleep(100);
						
						WebElement _emailSubject = driver.findElement
								(By.cssSelector(_elements._emailSubjectTextArea));
								Thread.sleep(200);
								//_emailSubject.click();
//								_emailSubject.clear();
//								_emailSubject.sendKeys(_allText._sendFromNameInput);
								Thread.sleep(1000);								
								WebElement _emailBody = driver.findElement
										(By.cssSelector(_elements._emailBody));
										Thread.sleep(200);
										_emailBody.click();		
										 robot.keyPress(KeyEvent.VK_CONTROL);
										 Thread.sleep(50);
										 robot.keyPress(KeyEvent.VK_A);
										 Thread.sleep(50);
										 robot.keyPress(KeyEvent.VK_DELETE);
										 Thread.sleep(50);
										 robot.keyRelease(KeyEvent.VK_CONTROL);
										 Thread.sleep(50);										
										Thread.sleep(1000);
										 robot.keyPress(KeyEvent.VK_T);
										 Thread.sleep(100);
										 robot.keyPress(KeyEvent.VK_E);
										 Thread.sleep(100);
										 robot.keyPress(KeyEvent.VK_S);
										 Thread.sleep(100);
										 robot.keyPress(KeyEvent.VK_T);
										 Thread.sleep(100);		
										 WebElement _clickParagraph = driver.findElement
													(By.cssSelector(_elements._paragraphButton));
													Thread.sleep(500);
													_clickParagraph.click();
													 Thread.sleep(2000);
													 WebElement _clickParagraphHeading1 = driver.findElement
																(By.xpath(_elements._paragraphHeading1));												
																_clickParagraphHeading1.click();	
																 Thread.sleep(500);
																 robot.keyPress(KeyEvent.VK_CONTROL);
																 Thread.sleep(50);
																 robot.keyPress(KeyEvent.VK_A);
																 Thread.sleep(50);
																 robot.keyRelease(KeyEvent.VK_CONTROL);
																 Thread.sleep(50);
																WebElement _clickFontStyle = driver.findElement
																		(By.cssSelector(_elements._fontStyle));							
																		_clickFontStyle.click();
																		Thread.sleep(1000);
																		WebElement _clickFontStyleValue1 = driver.findElement
																				(By.xpath(_elements._fontStyleValue1));
																				//Thread.sleep(500);
																				_clickFontStyleValue1.click();
																				Thread.sleep(1000);
																				WebElement _clickFontStyle2 = driver.findElement
																						(By.cssSelector(_elements._fontStyle));																				
																						_clickFontStyle2.click();
																				Thread.sleep(1000);
																				WebElement _clickFontStyleValue2 = driver.findElement
																						(By.xpath(_elements._fontStyleValue2));																					
																						_clickFontStyleValue2.click();
																						Thread.sleep(1000);
																				WebElement _clickFontSize = driver.findElement
																				(By.cssSelector(_elements._fontSize));																					
																				_clickFontSize.click();
																				Thread.sleep(1000);
																		WebElement _fontSizeValue1 = driver.findElement
																		(By.xpath(_elements._fontSizeValue1));																					
																		_fontSizeValue1.click();
																		Thread.sleep(1000);
																WebElement _clickFontSize2 = driver.findElement
																(By.cssSelector(_elements._fontSize));																					
																_clickFontSize2.click();
																Thread.sleep(1000);
													WebElement _fontSizeValue2 = driver.findElement
													(By.xpath(_elements._fontSizeValue2));																					
													_fontSizeValue2.click();
													Thread.sleep(1000);
													 robot.keyPress(KeyEvent.VK_T);
													 Thread.sleep(100);
													 robot.keyPress(KeyEvent.VK_E);
													 Thread.sleep(100);
													 robot.keyPress(KeyEvent.VK_S);
													 Thread.sleep(100);
													 robot.keyPress(KeyEvent.VK_T);
													 Thread.sleep(100);			
													 robot.keyPress(KeyEvent.VK_ENTER);
													 Thread.sleep(500);
													JavascriptExecutor var1 = (JavascriptExecutor) driver;
													var1.executeScript("window.scrollBy(0,300)", "");
											WebElement _clickLinkToCampaign = driver.findElement
											(By.cssSelector(_elements._linkToCampagin));																					
											_clickLinkToCampaign.click();
											Thread.sleep(500);
											robot.keyPress(KeyEvent.VK_ENTER);
											Thread.sleep(200);
									WebElement _clickInsertAdvocatesFirstName = driver.findElement
									(By.cssSelector(_elements._linkToInsertAdvocatesFirstName));																					
									_clickInsertAdvocatesFirstName.click();
									Thread.sleep(500);
									
		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(6000);
			
		JavascriptExecutor jah1 = (JavascriptExecutor) driver;
		jah1.executeScript("window.scrollBy(0,-2200)", "");
		WebElement _gotoDeliverySettingsTab = driver.findElement
		(By.cssSelector(_elements._gotoDeliverySettingsTab));
		Thread.sleep(100);
		_gotoDeliverySettingsTab.click();
		Thread.sleep(1000);
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
		//String subchildID = (String) it.next();
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
					
						if(_getSendEmailConfirmationMessage.isEnabled()) {
							Thread.sleep(1000);
							String _confirmationMessage = _getSendEmailConfirmationMessage.getText();
							System.out.println("=====================================================");
							System.out.println("Email successfully sent..");
							System.out.println("=====================================================");
							System.out.println(_confirmationMessage);
							System.out.println("=====================================================");
							Thread.sleep(2000);						
							}else {
								System.out.println("=====================================================");
								System.out.println("Please fill up the required fields..");
								System.out.println("=====================================================");
							}					
		
						((JavascriptExecutor) driver).executeScript("window.open()");
						ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
						//To open  new tab
						driver.switchTo().window(tabs.get(2));
						Thread.sleep(2000);
						driver.get("https://outlook.office.com/mail/");
						
						Thread.sleep(4000);
						WebElement _outlookEmail = driver.findElement
						(By.cssSelector(_elements._outlookEmail));
						_outlookEmail.click();
						_outlookEmail.sendKeys(_allText._outlookEmail);
						Thread.sleep(1000);
								WebElement _nextButton = driver.findElement
								(By.cssSelector(_elements._outlookNextOrSignInButton));
								_nextButton.click();								
								Thread.sleep(1500);
										WebElement _outlookPassword = driver.findElement
										(By.cssSelector(_elements._outlookPassword));
										_outlookPassword.click();
										_outlookPassword.sendKeys(_allText._outlookPassword);
										Thread.sleep(1000);
										System.out.println("============================================================================");
										System.out.println("Please Enter the Authenticator Code and Press Enter Twice in your Keyboard..");
										System.out.println("============================================================================");
												WebElement _signInButton = driver.findElement
												(By.cssSelector(_elements._outlookNextOrSignInButton));
												_signInButton.click();												
												//Thread.sleep(10000);
														Thread.sleep(15000);
														WebElement _staySignInButton = driver.findElement
														(By.cssSelector(_elements._outlookStaySignInYesNoButton));
														_staySignInButton.click();
														Thread.sleep(15000);
//																WebElement _clickNewestEmail = driver.findElement
//																(By.cssSelector(_elements._newestEmail));
//																Thread.sleep(2000);
//																_clickNewestEmail.click();
//																Thread.sleep(6000);
						
						
		}


	}
	

}
