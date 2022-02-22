package week3.day1;

public class InterfaceExecutionClass {

	
	public static void Jai() {
	
		System.out.println("the fg method");
	}
	public static void main(String[] args) {
		 
		ImplimatationClass obj=new ImplimatationClass();
		obj.incomeAdd("Gayu", 12.25, 36.5);
		
		obj.incomeReduce("VJ", 55.6, 85.3);
		obj.publishValue(87);
		obj.commonmethod();
		obj.commonmethod(8);
		obj.methodtwo();
		Jai();
	}

}
