package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWait {

	public static void main(String[] args) {
		// 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/disapper.html");
		WebElement webDisapp = driver.findElement(By.xpath("//button[@id='btn']/b[1]"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.invisibilityOf(webDisapp));
		String text=driver.findElement(By.tagName("strong")).getText();
		System.out.println(text);
		
		
		
		
		

	}

}
