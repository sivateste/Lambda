package Pre_defined_FI;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeDemo
{
  String ename;
  int salary;
  String gender;
  EmployeeDemo(String ename,int salary,String gender)
  {
	  this.ename=ename;
	  this.salary=salary;
	  this.gender=gender;
  }

}

public class consumerDemo {

	public static void main(String[] args) {
	ArrayList<EmployeeDemo> emplist=new ArrayList<>();
	 
	emplist.add(new EmployeeDemo("Devid",50000,"Male"));
	emplist.add(new EmployeeDemo("John",30000,"Male"));
	emplist.add(new EmployeeDemo("Mary",20000,"feMale"));
	emplist.add(new EmployeeDemo("Scott",60000,"Male"));
	
	//Function
	Function<EmployeeDemo,Integer> f=emp->(emp.salary*10)/100;
	
	//Predicate
	Predicate<Integer> p=b->b>=5000;
	
	//Consumer
	Consumer<EmployeeDemo> c=emp->{
		          System.out.println(emp.ename);
		          System.out.println(emp.salary);
		          System.out.println(emp.gender);
		
	};
	
	for(EmployeeDemo e:emplist)
	{
		
		int bonus=f.apply(e);      //Calculate bonus invoked Function
		if(p.test(bonus))          //invoked predicate
			
		{
			c.accept(e);           //invoked consumer
			System.out.println("Employee Bonus :"+bonus);
		}
	}
	}

}
