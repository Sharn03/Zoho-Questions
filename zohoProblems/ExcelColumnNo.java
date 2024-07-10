package zohoProblems;

public class ExcelColumnNo {
public static void main(String[] args) {
	String s = "AAA";
	int colNum = 0;
	int preValue = 0;
	
	for(int i = 0;i<s.length();i++)
	{
		
		
		if(s.length() ==1)
		{
			colNum = (s.charAt(i) -'A') +1+26*i;
		}
		else
		{
			colNum = (s.charAt(i) -'A') +1+26*preValue;
			preValue = colNum;
		}
	}
	System.out.println(colNum);
}
}
