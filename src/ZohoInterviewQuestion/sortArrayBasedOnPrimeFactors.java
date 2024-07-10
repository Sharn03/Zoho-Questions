package ZohoInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;


public class sortArrayBasedOnPrimeFactors {

	public static void main(String[] args) {
		Integer arr[] =  {15, 10, 3, 9, 21, 7, 6, 25};
		sortBasedOnPrimeFactors(arr);
	    System.out.println(Arrays.toString(arr));

	}
	
	public static void sortBasedOnPrimeFactors(Integer arr[])
	{
		ArrayList<Integer>primeNumberList = generatePrimeNumber(100);
		Arrays.sort(arr, (a,b)->{
			int smallestPrimeFactorOfA = smallestPrimeFactor(a,primeNumberList);
			
			System.out.println(a+"->"+smallestPrimeFactorOfA);
			
			int smallestPrimeFactorOfB = smallestPrimeFactor(b,primeNumberList);
			
			System.out.println(b+"->"+smallestPrimeFactorOfB);
			
			return Integer.compare(smallestPrimeFactorOfA, smallestPrimeFactorOfB);
 		});
	}
	
	
	//Method to find the smallestPrimeFactor
	public static int smallestPrimeFactor(int num, ArrayList<Integer>primeNumberList)
	{
		for(int primeNum : primeNumberList)
		{
			//if the number is divisble by the any of the prime number then the prime number is a factor of that number
			//Since the primeNumberList is starting from 2 to 100 we would easily get the smallestPrimeFactor
			if(num%primeNum == 0)
			{
				return primeNum;
			}
		}
		return num;
	}
	
	//Method to generate primes number till 100
	public static ArrayList<Integer> generatePrimeNumber(int num)
	{
		ArrayList<Integer>primeNumberList = new ArrayList<>();
		
		for(int i = 1;i<=num;i++)
		{
			if(isPrime(i))
			{
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}
	
	
	//Method to check prime or not
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
