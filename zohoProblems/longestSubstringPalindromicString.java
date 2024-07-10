package zohoProblems;

import java.util.Scanner;

public class longestSubstringPalindromicString {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.next();
	
	
	
	System.out.println(findSubstring(str));
}
	public static String findSubstring(String str)
	{
		int s = 0;
		int e = str.length()-1;
		
		String first = "";
		String last = "";
		while(s<=e)
		{
			char start = str.charAt(s);
			char end = str.charAt(e);
		
			
			 if(start == end)
			{
				 
				 if(s==e)
					{
						first = first+start;
					}
				 else
				 {
					 first+=start;
					 last = end+last;
				 }
				
				
				
				
				s++;
				e--;
			}
			
			else
			{
				e--;
			}
		}
		System.out.println(first +" "+last);
		
		String result = first.concat(last);
		return result;
	}
}
