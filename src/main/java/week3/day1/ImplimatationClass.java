package week3.day1;

public class ImplimatationClass implements TaxCalculation,Tax2 {

	public double incomeAdd(String name, double amount1, double amount2) {
		System.out.println("String name is = "+name+"  "+amount1+" "+amount2  );
		return 0;
	}

	public double incomeReduce(String name, double amount1, double amount2) {
		System.out.println("String reduce name is = "+name+"  "+amount1+" "+amount2  );
		return 0;
	}

//	public void publishValue() {
//		// TODO Auto-generated method stub
//		
//	}

	public void publishValue(int r) {
		System.out.println("the integer value is ="+r);
	}

//	public int commonmethod() {
//		System.out.println("this is a common method");
//		return 0;
//	}
//	

	public void methodtwo() {
		System.out.println("This is a method two");
		
	}

	public void commonmethod1() {
	}

	public int commonmethod(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	public void commonmethod() {
		// TODO Auto-generated method stub
		
	}
}
