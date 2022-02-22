package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowerPractice {

	public static void main(String[] args) {
		//Step 1 :Manage the driver
		WebDriverManager.chromedriver().setup();
		
		// Step 2: launch the browser
          ChromeDriver obj=new ChromeDriver();
        
       //step3: Maximize the browser
          obj.manage().window().maximize();
          
      //Step 4: Launch url
          obj.get("https://www.gmail	.com");
          
      //step 5:get the title of the current page
          String title = obj.getTitle();
          System.out.println("title = "+title);
          
      //Step 6:Entr Username
          WebElement userName = obj.findElement(By.name("identifier"));
          userName.sendKeys("mailtogayugs@gmail.com");
          
     //Step 7:Entr next
          WebElement next=obj.findElement(By.className("VfPpkd-vQzf8d"));
          next.click();
          
     //step 8: Entr pswd
          WebElement pswd=obj.findElement(By.className("password"));
          pswd.sendKeys("selvarajga");
          
     //step 9:entr nxt
          WebElement nxt=obj.findElement(By.className("VfPpkd-vQzf8d"));
          nxt.click();
          
     //step 10:compose mail
        WebElement cmail=  obj.findElement(By.className("T-I T-I-KE L3"));
         cmail.click();
         
     //Step 11:to address
         WebElement toaddr=obj.findElement(By.id(":sh"));
         toaddr.sendKeys("gayathrigs.eee@mkce.ac.in");
         
     //Step 12:subject
        WebElement sub= obj.findElement(By.id(":rz"));
        sub.sendKeys("hai");
        
     //Step 13:send
        WebElement send = obj.findElement(By.id(":rp"));
        send.click();
        
         
      

		
		
		
		
		
	}

}
