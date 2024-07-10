package zohoProblems;

import java.util.Comparator;

public class employee implements Comparable<employee>{
	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	private String name;
	private int salary;
	@Override
	public int compareTo(employee that) {
		if(this.getSalary()>that.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}


	
	
	
}
