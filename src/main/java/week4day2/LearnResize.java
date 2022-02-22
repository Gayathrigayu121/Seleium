package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnResize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resizable/");
		
		//driver.switchTo().frame(0);
		WebElement frame0 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame0);
		
	 driver.findElement(By.xpath("//div[@id='resizable']"));
		
		//driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		
		driver.switchTo().defaultContent();
		
		Actions builder=new Actions(driver);
		builder.doubleClick(drag).moveToElement(drag, 50, 80).perform();
	//	builder.clickAndHold(drag).perform();
		
		
	}

}
