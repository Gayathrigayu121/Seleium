package learnautomation;


import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Utility;

public class FacebookScreenShot {

	
	ChromeDriver driver;
	
	
	@Test
	public void CaptureScreenShot() throws Exception {
	WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://Program Files//Google//Chrome//Application//chrome.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//Utility.CaptureScreenshot(driver, "homepage");
		driver.findElement(By.xpath("//input[@name='emailfdf']")).sendKeys("wdhge");
		//Utility.CaptureScreenshot(driver, "email");
		//driver.findElement(By.xpath("//input[@name='pss']")).sendKeys("gaghyu");
		//Utility.CaptureScreenshot(driver, "password");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//Utility.CaptureScreenshot(driver, "Login");
		
		}
	@AfterMethod
public void tearDown(ITestResult result) {
		
		System.out.println("status is"+result.getStatus());
	if(ITestResult.FAILURE==result.getStatus()) {
		Utility.CaptureScreenshot(driver, result.getName());
	}
}
}
