package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNumberOfTrianglesCanBeFormed {

	public static void main(String[] args) {
		int arr[] = {26,9,27,22,16,27};
		
		Arrays.sort(arr);
		
		int ans = possibleTriangle(arr);
		System.out.println(ans);
	}

	public static int possibleTriangle(int[] arr) 
	{
		int n = arr.length;
		int count = 0;
		for(int i = n-1;i>=2;i--)
		{
			int left = 0;
			int right = i-1;
			
			while(left<right)
			{
				if(arr[left]+arr[right]>arr[i])
				{
					count = count+(right-left);
					right--;
					
				}
				
				else
				{
					left++;
				}
			}
			
			
		}
		return count;
	
	}
	

}
