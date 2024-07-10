package ZohoInterviewQuestion;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 123;
		
		int temp = n;
		int sum = 0;
		while(temp>0)
		{
			int rem = temp%10;
			sum = sum*10+rem;
			temp =  temp/10;
			
		}
		
		if(sum == n)
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
	}

}
