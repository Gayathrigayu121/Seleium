package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		//dowload the driver version 
		//automatic driver manage/
		//automatically manages i the driver version
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		//Simple alert
				driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//trasfer the contl to current active dialog
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("the text in simple alert"+text);
		Thread.sleep(2000);
		alert.accept();
		
		
		//Confirmation alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();

           Thread.sleep(2000);
          alert.dismiss();
          
          String text3=driver.findElement(By.xpath("//p[@id='result']")).getText();
          if(text3.contains("you pressed cancel")) {
        	  System.out.println("you ve pressedcancl button");
          }
          else {
        	  System.out.println("yu ve pressed ok");
          }
          
          //prompt box
          driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
      String text6=alert.getText();
      System.out.println(text6);
          Thread.sleep(2000);
          alert.sendKeys("EDU");
          
          alert.accept();
          
		
	}

}
