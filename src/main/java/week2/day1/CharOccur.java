package week2.day1;

public class CharOccur {
	public static void main(String[] args) {
		int count=0;
		String str="welcome to chennai";
		//char[] ch=str.toCharArray();
		char[] ch= str.toCharArray();
		System.out.println(ch);
//		int g=str.length();
//		int f=ch.length;
//		System.out.println(g);
//		System.out.println(f);
		
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='e')
			{
				count=count+1;
			}
		}
System.out.println("Count = "+count);
	}

}
