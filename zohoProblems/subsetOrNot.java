package zohoProblems;

import java.util.HashMap;
import java.util.Scanner;

public class subsetOrNot {
		public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
			 int n = s.nextInt();
			 int m = s.nextInt();
			 
			 
			    int arr1[] = new int[n];
			    for(int i = 0;i<n;i++)
			    {
			        arr1[i] = s.nextInt();
			    }
			    
			    
			    int arr2[] = new int[m];
			    for(int i = 0;i<m;i++)
			    {
			        arr2[i] = s.nextInt();
			    }
			
			if(isSubset(arr1,arr2))
			System.out.println("yes");
			else
				System.out.println("no");
		}
		public static boolean isSubset(int arr1[],int arr2[])
		{
			
			boolean subset = true;
			
			HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
			
			
		
				for(int nums:arr1)
				{
					map.put(nums, map.getOrDefault(nums, 0)+1);
				}
				
				for(int nums:arr2)
				{
					if(!map.containsKey(nums))
					{
						subset = false;
						return subset;
					}
				}
			

					
				
				return subset;
				
		}
}
