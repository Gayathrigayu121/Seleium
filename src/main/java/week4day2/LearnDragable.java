package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/drag.html");
		
		WebElement webDrag = driver.findElement(By.id("draggable"));
		
		Actions builder=new Actions(driver);
		
		builder.dragAndDropBy(webDrag, 100,100).perform();
		
		
		
		
		
		
		
		
		

	}

}
