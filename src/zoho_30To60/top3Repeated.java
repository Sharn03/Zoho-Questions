package zoho_30To60;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class top3Repeated {

	public static void main(String[] args) {
		 int arr[] = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
		
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(int i = 0;i<3;i++)
		{
			int ans = maxFreq(map,arr);
			System.out.println(ans);
			
		}
		
		
	}
	
	public static int maxFreq(HashMap<Integer,Integer>map,int arr[])
	{
		int maxFreq = Integer.MIN_VALUE;
		int index = -1;
		
		for(int num:arr)
		{
			if(map.containsKey(num))
			{
				if(map.get(num)>maxFreq)
				{
					maxFreq = map.get(num);
					index = num;
				}
			}
		
		}
		map.remove(index);
		
		return index;
		}

}
