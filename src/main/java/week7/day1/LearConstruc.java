package week7.day1;

public class LearConstruc {
int empId;
String empName;
String companyName;
boolean status;
LearConstruc(){
	System.out.println("child Constructor");
}
LearConstruc(){
	
}

	public static void main(String[] args) {
	LearConstruc obj=new LearConstruc();
System.out.println(obj.empId);	
System.out.println(obj.empName);
System.out.println(obj.companyName);
System.out.println(obj.status);
	}

}
