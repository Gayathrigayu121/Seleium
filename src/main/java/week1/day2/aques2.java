package week1.day2;

import java.util.Arrays;

public class aques2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
Arrays.sort(arr);
for (int i=0;i<arr.length;i++)
{
	//System.out.println("sorted array ["+i+"]"+arr[i]);
if(arr[i]!=i+1)
{
	System.out.println("missing num is "+(i+1));
	break;
}
}
	}

}
