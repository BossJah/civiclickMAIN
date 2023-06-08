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
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import Test.AllTextInputs;
import Test.Browser;
import Test.CampaignElements;
import Test.LoginElements;

public class SocialShareSettings_TwitterTextAndTag {

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
		
		WebElement _gotoSocialShareSettings = driver.findElement
		(By.cssSelector(_elements._gotoSocialShareSettings));
		Thread.sleep(100);
		_gotoSocialShareSettings.click();
		Thread.sleep(1500);
				
		WebElement __twitterShareTextArea = driver.findElement
		(By.cssSelector(_elements.__twitterShareTextArea));
		Thread.sleep(100);
		__twitterShareTextArea.click();
		__twitterShareTextArea.clear();
		__twitterShareTextArea.sendKeys(_allText._test);
		Thread.sleep(500);
		
		WebElement __twitterMentionTagTextArea = driver.findElement
		(By.cssSelector(_elements.__twitterMentionTagTextArea));
		Thread.sleep(100);
		__twitterMentionTagTextArea.click();
		__twitterMentionTagTextArea.clear();
		__twitterMentionTagTextArea.sendKeys(_allText._test);
		Thread.sleep(500);

		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(6000);

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
			JavascriptExecutor jah1 = (JavascriptExecutor) driver;
			jah1.executeScript("window.scrollBy(0,-2200)", "");					
			WebElement _clickTwitterIcon = driver.findElement
			(By.cssSelector(_elements._twitterIcon));
			_clickTwitterIcon.click();
			Thread.sleep(10000);								
		}
		
		Set <String> handles2 = driver.getWindowHandles();		
		Iterator<String> it2 = handles2.iterator();		
		String parentID2 = (String) it2.next();
		String childID2 = (String) it2.next();
		String subchildID = (String) it2.next();
		parentID2 =parentID;
		childID2=childID;		
		driver.switchTo().window(subchildID);

		if(!handles2.equals(parentID2)) {	
			if(!handles2.equals(childID2)) {	
			
			File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
	                       
	            FileUtils.copyFile(screenshotMid, new File("C:\\CiviTestScreenshot\\TestTwitter.png"));   	           
	            Thread.sleep(2000);
	                 	            
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
							
			}	
		}

	}
	

}
