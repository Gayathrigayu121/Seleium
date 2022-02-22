package week1.day2;

public class TofindIntersection {

	public static void main(String[] args) {
		int [] arr= {3,2,11,4,6,7};
		int [] brr= {1,2,8,4,9,7};
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<brr.length;j++) {
				if(arr[i]==brr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}}
	   