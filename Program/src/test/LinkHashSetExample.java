package test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetExample {
public static void main(String args[]) {
	LinkedHashSet<Employee> set=new LinkedHashSet<Employee>();
	
	Employee emp1 = new Employee(40, "Logi", "Suresh", "IT");
	Employee emp2 = new Employee(20, "priya", "Pooja", "HR");
	Employee emp3 = new Employee(30, "Nandhini", "Gayathri", "Finance");
	
	set.add(emp1);
	set.add(emp2);
	set.add(emp3);	
	/*Iterator<Employee> i=set.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}*/
	for(Employee s:set)
	{
		System.out.println("Emp Id:"+s.id+" "+"Emp Name:"+s.Name+" "+"Manager:"+s.Manager+" "+"Emp Department:"+s.Department);
	}	
}
}                                    
class Employee{
	int id;
	String Name,Manager,Department;
	public Employee(int id, String name, String manager, String department) {
		super();
		this.id = id;
		Name = name;
		Manager = manager;
		Department = department;
	}	
}


