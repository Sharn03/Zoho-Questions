package zohoProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class mainDriver  {
public static void main(String[]args) {
	List<employee>list = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	int n = 3;
	for(int i = 0;i<n;i++)
	{
		String name = s.next();
		int salary = s.nextInt();
		list.add(new employee(name,salary));
	}
	
//	list.add(new employee("sharan",21));
//	list.add(new employee("shwe",51));
//	list.add(new employee("nandy",41));
	
	Collections.sort(list);
	for(employee e : list)
	{
		System.out.println(e.getName());
	}
	
	
	
	

}
}
