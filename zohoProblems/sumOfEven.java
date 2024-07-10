package zohoProblems;

import java.util.ArrayList;
import java.util.stream.Stream;

public class sumOfEven {

	public static void main(String[] args) {
		int n = 6;
		int arr[] = {5,7,4,4,6,8};
		ArrayList<Integer>list = new ArrayList<>();
		for(int nums:arr)
		{
			list.add(nums);
		}
		
		 int result = list.stream()
		.filter(N -> N%2==0)
		.reduce(0, (c,e) -> c+e);
		
		 
		
		 
		
		
		System.out.println(result);
		
		
		

	}

}
