package week1.day2;

public class armstrongNum {

	public static void main(String[] args) {
		int input =151;
		int original=input,calculated=0;
		while(input>0) {
		int remainder=input%10;
		
		calculated +=Math.pow(remainder,3);
			//calculated=calculated+(remainder*remainder*remainder);
			input=input/10;
		}
		if(calculated==original) {
	System.out.println("The given input is "+calculated+"this number is armstrong");
	
	}
		 else  
		{
		System.out.println("the given input is "+calculated+ " is not an armstrong num"+ "");	
		}
	}

}
