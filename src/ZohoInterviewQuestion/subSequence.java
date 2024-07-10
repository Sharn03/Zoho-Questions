package ZohoInterviewQuestion;

import java.util.Scanner;

public class subSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String A = s.next();
		String B = s.next();
		
		if(isSubsequence(A,B))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		

	}
	
	public static boolean isSubsequence(String A,String B)
	{
		boolean isSubsequence = true;
		int k = 0;
		String temp="";
		
		
			for(int i = 0;i<B.length();i++)
			{
				char ch = A.charAt(k);
				if(ch == B.charAt(i))
				{
					
					temp = temp+ch;
					k++;
					
				}
				
				if(k == A.length())
				{
					break;
				}
				
				
			
		}
			System.out.println(temp);
			
			if(!temp.equals(A))
			{
				isSubsequence = false;
			}
			return isSubsequence;
	}
	

}
