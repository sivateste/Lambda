package Pre_defined_FI;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EEmployee
{
	String ename;
	int Salary;
	
	EEmployee(String ename,int Salary){
	 this.ename=ename;
	 this.Salary=Salary;
	 
	}

}
public class FunctionDemo2 {

	public static void main(String[] args) {

		ArrayList<EEmployee> emplist =new ArrayList<>();
		
		emplist.add(new EEmployee("siva",50000));
		emplist.add(new EEmployee("raju",70000));
		emplist.add(new EEmployee("janu",60000));
		
		Function<EEmployee,Integer> f=e->{
			
			           int sal=e.Salary;
			           
			           if(sal>=40000 && sal<=50000)
			        	   	return(sal *20/100);
			           else if(sal>=60000 && sal<=70000)
			        	   	return(sal *10/100);
			           else if(sal>=50000 && sal<=60000)
			        	   	return(sal *10/100);
					return sal;
					 };
					 
					 Predicate<Integer> p=b->b>5000;
					 
			        	   for (EEmployee emp:emplist)
			        	   {
			        		   int Bonus=f.apply(emp);   //Function
			        		   
			        		   if(p.test(Bonus))         //Predicated
			        		   {
			        		   System.out.println(emp.ename+" "+emp.Salary);
			        		   System.out.println("Bonue is :"+Bonus);
			        		   }
			        	   }
		
	}

}
