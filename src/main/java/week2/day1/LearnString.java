package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		//create an obj fr String
		//methd:using literals(assinging data directly)
		String teststr="welcome to testleaf";
		//meth2:usig new keyword
		String teststr1=new String();
		teststr1="have a nice day";
		teststr1.length();
int length=teststr1.length();
System.out.println("+length="+length);
//find char in a String
//charAt()
char ch=teststr1.charAt(2);
System.out.println("charrtyh = "+ch);

//position of char

int ind=teststr1.indexOf('A');
System.out.println("index ="+ind);
int cg=teststr1.lastIndexOf('a');
System.out.println("last a is = "+cg);
//String to charArray
System.out.println("strg is = "  +teststr1);
char[] ch2=teststr1.toCharArray();
for (int i=0;i<ch2.length;i++)
{
		System.out.println("char["+i+"]:"+ch2[i]);
}

String st=teststr1.toUpperCase();
System.out.println("upper case = "+st);


//charcter conversion
char ch3=Character.toUpperCase('a');
System.out.println("char iupercase="+ch3);


//comparision of string
String teststr6="hai bye good";
String teststr7="hai bye gooD";


boolean t=teststr6.equals(teststr7);
System.out.println("compare = "+t );
//equalsignoreCase
boolean tt=teststr6.equalsIgnoreCase(teststr7);
System.out.println("compare = "+tt );


	}

}
