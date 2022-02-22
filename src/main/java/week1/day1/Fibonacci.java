package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8,firstno=0,secno=1,third;
		System.out.print(firstno+" "+secno+" ");
		for(int i=2;i<range;i++) {
			third=firstno+secno;
			System.out.print(" "+third);	
			firstno=secno;
			secno=third;
		}
	
	}

}
