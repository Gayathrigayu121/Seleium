package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList1 {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("JackFruit");
		fruits.add("Lemon");
		
		
		List<String> newFruits=new ArrayList<String>();
		
		newFruits.add("DragonFruit");
		newFruits.add("PineApple");
		newFruits.add("BlueBerry");
		newFruits.add("BlackCurrent");
		newFruits.add("JackFruit");
		newFruits.add("Mango");
		
		
		System.out.println("******Remove all******");
//		fruits.removeAll(newFruits);
//System.out.println(("fruits list"+fruits));
//System.out.println("new fruits list "+newFruits);
//

System.out.println("******retain all******");

//fruits.retainAll(newFruits);
//System.out.println(("fruits list"+fruits));
//System.out.println("new fruits list "+newFruits);

//Collections
Collections.sort(newFruits);
System.out.println("sorted List");

System.out.println(newFruits);
	}
	

}
