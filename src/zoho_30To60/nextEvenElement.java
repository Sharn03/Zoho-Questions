package zoho_30To60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class nextEvenElement {

	public static void main(String[] args) {
		String num ="1992";
		
	long ans = nextGreaterEvenElement(num);
	System.out.println(ans);
	}

	private static long nextGreaterEvenElement(String num) {
		char arr[] = String.valueOf(num).toCharArray();
		
		
		int index = -1;
		int n = arr.length;
		
		//finding the dip element
		for(int i = n-2;i>=0;i--)
		{
			if(arr[i]<arr[i+1])
			{
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		if(index == -1)
		{
			return -1;
		}
		
		String substring = num.substring(index);
		System.out.println(substring);
		ArrayList<Long>list = findPermutation(substring);
		System.out.println(list);
		
		
		
		return -1;
		
		
		
		
		
		
	}
	
	

}
