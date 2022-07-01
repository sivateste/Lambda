package Pre_defined_FI;

import java.util.function.Predicate;

class Employee 
{
	String ename;
	int salary;
	int experience;

	
	Employee(String name,int sal,int exp)
	{
		this.ename=name;
		this.salary=sal;
		this.experience=exp;
	}
}
public class Predicate_example1 {
	public static void main(String[] args) 
	{
		
	Employee emp = new Employee("siva",30000,2);
	Predicate<Employee> pre =e->(e.salary>30000 && e.experience>3);
	System.out.println(pre.test(emp));
	
}
}
