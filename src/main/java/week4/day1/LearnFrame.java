package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/frame.html");
				

		WebElement frame = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("Click")).click();
		//it takes me out of all the frames and lands me to the main page
		driver.switchTo().defaultContent();

		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		driver.switchTo().frame(frame1);
		
		driver.switchTo().frame("frame2");//by using id
		
		driver.findElement(By.id("Click1")).click();
		
	}

}
