package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixSorting {

	public static void main(String[] args) {
		int arr[][] = {
				{3,3,1,1},
				{2,2,1,2},
				{1,1,1,2}
		};
		//making col as constant
		for(int i = 0;i<arr.length;i++)
		{
			sort(arr,i,0);
		}
		
		// making row as constant
		for(int j = 0;j<arr[0].length;j++)
		{
			sort(arr,0,j);
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
		
	}
	public static void sort(int[][]arr,int m,int n)
	{
		int row = arr.length;
		int col = arr[0].length;
		
		ArrayList<Integer>list =  new ArrayList<>();
		for(int i = m,j = n;i<row && j<col;i++,j++)
		{
			list.add(arr[i][j]);
		}
		
		Collections.sort(list);
		//System.out.println(list);
		
		for(int nums: list)
		{
			arr[m++][n++] = nums;
		}
	}
	

}
