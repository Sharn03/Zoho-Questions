package zoho_30To60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {

	public static void main(String[] args) {
		int arr[] = {6 ,8 ,0, 1, 3};
		long ans[] = nextGreaterElement(arr);
		System.out.println(Arrays.toString(ans));

	}

	private static long[] nextGreaterElement(int[] arr) {
		int n = arr.length;
		 long[] result = new long[arr.length];
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int i = 0;i<n;i++)
	        {
	        	while(!stack.isEmpty() && arr[i]> arr[stack.peek()])
	        	{
	        		result[stack.pop()] = arr[i];
	        	}
	        		
	        	//Storing the index of the element in the stack 
	        	stack.push(i);
	        }
	        
	        while(!stack.isEmpty())
	        {
	        	result[stack.pop()] = -1;;
	        }
	        
	        return result;
	}
	
}


