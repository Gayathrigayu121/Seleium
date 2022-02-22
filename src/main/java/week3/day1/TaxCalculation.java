package week3.day1;

public interface TaxCalculation {

	/**
	 * 
	 * @param name
	 * @param amount1
	 * @param amount2
	 * @return
	 */
	public double incomeAdd(String name, double amount1, double amount2);
	 /**
	  * 
	  * @param name
	  * @param amount1
	  * @param amount2
	  * @return
	  */
	 public double incomeReduce(String name, double amount1, double amount2);
/**
 * 
 * @param r
 */
	  public void publishValue(int r);
	  /**
	   * 
	   */
	  public void commonmethod();
	
	
}
