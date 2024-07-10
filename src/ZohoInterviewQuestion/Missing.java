package ZohoInterviewQuestion;

import java.util.Arrays;

public class Missing {
public static void main(String[] args) {
	int arr[] = {1};
	int n = 2;
	int s = 0 ;
	while(s<arr.length)
	{
		int correctIndex = arr[s]-1;
		
		if(s<arr.length-1 && arr[correctIndex] != arr[s])
		{
			swap(arr,s,correctIndex);
			
		}
		
		else
		{
			s++;
		}
		
	}
	
	System.out.println(Arrays.toString(arr));
	
	int ans = missingNumber(arr,n);
	System.out.println(ans);
	
}

public static void swap(int arr[], int s, int correctIndex)
{
	int temp = arr[s];
	arr[s] = arr[correctIndex];
	arr[correctIndex] = temp;
}

public static int missingNumber(int arr[],int n)

	{
		for(int i = 0;i<arr.length;i++)
		{
			if( arr[i]>0 && arr[i]<=n && arr[i]!= i+1)
			{
				return i+1;
			}
		}
		
		return arr.length+1;
	}

}
