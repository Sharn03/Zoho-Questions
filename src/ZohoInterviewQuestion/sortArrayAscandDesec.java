package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

 

Example 1:

Input:
N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:
7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd
and sorted in descending order,
whereas 2 4 10 are even numbers
and sorted in ascending order. */


public class sortArrayAscandDesec {

	public static void main(String[] args) {
		long arr[] = {1, 2, 3, 5, 4, 7, 10};
		int n = 7;
		
		sortIt(arr,n);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortIt(long arr[], long n)
    {
        ArrayList<Long>oddList = new ArrayList<>();
        ArrayList<Long>evenList = new ArrayList<>();
        
        for(long num : arr)
        {
        	if((num&1)==1)
        	{
        		oddList.add(num);
        	}
        	else
        	{
        		evenList.add(num);
        	}
        }
        Comparator<Long>com = new Comparator<>()
        		{

					@Override
					public int compare(Long o1, Long o2) {
						if(o1>o2)
						{
							return -1;
						}
						else
						{
							return 1;
						}
					}
        	
        		};
        
        Collections.sort(oddList,com);
       
        Collections.sort(evenList);
      
        int k = 0;
        for(int i = 0;i<oddList.size();i++)
        {
        	arr[k++] = oddList.get(i);
        	
        }
        for(int i = 0;i<evenList.size();i++)
        {
        	arr[k++] = evenList.get(i);
        	
        }
        
        
        
    }

}
