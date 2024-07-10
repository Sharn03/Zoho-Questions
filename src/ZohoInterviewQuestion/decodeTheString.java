package ZohoInterviewQuestion;

import java.util.Stack;

public class decodeTheString {

	public static void main(String[] args) {
		String str = "3[2b[c]]";
		String ans = decode(str);
		System.out.println(ans);
		
		
		
	}
	
	 public static String decode(String str) {
		 

			    Stack<Integer> numStack = new Stack<>();
			    Stack<String> stringStack = new Stack<>();
			    int k = 0;

			    for (char c : str.toCharArray()) {

			      if (Character.isDigit(c)) {
			    	  
			    	// whether the string has multi-digit character in order to accumulate we use 
			    	 // k*10 
			        k = (k * 10) + (c - '0');
			        continue;
			      }

			      if (c == '[') {
			    	 numStack.push(k);
				     k = 0;
			        stringStack.push(String.valueOf(c));
			        continue;
			      }

			      if (c != ']') {
			        stringStack.push(String.valueOf(c));
			        continue;
			      }

			      StringBuilder temp = new StringBuilder();
			      while (!stringStack.peek().equals("["))
			      {
			    	  
			        temp.insert(0, stringStack.pop());
			      }

			      // remove the "["
			      stringStack.pop();

			      // Get the new string
			      StringBuilder replacement = new StringBuilder();
			      int count = numStack.pop();
			      for (int i = 0; i < count; i++)
			      {
			        replacement.append(temp);
			      }

			      // Add it to the stack
			      stringStack.push(replacement.toString());
			    }

			    StringBuilder result = new StringBuilder();
			    while (!stringStack.empty()) {
			      result.insert(0, stringStack.pop());
			    }
			    return result.toString();
			  }

}
