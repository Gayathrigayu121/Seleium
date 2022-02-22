package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/table.html");

		//Step 1 Find the table
		
		WebElement webTable = driver.findElement(By.id("table_id"));
		// get row
		
		List<WebElement> tableRow = webTable.findElements(By.tagName("tr"));
		
		System.out.println("row of the table "+tableRow.size());
		
		//get the column
	//pick any row
		WebElement webFirstRow = tableRow.get(2);
		

		List<WebElement> tableColumn = webFirstRow.findElements(By.tagName("td"));
		
		System.out.println("column "+tableColumn.size());
		//getcontent
		for (WebElement webElement : tableRow) {
			String text=webElement.getText();
			System.out.println("content of row "+text);
		}
		//need a specific column
		for (int i=1;i<tableRow.size();i++)
		{
			WebElement findIndivRow = tableRow.get(i);
			List<WebElement> findIndivColum = findIndivRow.findElements(By.tagName("td"));
			String text1=findIndivColum.get(5	).getText();
			System.out.println("text1  :  "+text1);
		}
				
		
	}

}
