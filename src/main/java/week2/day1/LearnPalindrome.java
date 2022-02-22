package week2.day1;

public class LearnPalindrome {

	public static void main(String[] args) {
		String str="madam";
		
		String rev="";
		int lengths=str.length();
		for(int i=(lengths-1);i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			if(str.equals(rev)) 
				System.out.println("the given string is palindrome");
			
			else 
				System.out.println("the given string is not a palindrome");
			
		
				

	}

}
