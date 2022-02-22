package Week5.day2;

import org.testng.annotations.Test;

public class TestNGTests {

	@Test(priority=-1)
	public void createLead() {
		System.out.println("CreateLead");		
	}
	
	@Test
public void editLead() {
		
		System.out.println("EditLead");		
	}

	@Test
public void deleteLead() {
	
	System.out.println("DeleteLead");		
		
}
	
	
	
}
