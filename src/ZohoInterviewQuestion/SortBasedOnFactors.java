package ZohoInterviewQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class SortBasedOnFactors {

	public static void main(String[] args) {
		
		Integer arr[] = {5, 11, 10, 20, 9, 16, 23};
		int n = arr.length;
		
		sortBasedOnFrequency(arr,n);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void sortBasedOnFrequency(Integer arr[],int n)
	{
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int nums: arr)
		{
			int factorCount = factorCount(nums);
			map.put(nums,factorCount);
		}
		
		Arrays.sort(arr,(n1,n2)->
		{
			int freq1 = map.get(n1);
			int freq2 = map.get(n2);
			
			if(n1 != n2)
			{
				return freq2 - freq1;
			}
			
			return  n1 - n2;
		});
	}
	
	public static int factorCount(int nums)
	{
		int count = 0;
		for(int i = 1;i<nums/2;i++)
		{
			if(nums%i == 0)
			{
				count++;
			}
		}
		
		return count;
	}

}
