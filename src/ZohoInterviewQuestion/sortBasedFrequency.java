package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class sortBasedFrequency {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			int length = s.nextInt();
			Integer arr[] = new Integer[length];		
			
			for(int k= 0 ;k<length;k++)
			{
				arr[k] = s.nextInt();
			}
			
			sortFrequency(arr);
			
			for(int j = 0;j<arr.length;j++)
			{
				if(j<arr.length-1)
					System.out.print(arr[j]+" ");
				else
					System.out.print(arr[j]);
			}
			System.out.println();
		}
		
	}
	public static void sortFrequency(Integer arr[])
	{
		List<Integer>list = Arrays.asList(arr);
		
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int nums:arr)
		{
			map.put(nums, map.getOrDefault(nums, 0)+1);
		}
		
		
		Collections.sort(list,(n1,n2) ->{
			int freq1 = map.get(n1);
			int freq2 = map.get(n2);	
		if(freq1 != freq2)
		{
			return freq2 -freq1;
		}
		
		return n1 - n2;
		
		
					
		
		});
		
		
		
	}

}
