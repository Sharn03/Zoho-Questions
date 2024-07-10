package ZohoInterviewQuestion;

public class exceptionExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int arr[] = new int[3];
		
		try
		{
			int c = a/b;
			
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException ari)
		{
			System.out.println("sharan"+""+ari);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
	}
	
	
}
