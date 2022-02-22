package week4.day1;

import java.time.Duration;
import java.util.List;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Whole Page
		
        driver.get("http://leafground.com/pages/frame.html");
	    File src = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./snaps/seat.png");
		FileUtils.copyFile(src,des);
	
		
		//Particular Element
		
		WebElement frame=driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame);
		WebElement scrn = driver.findElement(By.id("Click"));
		
		File src1=scrn.getScreenshotAs(OutputType.FILE);
		File des1=new File("./snaps/seat1.png");
		FileUtils.copyFile(src1, des1);
		
		//Print Size 
		List<WebElement> ddf = driver.findElements(By.xpath("(//div[@id='wrapframe']/iframe)"));
		System.out.println("Frame count in a main page :"+ddf.size());
		 
	
	}

}
