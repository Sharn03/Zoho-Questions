package ZohoInterviewQuestion;

public class twistedPrimeNumber {

	public static void main(String[] args) {
		
			int num = 13;
			
			
			
			System.out.println(isTwistedPrime(num));

	}
	public static int isTwistedPrime(int num)
	{
		boolean isPrime = true;
		
		
		for(int i = 2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isPrime = false;
			}
			
			if(num<=1)
			{
				isPrime = false;
			}
		}
	
		boolean isReversePrime = true;
		String str = Integer.toString(num);
		String reverse = new StringBuilder(str).reverse().toString();
		int reverseNumber = Integer.parseInt(reverse);
		
		for(int i = 2;i<reverseNumber/2;i++)
		{
			if(reverseNumber%i==0)
			{
				isReversePrime = false;
			}
			
			if(reverseNumber<=1)
			{
				isReversePrime = false;
			}
		}
		
		
		
		if(isPrime && isReversePrime)
		{
			return 1;
		}
		return 0;
	}
	

}
