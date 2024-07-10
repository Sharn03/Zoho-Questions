package ZohoInterviewQuestion;

import java.util.ArrayList;

public class MoveZerosToLast {

	public static void main(String[] args) {
		int N = 6;
		int arr[] = {0, 0, 0, 3,1,4};
		
		moveZeros(N,arr);
		
		

	}
	public static void moveZeros(int n,int arr[])
	{
	// Rotating the array method
//			int s = 0;
//			int e = n-1;
//			while(s<=e)
//			{
//				if(arr[s] == 0)
//				{
//					rotateArr(s,e,arr,n);
//					e--;
//				}
//				
//				else
//				{
//					s++;
//				}
//			
//			}
		
		//Optimized approach
		int k = 0;
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[k++] = arr[i];
			}
		}
		
		while(k<n)
		{
			arr[k++] = 0;
		}
			
		for(int nums: arr)
		{
			System.out.print(nums+" ");
		}
		
		
	}
//	public static void rotateArr(int s,int e,int arr[],int n)
//	{
//		int last = arr[s];
//		for(int i = s;i<n-1;i++)
//		{
//			arr[i] = arr[i+1];
//		}
//		arr[n-1] = last;
//	}
}

