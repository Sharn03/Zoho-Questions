package ZohoInterviewQuestion;

import java.util.Arrays;

public class kadaneAlgorithm {

	public static void main(String[] args) {
		int arr[] = {-79, -68, -18, -58, 25, 52, -68, -30, 6, 10};
		int ans[] = maxSumSubArray(arr);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] maxSumSubArray(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;
		int posS = -1;
		int posE = -1;
		for(int i = 0;i<arr.length;i++)
		{
			
			if(sum == 0)
			{
				start = i;
			}
			sum = sum+arr[i];
			
			
			
			maxSum = Math.max(maxSum, sum);
//			if(sum > maxSum)
//			{
//				posS = start;
//				posE = i;
//			}
				
			
			if(sum<0)
			{
				sum = 0;
			}
		}
		
	
	if (maxSum<0)
	{
		maxSum = 0;
	}
	
	return new int[]{posS,posE};
	
	}

}
