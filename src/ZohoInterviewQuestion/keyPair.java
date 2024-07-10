package ZohoInterviewQuestion;

import java.util.HashMap;

public class keyPair {

	public static void main(String[] args) {
		int x = 16;
		int arr[] = {1, 4, 45, 6, 10, 8};
		
		boolean ans = keyPair(x,arr);
		System.out.println(ans);
		
	}
	
	public static boolean keyPair(int target, int arr[])
	{
		boolean result = false;
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int i = 0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		
		int count = 0;
		for(int i = 0;i<arr.length;i++)
		{
			int num = target - arr[i];
			
			if(map.containsKey(num) )
			{
				count++;
			}
			
			if(count == 2)
			{
			    result = true;
			}
		}
		
		return result;
	}

}
