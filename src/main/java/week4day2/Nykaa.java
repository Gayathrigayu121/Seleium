package week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;


public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.nykaa.com/");
		
		
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		
		driver.findElement(By.xpath("(//div[@class='css-ov2o3v']/a)[1]")).click();
		
		String title = driver.getTitle();
		System.out.println("title of the page :"+title);
		
		
		driver.findElement(By.xpath("//span[@class='value']")).click();
		driver.findElement(By.xpath("(//div[@class='control control--radio text-capitalize'])[4]/span")).click();
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath("//li[@class='filter-list-header  ']")).click();
		driver.findElement(By.xpath("//span[@class='category-title-text']")).click();
		driver.findElement(By.xpath("//div[@class='control__indicator']")).click();
		driver.findElement(By.xpath("//div[@class='clearfix']")).click();
		
		
		
		
		
		
		
		
		

	}

}
