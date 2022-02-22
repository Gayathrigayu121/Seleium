package week3.day1;


import java.util.ArrayList;
import java.util.List;

public class LearnList {
//List-Interface
//ArrayList -Implementation
	
	public static void main(String[] args) {
		//Creating an empty list
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("JackFruit");
		fruits.add("Lemon");
		
		//To find the size of list
		int size = fruits.size();
		System.out.println("the size of fruits list : "+size);
		
		//maintain the position
		fruits.add("banana");
		//add at a particular position
		fruits.add(2,"avcado");
		//Allow duplicates
		fruits.add("avcado");
		
		//remove the first occurance
		fruits.remove("avcado");
		
		
		fruits.remove(2);
		//to print the array elements
		System.out.println(fruits );
		System.out.println(fruits.get(2));
		for(int i=0;i<size;i++) {
			System.out.println(fruits.get(i));
		}
			//for each
			for (String eachFruit : fruits) {
				System.out.println("eachfruit: "+eachFruit);
			}
			
			//remove an entry
			
fruits.clear();
		
for (String eachFruit : fruits) {
	System.out.println("eachfruit12: "+eachFruit);
}
		
		
	}

}
