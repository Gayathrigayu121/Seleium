package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearneRail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
        ChromeDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://erail.in/trains-between-stations/chennai-egmore-MS/madurai-jn-MDU");
        
        String title=driver.getTitle();
        System.out.println("***title is ***"+title);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
        
        driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.ENTER);
         
        WebElement toStation=driver.findElement(By.id("txtStationTo"));
         
         toStation.clear();
         
         toStation.sendKeys("MDU",Keys.ENTER);
         
         driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
         
         List<WebElement> trainNum =driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
         
        
         int size=trainNum.size();
         System.out.println("size of trai num is = "+size);
         
            for(int i=0;i<size;i++) {
        	 System.out.println("TrainNumber=["+i+"]"+trainNum.get(i).getText());
         }
         
//       for (WebElement hh : trainNum) {
//		System.out.println("Train num is "+hh.getText());
//       }
         
            
           
//         for(WebElement trnName:trainName) {
//        	 System.out.println("Train name is ="+trnName.getText());
//         }
         

//         for(int i=0;i<size1;i++) {
//        	 System.out.println("Train name :"+trainName.get(i).getText());
//         }
         
       }
	}


