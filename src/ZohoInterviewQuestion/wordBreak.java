package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class wordBreak {

	public static void main(String[] args) {
		int n = 6;
		String s = "ilikemobile";
		List<String>list =  Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile");
		
		int ans = wordBreak(list,s,n);
		System.out.println(ans);
		
		
		
	}

	private static int wordBreak(List<String> dictionary, String s, int n) {
		if(s.isEmpty()) return 1;
        
        for(int i=1; i<= s.length(); i++){
            
            String sub = s.substring(0,i);
            //System.out.println(sub);
            if( dictionary.contains(sub)){
                
                //System.out.println(sub);
                int t = wordBreak(dictionary,s.substring(i),n);
                if(t==1) return 1;
            }
        }
        
        return 0;
	}

}
