package week1.day2;

public class palindrom {

	public static void main(String[] args) {
		int input=1221;
		int cal=0,remainder;
		int original=input;
		while(input!=0) {
			remainder=input%10;
			cal=(cal*10)+remainder;
			input=input/10;
		}
if(cal==original) {
	System.out.println("the given no is palindrome");
}
else {
	System.out.println("the given no is not a palindrome");
}
	}

}
