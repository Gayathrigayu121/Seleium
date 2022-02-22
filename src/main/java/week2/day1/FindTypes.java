package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  count = 0, space = 0, num = 0, speciChar = 0;
		
		char[] ch=test.toCharArray();
		
		for(int i=0; i<ch.length; i++) 
		{
		
			if(Character.isLetter(ch[i])) {
				count=count + 1;
			}
			if(Character.isDigit(ch[i])) {
				num=num + 1;
			}
			if(Character.isSpaceChar(ch[i])) {
				space=space + 1;
			}
		else 
		{
			speciChar=speciChar + 1;
		}
			}
		System.out.println("The letter count is =" +count);
		System.out.println("The digit count is = "+num);
		System.out.println("The spacechar is = "+space);
		System.out.println("The specialChar is = "+speciChar);
				
	}

}
