package zohoProblems;

import java.util.Scanner;

public class countOfSubarray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
		} 
		
		int ans = findCount(arr,k);
		System.out.println(ans);
	}
	
	

public static int findCount(int arr[],int k )
	{
		int count = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			int max = Integer.MIN_VALUE;
			for(int j = i;j<arr.length;j++)
			{
				max = Math.max(arr[j], max);
						if(max>k)
						{
							count++;
						}
			}
		}
		return count;
	}
}
