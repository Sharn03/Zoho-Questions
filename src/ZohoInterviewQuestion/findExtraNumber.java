package ZohoInterviewQuestion;

import java.util.HashMap;

public class findExtraNumber {

	public static void main(String[] args) {
		int n = 6, arr1[] = {3,5,7,8,11,13}, arr2[] = {3,5,7,11,13};
		
		 int ans = findExtra( n,arr1,arr2);
		 System.out.println(ans);

	}
	
	public static int findExtra(int n,int arr1[],int arr2[])
	{
		 HashMap<Integer,Integer>map = new HashMap<>();
	       for(int i = 0;i<arr2.length;i++)
	       {
	           map.put(arr2[i] , map.getOrDefault(arr2[i],0)+1);
	       }
	       
	       for(int i = 0;i<arr1.length;i++)
	       {
	           if(!map.containsKey(arr1[i]))
	           {
	               return i;
	           }
	       }
	       return -1;
	}

}
