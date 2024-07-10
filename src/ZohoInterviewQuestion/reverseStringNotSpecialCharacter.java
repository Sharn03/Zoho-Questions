package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseStringNotSpecialCharacter {

	public static void main(String[] args) {
		String str = "A&x#";
		String result = reverse(str);
		System.out.println(result);
	}
	
	public static String reverse(String str)
	{
		char arr[] = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		while(start<=end)
		{
			 if(Character.isAlphabetic(arr[start])&& start<arr.length)
			 {
				 if(Character.isAlphabetic(arr[end])&& end>=0)
				 {
					 swap(arr,start,end);
					 start++;
					 end--;
				 }
				 
				 else
				 {
					 end--;
				 }
			 }
			 
			 else
			 {
				 start++;
			 }
		}
		String reversedString = String.valueOf(arr);
		return reversedString;
	
		
		
	}

	private static void swap(char[] arr, int start, int end) {
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		
	}
	
	

}
