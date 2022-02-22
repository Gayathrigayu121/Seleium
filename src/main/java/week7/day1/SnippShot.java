package week7.day1;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SnippShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("wdhge");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("gaghyu");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		WebElement srn = driver.findElement(By.xpath("//div[@id='email_container']//div[2]"));
		File src = srn.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/Facebook.png");
		FileUtils.copyFile(src, des);
		}
	}


