package ZohoInterviewQuestion;

import java.util.HashMap;

public class findUniqueElement {
	public static void main(String[] args) {
		int arr[] = {3,3,7,7,10,11,11};
		int ans = findUniqueElement(arr);
		System.out.println(ans);
	}
	
	public static int findUniqueElement(int arr[])
	{
		HashMap<Integer,Integer>map = new HashMap<>();
		
		for(int nums: arr)
		{
			map.put(nums, map.getOrDefault(nums, 0)+1);
		}
		
		for(int nums:arr)
		{
			if(map.get(nums) == 1)
			{
				return nums;
			}
		}
		return -1;
	}

}


