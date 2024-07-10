package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class easeTheArray {

	public static void main(String[] args) {
		int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		easeArray(arr);
		System.out.println("Modified Array 1: " + Arrays.toString(arr));
	}
	
	public static void easeArray(int arr[])
	{
		 for(int i = 0 ;i<arr.length-1;i++)
		 {
			 if(arr[i]!=0 && arr[i] == arr[i+1])
			 {
				 arr[i] = 2*arr[i];
				 arr[i+1] = 0;
				 i++;// skipping the i+1 as we have put it as zero
			 }
		 }
		 
		 int start = 0;
		 for(int nums:arr)
		 {
			 // traversing through array and if the element != 0 means put it 
			 // in the 0 index and increment it
			 if(nums != 0)
			 {
				 arr[start++] = nums;
			 }
		 }
		 
		 while(start<arr.length)
		 {
			 arr[start++] = 0;
		 }
	}
}
