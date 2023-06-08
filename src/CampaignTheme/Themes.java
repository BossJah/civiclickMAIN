package CampaignTheme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import Test.AllTextInputs;
import Test.Browser;
import Test.CampaignElements;
import Test.LoginElements;
import CampaignSettings.Elements;

public class Themes {

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

		Thread.sleep(7000);
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
		Thread.sleep(17000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(16000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Theme Tab..");
		System.out.println("=====================================================");
		WebElement _gotoThemeTab = driver.findElement
		(By.cssSelector(_elements._gotoThemeTab));
		Thread.sleep(1000);
		_gotoThemeTab.click();
		Thread.sleep(5000);
		
				WebElement _clickBackGroundColor = driver.findElement
				(By.cssSelector(_elements._backGroundColor));
				Thread.sleep(500);
				_clickBackGroundColor.click();
				Thread.sleep(1000);
				
						WebElement _colorCodeTextArea = driver.findElement
						(By.cssSelector(_elements._colorCodeTextArea));
						Thread.sleep(1000);
						_colorCodeTextArea.click();
						_colorCodeTextArea.clear();
						_colorCodeTextArea.sendKeys(_allText._colorCode);
						Thread.sleep(1000);
		
								WebElement _clickButtonColor = driver.findElement
								(By.cssSelector(_elements._buttonColor));
								Thread.sleep(500);
								_clickButtonColor.click();
								Thread.sleep(1000);
								
										WebElement _colorButtonTextArea = driver.findElement
										(By.cssSelector(_elements._colorCodeButtonTextArea));
										Thread.sleep(500);
										_colorButtonTextArea.click();
										_colorButtonTextArea.clear();
										_colorButtonTextArea.sendKeys(_allText._colorCodeButton);
										Thread.sleep(1000);
										
												WebElement _clickFontColorButton = driver.findElement
												(By.cssSelector(_elements._fontColorButton));
												Thread.sleep(100);
												_clickFontColorButton.click();
												Thread.sleep(500);
										
														WebElement _fontColorCodeTextArea = driver.findElement
														(By.cssSelector(_elements._fontColorTextArea));
														Thread.sleep(100);
														_fontColorCodeTextArea.click();
														_fontColorCodeTextArea.clear();
														_fontColorCodeTextArea.sendKeys(_allText._fontColorCode);
														Thread.sleep(500);
														
																WebElement _fontStyleButton = driver.findElement
																(By.cssSelector(_elements._fontStyleButton));
																Thread.sleep(100);
																_fontStyleButton.click();
																Thread.sleep(500);
																
																		WebElement _fontStyleButtonValue = driver.findElement
																		(By.cssSelector(_elements._fontStyleValue));
																		Thread.sleep(100);
																		_fontStyleButtonValue.click();
																		Thread.sleep(500);
														
																		
																				WebElement _clickPreviewButton = driver.findElement
																				(By.cssSelector(_elements._clickPreviewButton));
																				Thread.sleep(200);
																				_clickPreviewButton.click();
																				Thread.sleep(8000);
		
																						WebElement _clickFlag = driver.findElement
																						(By.cssSelector(_elements._flag1));
																						Thread.sleep(100);
																						_clickFlag.click();
																						Thread.sleep(500);
														
																						WebElement _clickFlag2 = driver.findElement
																								(By.cssSelector(_elements._flag2));
																						Thread.sleep(100);
																						_clickFlag2.click();
																						Thread.sleep(500);
																
																				WebElement _clickFlag3 = driver.findElement
																								(By.cssSelector(_elements._flag3));
																				Thread.sleep(100);
																				_clickFlag3.click();
																				Thread.sleep(500);
																			    
																		WebElement _clickFlag4 = driver.findElement
																		(By.cssSelector(_elements._flag4));
																		Thread.sleep(100);
																		_clickFlag4.click();
																		Thread.sleep(500);	
																				
																WebElement _clickPreviewCloseButton = driver.findElement
																(By.cssSelector(_elements._previewCloseButton));
																Thread.sleep(100);
																_clickPreviewCloseButton.click();
																Thread.sleep(1000);
																			    
																			    
														
			System.out.println("Navigate to Publish Tab..");
			System.out.println("=====================================================");
																									
			WebElement _gotoPublishTab = driver.findElement
			(By.cssSelector(_campaign._gotoPublishTab));
			_gotoPublishTab.click();
			Thread.sleep(700);		
			
					WebElement _clickYesButton = driver.findElement
					(By.cssSelector(_elements.__clickYesButton));
					_clickYesButton.click();
					Thread.sleep(3000);		
					
							WebElement _gotoPublishTab2 = driver.findElement
							(By.cssSelector(_campaign._gotoPublishTab));
							_gotoPublishTab2.click();
							Thread.sleep(2000);		
							JavascriptExecutor jah1 = (JavascriptExecutor) driver;
							jah1.executeScript("window.scrollBy(0,2200)", "");
							
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
									

									//Thread.sleep(13000);
									//===================================================W I D G E T   N E W   T A B =====================================================//		
									
									if(!handles.equals(parentID)) {		
										//System.out.println("=====================================================");
										System.out.println("Checking Widget Link colors..");
										System.out.println("=====================================================");
										JavascriptExecutor jah2 = (JavascriptExecutor) driver;
										jah2.executeScript("window.scrollBy(0,500)", "");
										Thread.sleep(1000);
											JavascriptExecutor jah3 = (JavascriptExecutor) driver;
											jah3.executeScript("window.scrollBy(0,500)", "");
											Thread.sleep(1000);
												JavascriptExecutor jah4 = (JavascriptExecutor) driver;
												jah4.executeScript("window.scrollBy(0,500)", "");
												Thread.sleep(1000);
													JavascriptExecutor jah5 = (JavascriptExecutor) driver;
													jah5.executeScript("window.scrollBy(0,-2500)", "");
													Thread.sleep(2000);														
														WebElement _flag6 = driver.findElement
														(By.cssSelector(_campaign._widgetFirstname));
														_flag6.click();
														Thread.sleep(2000);			
									}
										
		

	}
	

}
