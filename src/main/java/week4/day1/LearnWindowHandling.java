package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Window.html");
				
		driver.findElement(By.id("home")).click();
		
		Set<String> winSet = driver.getWindowHandles();
		
		List<String> name=new ArrayList<String>(winSet);		
		
		System.out.println("Before title"+driver.getTitle());
		
		driver.switchTo().window(name.get(1));
		
		System.out.println("after title:"+driver.getTitle());
		
		//driver.switchTo().window(name.get(2));
		
		//System.out.println("back again tile:"+driver.getTitle());
		
		
		
	}

}
