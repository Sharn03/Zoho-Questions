package ZohoInterviewQuestion;

import java.util.Scanner;

public class CountNumberOfMoves {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		int ans = miniMoves(str);
		System.out.println(ans);

	}
	public static int miniMoves(String str)
	{
		char arr[] = str.toCharArray();
		int totalMoves = 0;
		for(int i = 0 ;i<arr.length;i++)
		{
			if(arr[i] == 'X')
			{
				totalMoves++;
				arr[i] = '0';
				
				if(i+1<arr.length)
				{
					arr[i+1] = '0';
				}
				
				if(i+2<arr.length)
				{
					arr[i+2] = '0';
				}
			}
		}
		
		return totalMoves;
	}
}
