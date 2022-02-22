package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		
		WebElement webEle = driver.findElement(By.linkText("KIDS"));
		Actions builder=new Actions(driver);
		builder.moveToElement(webEle).perform();
		
		//Right click()
		//builder.contextClick().perform();
		// double click
		builder.doubleClick().perform();
		
		
		
	}

}
