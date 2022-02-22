package week2.day1;

public class OddUpper {

	public static void main(String[] args) {
		String str="hello";
		char[] ch=str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(i%2!=0) {
				char ch1=Character.toUpperCase(ch[i]);
				System.out.print(ch1);
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
		
	}
}
