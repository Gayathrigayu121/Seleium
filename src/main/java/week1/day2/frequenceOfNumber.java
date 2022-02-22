package week1.day2;

public class frequenceOfNumber {

	public static void main(String[] args) {
		int[] arr= {3,4,2,5,1,2,6,3,6,2,4,7,1};
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
			for (int j=0;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count ++;
				}
			}
		System.out.println("the arr is"+arr[i]+"="+count);
		}

	}

}
