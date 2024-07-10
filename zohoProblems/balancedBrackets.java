package zohoProblems;

import java.util.HashMap;
import java.util.Scanner;

public class balancedBrackets {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String brackets = s.nextLine();
	char arr[] = brackets.toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<>();
	
	for(char brack : arr)
	{
		if(map.containsKey(brack))
		{
			map.put(brack, map.get(brack)+1);
		}
		else
		{
			map.put(brack, map.getOrDefault(brackets, 0)+1);
		}
	}
	System.out.println(map);
	if(map.get('{') == map.get('}') && map.get('[') == map.get(']') 
		&& map.get('(') == map.get(')'))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
}
}
