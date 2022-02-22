package week3.day1;

public class Calculator {

	public void add(int a) {
		System.out.println("a value ="+a);
	}
	
public void add(int a,int b) {
	int d=a+b;
		System.out.println("sum of a n b is "+d);
	}
public void add(int a,int b,int c) {
	int k=a+b+c;
	System.out.println("The sum of three is "+k);
}

public void mul(int a,double b,int c) {

	System.out.println("The a & b C value is "+a+" "+ b+" "+c);
}
public void div(int a,double b) {
double f=a/b;
	System.out.println("The a & b C value is "+f);
}
public void mul(int a,int b) {

	System.out.println("The a & b C value is "+(a*b));
}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(5);
		obj.add(15, 7);
		obj.add(1, 2, 3);
		obj.mul(2, 10);
		obj.mul(5, 6.6, 3);
obj.div(25, 25.5);
	}

}
