package ZohoInterviewQuestion;

public class DiamondPatter {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 0;i<n;i++)
		{
			//for spaces
			for(int space = 0;space<n-i-1;space++)
			{
				System.out.print(" ");
			}
			
			//for *
			for(int j = 0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
		for(int i = n;i>0;i--)
		{
			//for spaces
			for(int space = 0;space<n-i;space++)
			{
				System.out.print(" ");
			}
			
			//for *
			for(int j = 0;j<i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
	}
	

}
