package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition1 {
	

public ChromeDriver driver;
@Given("open chrome")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given ("load applica url{string}")
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	@Given ("entr username {string}")
	public void entrUser(String usr) {
		driver.findElement(By.id("username")).sendKeys(usr);
	}
	
	@Given ("entr pwd crmsfa{string}")
	public void entrPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	
	@When ("click login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();	
	}
	
    @Then("homepage displayed")
	public void homePage() {
		System.out.println("ff");
		
	}
	
}
