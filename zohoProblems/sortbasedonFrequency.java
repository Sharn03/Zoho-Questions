package zohoProblems;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Given an array of N elements, sort the elements of the array based on frequency. If two numbers have the same frequency,then the smaller number comes first (eg) if the elements are 1,1,3,1,2,3,4 then the output is 2,4,3,3,1,1,1
//
//
//Input Description:
//Size of the array followed by the number of elements
//
//Output Description:
//Array elements sorted based on increasing frequency
//
//Sample Input :
//5
//8 8 1 1 3
public class sortbasedonFrequency {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr[] = new int[n];
	for(int i = 0;i<n;i++)
	{
		arr[i] = s.nextInt();
	}

	Map<Integer,Integer>hmap = new HashMap<>();
	for(int num : arr)
	{
		if(hmap.containsKey(num))
		{
			hmap.put(num, hmap.get(num)+1);
		}
		else
		{
		hmap.put(num,hmap.getOrDefault(num, 0)+1);
		}
	}
		
	System.out.println(hmap);
	//Collections.sort.(arr,com);
	List<Integer>keys = new ArrayList<>(hmap.keySet());
	System.out.println(keys);
	Comparator<Integer> com = new Comparator<Integer>()
			{
				@Override
				public int compare(Integer a, Integer b) {
						
					if(hmap.get(a) == hmap.get(b))
					{
						return a - b;
					}
					else
					{
						return hmap.get(a) - hmap.get(b);
					}
				}
			};
			Collections.sort(keys,com);
			int result[]= new int[arr.length];
			int index = 0;
			for(int k : keys)
			{
				for(int i = 0;i<hmap.get(k);i++)
				{
					result[index++] = k; 
				}
			}
			System.out.println(Arrays.toString(result));
			s.close();	
			
	
	

}
}

