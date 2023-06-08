package CampaignSettings;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import ScreenShot.ScreenShotTestCompare_Top;




import Test.AllTextInputs;
import Test.Browser;
import Test.CampaignElements;
import Test.LoginElements;

public class ScreenShoot {
	
	
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ======================================================================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		Robot robot = new Robot();
		ScreenShotTestCompare_Top screenShot = new ScreenShotTestCompare_Top();
		
		

		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

		// ============================================================== L O G I N
		Thread.sleep(2000);
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
		
		
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollBy(0,600)", "");
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
                       
            FileUtils.copyFile(screenshot, new File("C:\\CiviTestScreenshot\\Actual_Image1.png"));   
            screenShot.main(args);
                 	            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
	}
	
	
	
//	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//
//        //Convert web driver object to TakeScreenshot
//
//        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//
//        //Call getScreenshotAs method to create image file
//
//                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//            //Move image file to new destination
//
//                File DestFile=new File(fileWithPath);
//
//                //Copy file at destination
//
//                FileUtils.copyFile(SrcFile, DestFile);
//
//    }

}
