package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		//String array list
		String[] str= {"HCL", "WIPRO", "ASPIR SYS","TCS"};
		// create empty array list
		List<String> strList=new ArrayList<String>();
		strList.addAll(Arrays.asList(str));
		
		Collections.sort(strList);
		System.out.println("Sorted output");
		System.out.println(strList);
		
		
		Collections.reverse(strList);
		System.out.println("reverse list");
		System.out.println(strList);

	}

}
