package zoho_30To60;

public class calculateNoOfDays {

	public static void main(String[] args) {
		
		int d1 = 10, m1 = 2, y1 = 2014;
		int	d2 = 10, m2 = 3, y2 = 2015;
		
		int ans = noOfDays( d1,  m1,  y1,  d2,  m2,  y2);
		System.out.println(ans);
		
	}
		
	   static int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		    
	   public static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) 
	    {
	        // code here
	       int n1 = y1 * 365 + d1;
	       for (int i = 0; i < m1 - 1; i++)
	       {
	           n1 += monthDays[i];
	       }
	       n1 = n1+ countLeapYears(y1, m1);
	       
	       int n2 = y2 * 365 + d2;
	       for (int i = 0; i < m2 - 1; i++)
	       {
	           n2 += monthDays[i];
	       }
	       n2 = n2+ countLeapYears(y2, m2);

	       return Math.abs(n2 - n1);
	    }
		    
	    public static int countLeapYears(int y, int m)
	    {
	       if (m <= 2) //check if current year needs to be considered or not
	       {
	           y--;
	       }
	       //leap years are / by 4 and 400 but not by 100
	       int digit =  y / 4 + y / 400 - y / 100 ;
	       System.out.println(digit);
	       return digit;
	    }
		
	}


