package week3.day1;

public class LearnMethodOverloading {
	public void getEmployeeDteails() {
int empId=101;
String name="hari";
System.out.println("Employee name: "+name);
System.out.println("Em[ployee id: "+empId);
	}
	//overload
	public void getEmployeeDteails(int empId) {
		System.out.println("method overload 1");
		System.out.println("Em[ployee id: "+empId);
			}
	public void getEmployeeDteails(int empId,String name) {
		System.out.println("method overload 2");
		System.out.println("Em[ployee id: "+empId);
		System.out.println("Employee name: "+name);
			}
	public static void main(String[] args) {
		LearnMethodOverloading obj=new LearnMethodOverloading();
		obj.getEmployeeDteails();
		obj.getEmployeeDteails(15);
		obj.getEmployeeDteails(16, "gayathri");
	}
}
