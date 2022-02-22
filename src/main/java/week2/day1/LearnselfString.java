package week2.day1;

public class LearnselfString {

	public static void main(String[] args) {
		String str=new String();
		str="Welcome to Erode ";
		int lengthvalue=str.length();
		System.out.println("Lengthvalue is = "+lengthvalue);
		
		char [] ch=str.toCharArray();
        System.out.println("char array valve "+ch);
        
        for(int i=0;i<ch.length;i++) {
        	System.out.println("ch["+i+"]"+ch[i]);
        }
        
        String str1="have a Good Day";
        String str2="have a Good day";
        boolean t=str1.equals(str2);
        System.out.println(t);
        boolean y=str1.equalsIgnoreCase(str2);
        System.out.println(y);
        
        String str3=str.toUpperCase();
        System.out.println("uppercase = "+str3);
        
        int j=str.indexOf('a');
        System.out.println("index of a is= "+j);

	}

}
