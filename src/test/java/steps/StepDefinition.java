package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	

public ChromeDriver driver;
@Given("open chrome")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given ("load applica url ")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	
	@Given ("entr username Demosalesmanager")
	public void entrUser() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	
	@Given ("entr pwd crmsfa")
	public void entrPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	
	@When ("click login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();	
	}
	
    @Then("homepage displayed")
	public void homePage() {
		System.out.println("ff");
    }
    @But("error displayed")
		public void verifyErrorMessage() {
		System.out.println("error");
		}
		
	}
	

