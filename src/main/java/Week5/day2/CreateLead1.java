package Week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1 extends BaseClass11 {

	
	@Test(dataProvider="sendData")
	public  void runCreatLead(String company,String name,String ini,String ph) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ini);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
}
	@DataProvider
	public String[][] sendData() {
		
		String[][] data=new String[2][4];
		
		data[0][0]="TestLeaf";
		data[0][1]="hari";
		data[0][2]="r";
		data[0][3]="45";
		
		data[1][0]="TesstLeaf";
		data[1][1]="bali";
		data[1][2]="y";
		data[1][3]="40";
		
		return data;
		
	}
	
	
	
	
}
