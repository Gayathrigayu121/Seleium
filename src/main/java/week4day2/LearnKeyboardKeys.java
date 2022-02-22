package week4day2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnKeyboardKeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://jqueryui.com/sortable/");
		
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		
		
	}

}
