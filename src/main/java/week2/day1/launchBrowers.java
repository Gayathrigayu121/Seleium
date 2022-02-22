package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class launchBrowers {

	public static void main(String[] args) {  
    //Step1:Manages the driver
		WebDriverManager.chromedriver().setup();
		
		//step2:Launch the driver
		ChromeDriver driver=new ChromeDriver();
		
		//step3:maximize the driver
		driver.manage().window().maximize();
		
		//step4:lauch url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Step 5:title of current page
		String title=driver.getTitle();
		System.out.println("title:"+title);
		//Step6:close the browers
		//driver.close();
		
		//step 6:Enter username
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		//step 7 entr psd
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		
		//click on login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfLink.click();
		
		
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		 countryCode.clear();
		 countryCode.sendKeys("4");
		 
		
		

	}

}
