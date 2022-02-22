package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestcase {

	public static void main(String[] args) {
		//step 1.manage the webdriver
		
		WebDriverManager.chromedriver().setup();
		
		//step 2.launch the driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//step3.Maximize the driver
		
		driver.manage().window().maximize();
		
		//step4. Launch url
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//step5.get title of the webpage
		
		String title=driver.getTitle();
		System.out.println("Tiltle of the WebPage is = "+title);
		
		//step 6.Entr username
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
		
		//driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Kalaimani");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G S");
		
		//driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Sales");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("gayu");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("gs");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/13/93");
		
		//driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("600000");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5000");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("637852");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ghj");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hai");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("hey");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("637857");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9942379161");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("keerthi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayugs121@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.ghd.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("selvaraj");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("mani");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("42/1 vip nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("pavadi street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Erode");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637998");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("91");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(dropdown1);
		drop1.selectByVisibleText("Direct Mail");
		
		WebElement dropdown2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select drop2=new Select(dropdown2);
	    drop2.selectByIndex(3);
	    
	    WebElement dropdown3=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drop3=new Select(dropdown3);
		drop3.selectByIndex(2);
		
		
		
		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop4=new Select(dropdown4);
		drop4.selectByVisibleText("S-Corporation");
		
		
		WebElement dropdown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop5=new Select(dropdown5);
		drop5.selectByVisibleText("Armed Forces Americas");
		
		WebElement dropdown6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop6=new Select(dropdown6);
		drop6.selectByVisibleText("Angola");
		WebElement dropdown7 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drop7=new Select(dropdown7);
		drop7.selectByVisibleText("Computer Software");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1=driver.getTitle();
		System.out.println("Title is =" +title1);
		
		if(title1.contains("View Lead")) 
		{
			System.out.println("matches");
			}
		else
		{
			System.out.println("not Matched");
		}
	
		
		
	}

}
