package zoho_30To60;

public class totalDecodeWays {

	public static void main(String[] args) {
		String str = "1224";
		int ans = findTotatlWays(str);
		System.out.println(ans);

	}

	private static int findTotatlWays(String str) {
		if(str.length() == 0 || str.charAt(0)== '0')
		{
			return 0;
			
		}
		
		// if the string has one number between(1-9)
		// then there is only one way
		if(str.length() == 1)
		{
			return 1;
		}
		
		
		int prev2prev = 1;
		int prev = 1;
		
		for(int i = 1;i<str.length();i++)
		{
			int d = str.charAt(i)-'0';
			int dd = (str.charAt(i-1)-'0')*10 +d;
			int count = 0;
			if(d >0)
			{
				count = count+prev;
			}
			if(dd>=10 && dd<=26)
			{
				count = count+prev2prev;
				
			}
			
			prev2prev= prev;//prev to prev solution
			prev = count;//prev solution
			
			
			
			
			
		}
		return prev;
	}

}
