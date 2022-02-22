package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMyntra {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.myntra.com/");
		
		
		WebElement men1 = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder=new Actions (driver);
		builder.moveToElement(men1).perform();
		
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();

		List<WebElement> jack = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		int size=jack.size();
		System.out.println("totla items :"+size);
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<size;i++) {
			System.out.println(list.add(jack.get(i).getText()));
			
			
		}
			String itemCount= driver.findElement(By.xpath("//span[@class='title-count']")).getText();
			
			System.out.println("the item count"+itemCount);
			
			driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
			
			driver.findElement(By.xpath("//div[@class='brand-more']")).click();
			
			driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
			
			driver.findElement(By.xpath("(//span[@class='FilterDirectory-count'])[1]")).click();
			
			driver.findElement(By.xpath("(//label[@class=' common-customCheckbox'])[1]")).click();
			//WebElement close = driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']"));;
			
			
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
			String text = driver.findElement(By.xpath("//h3[@class='product-brand']")).getText();
			System.out.println("pro"+text);
		List<WebElement> duke = driver.findElements(By.xpath("//h3[@class='product-brand']"));	
		
		int size1=duke.size();
		
		System.out.println("size "+size1);
		
//		List <String>list1=new ArrayList<String>();
//		for(int i=0;i<size1;i++) {
//			System.out.println(list.add(duke.get(i).getText()));
//		}
		
		
		WebElement dropdown1 = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		
		builder.moveToElement(dropdown1).perform();
		driver.findElement(By.xpath("(//label[@class='sort-label '])[5]")).click();
		
	String prize=driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		
		System.out.println("the ower prize "+prize);
		
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Set<String> set = driver.getWindowHandles();
		List<String>list3=new ArrayList<String>(set);
		driver.switchTo().window(list3.get(1));
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./snaps/sear.png");
		FileUtils.copyFile(src,des);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconWishlist sprites-headerWishlist']")).click();
	driver.close();
	}
	

}
