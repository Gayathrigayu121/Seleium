package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCarWala {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Disable");
		ChromeDriver driver=new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.carwale.com/");
		
           driver.findElement(By.xpath("//span[text()='Used']")).click();
//           driver.findElement(By.xpath("//span[text()='Used']")).sendKeys("Chennai",Keys.ENTER);
           driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys("Chennai",Keys.ENTER);	
           driver.findElement(By.xpath("//li[@position='0']")).click();
}
}