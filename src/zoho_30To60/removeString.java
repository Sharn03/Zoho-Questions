package zoho_30To60;

import java.util.ArrayList;
import java.util.HashMap;

public class removeString {

	public static void main(String[] args) {
		String string1 = "racecar";
		String	string2 = "ce";
		
		String ans = removeString(string1,string2);
		System.out.println(ans);
	}

	private static String removeString(String str1, String str2) {
		
		ArrayList<String>list = new ArrayList<>();
		HashMap<String,Integer>map = new HashMap<>();
		for(char c : str1.toCharArray())
		{
			map.put(String.valueOf(c),map.getOrDefault(String.valueOf(c), 0)+1);
		}
		
		for(char c : str2.toCharArray())
		{
			if(map.containsKey(String.valueOf(c)))
			{
				map.remove(String.valueOf(c));
			}
		}
		System.out.println(map);
		
		for(String str : map.keySet())
		{
			int count = map.get(str);
			for(int i =0;i<count;i++)
			{
				list.add(str);
			}
			
		}
		
		StringBuilder sb =  new StringBuilder();
		
		for(char c : str1.toCharArray())
		{
			String s = String.valueOf(c);
			
			if(list.contains(s))
			{
				sb.append(s);
			}
		}
		
		System.out.println(list);
		
		return sb.toString();
		
	}
	
	
	

}
