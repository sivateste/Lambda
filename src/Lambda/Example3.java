package Lambda;

@FunctionalInterface

  // by using Without Lambda Exprssion
/* interface Employee
{
   public String office(String name,Double salary); 	
}

class Company implements Employee
{
  public String office(String name ,Double salary)
  {
	  System.out.println("Name of Employee :"+name+"  "+ "Salary : "+salary);
	  return ("Location : Hydrabed");
  }
}

public class Example3 {

	public static void main(String[] args) {

		Employee e =new Company();
		 System.out.println(e.office("Siva", 45000.34));        
	}

}

*/
    //By using Lambda Expression

interface Employee
{
  public String office(String name,Double salary );
  
}

class  Example3
{
 public static void main(String[] args) 
	{
	 Employee e=(String name,Double salary)->{System.out.println("Name of Employee :"+name+" "+"Salary"+salary);
	    return ("Location : Hydrabed");
	 };
	 
	 System.out.println(e.office("Siva", 45000.34));
	}
}
