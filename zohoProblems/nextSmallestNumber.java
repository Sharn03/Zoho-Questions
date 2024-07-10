package zohoProblems;

import java.util.ArrayList;
import java.util.List;

public class nextSmallestNumber {
public static void main(String[] args) {
	int arr[] = {10 ,7, 9, 3, 2, 1, 15};
	int n = arr.length;
	List<Integer>list = new ArrayList<>();

	for(int i = 0;i<n;i++)
	{
		int ans = -1;
		for(int j = i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				ans = arr[j];
				
				break;
			}
			
		}
		list.add(ans);
	}
	
	for(int i = 0;i<list.size();i++)
	{
		if(i<n-1)
		System.out.print(list.get(i)+" ");
		else
			System.out.print(list.get(i));
	}
}
}
