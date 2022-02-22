package week2.day1;

import java.util.Arrays;

public class LearnAnagram {

	public static void main(String[] args) {
		String str="post";
		String str1="stop";
		
		if(str.length()==str1.length())
		{
			char[] ch=str.toCharArray();
			char[] ch1=str1.toCharArray();
			 
		Arrays.sort(ch);
		Arrays.sort(ch1);

		if(Arrays.equals(ch,ch1)) {
			System.out.println(str + " and " + str1+ " the given text is anagram");
		}
		else {
			System.out.println("the given string is not a anagram");
		}
		}
	}

}
