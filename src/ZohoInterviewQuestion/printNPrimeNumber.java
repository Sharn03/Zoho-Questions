package ZohoInterviewQuestion;

public class printNPrimeNumber {

	public static void main(String[] args) {
		int num = 10;
		for(int i = 1;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}

	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i = 2;i<=n/2;i++)
		{
			if(n%i ==  0)
			{
			return false;
			}
		}
		return true;
	}

}
