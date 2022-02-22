package Week5.day2;
import org.testng.annotations.Test;

public class LearnEnable {
	
		@Test(priority=-1)
		public void createLead() {
			System.out.println("CreateLead");	
			editLead();
		}
		
		//@Test(enabled =false)
	public void editLead() {
			
			System.out.println("EditLead");		
		}

		@Test
	public void deleteLead() {
		
		System.out.println("DeleteLead");		
			
	}

}
