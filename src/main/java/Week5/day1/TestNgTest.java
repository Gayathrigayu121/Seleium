package Week5.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTest extends BaseClass {
	
	
	
	@BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("Before Method-Method 2 test 2");
	  }
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
}
