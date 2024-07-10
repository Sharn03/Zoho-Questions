package ZohoInterviewQuestion;

import java.util.Arrays;
import java.util.HashSet;

public class distinctDigitInNumArray {

	public static void main(String[] args) {
		int arr[] = {131,11,48};
		HashSet<Integer>ans = new HashSet<>();
		for(int nums: arr)
		{
			ans.addAll(storeDigit(nums));
		}
		int temp[] = new int[ans.size()];
		int k = 0;
		for(int i : ans)
		{
			temp[k++] = i;
		}
		System.out.println(Arrays.toString(temp));
		
		
	
		
	}
	public static HashSet<Integer> storeDigit(int nums)
	{
		HashSet<Integer>set = new HashSet<>();
		
		while(nums>0)
		{
			int rem = nums%10;
			set.add(rem);
			nums = nums/10;
		}
		return set;
		
		
	}

}
