package zohoProblems;

import java.util.ArrayList;
import java.util.Collections;

public class permutation {

	public static void main(String[] args) {
		String num = "123";
		String p = "";
		String up = num;
		ArrayList<String> ans = permutation(p,up);
		Collections.sort(ans);
		for(String val : ans)
		{
			System.out.println(val);
		}

	}
	public static ArrayList<String> permutation(String p,String up)
	{
		ArrayList<String>list = new ArrayList<>();
		
		//base condition
		if(up.isEmpty())
		{
			list.add(p);
			return list;
		}
		
		char c = up.charAt(0);
		int n = p.length();
		
		for(int i = 0;i<=n;i++)
		{
			String first = p.substring(0, i);
			String second = p.substring(i,n);
			
			ArrayList<String> result = permutation(first+c+second,up.substring(1));
			list.addAll(result);
			
		}
		return list;
	}

}
