package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@Parameters({"username","password","url"})
	@BeforeMethod
	public  void runCreatLead(String uName,String pWord,String url) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("uName");
		driver.findElement(By.id("password")).sendKeys("pWord");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
//		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
//		driver.findElement(By.name("submitButton")).click();
		//driver.close();

}
}