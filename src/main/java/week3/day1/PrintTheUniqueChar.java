package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintTheUniqueChar {

	public static void main(String[] args) {
		
		String str="amma123";
		char[] ch=str.toCharArray();
//		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Object> charSet=new LinkedHashSet<Object>();
		for(int i=0;i<ch.length;i++) {
			charSet.add(ch[i]);
		}
		System.out.println(charSet);
	}

}
