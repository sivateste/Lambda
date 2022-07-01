package Lambda;

@FunctionalInterface  //annotation

/* // without Lambda Expression

interface Cab         // this is interface it aloow only one abstract method
{
   public void bookCab();  //this is functional inetface
  
}
class Uber implements Cab
{
	public  void bookCab()
	{
		System.out.println("Uber Cab Booking ....");
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		Cab c =new Uber();   //cab is interface ,it hold this object of uber class
		    c.bookCab();
				
	
	}	
}	
	*/

 // Using Lambda Expression

interface Cab
{
	public void Carbook();
}

public class Example1
{
	public static void main(String[] args) {
		Cab c=()->System.out.println("Uber Cab is Booking...");
		c.Carbook();
	}
	}