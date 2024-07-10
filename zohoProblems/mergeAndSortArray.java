package zohoProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mergeAndSortArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int arr[] = new int[n];
	
	for(int i = 0;i<n;i++)
	{
		arr[i] = scanner.nextInt();
	}
	
	ArrayList<Integer>list = new ArrayList<>();
	for(int nums : arr)
	{
		list.add(nums);
	}
	
	Collections.sort(list);
	
	
	List<Integer> alternateNum = alternateArray(list);
	for(int i = 0;i<alternateNum.size();i++)
	{
		if(i<alternateNum.size()-1)
		{
			System.out.println(alternateNum.get(i) + " ");
		}
		else
		{
			System.out.println(alternateNum.get(i));
		}
	}

}
public static List<Integer> alternateArray(List<Integer>list)
	{
		ArrayList<Integer>temp = new ArrayList<>();
		int s = 0;
		int e = list.size()-1;
		
		while(s<=e)
		{
			if(s==e)
			{
				temp.add(list.get(e));
			}
			else
			{
				temp.add(list.get(e));
				temp.add(list.get(s));
			
			}
			s++;
			e--;

		}
		return temp;
	}
}
