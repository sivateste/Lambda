package Lambda;

@FunctionalInterface
/*interface Cab1
{
	public void carbook(String source,String destination) ;
	}
class Uber1 implements Cab1
{
    public void carbook(String source ,String destination)
    {
    	System.out.println("Uber Cab Booking Form "+source+"To"+destination);
    	
    }

}

public class Example2 {

	public static void main(String[] args) {
   Cab1 c= new Uber1();
        c.carbook("Hydrabad", "Nellore"); 
		
	}

}
*/
  
//Using lambda Expression in 2 parameters

interface Cab1
{
  public void carbook(String source ,String destination);
  
}

class Example2
{
  public static void main(String[] args) {
	// Cab1 c=(String source ,String destination)->System.out.println("Uber car Booking frome"+source+"To"+destination);
	  
	           				//	(or)
	  
	 Cab1 c=(source,destination)->System.out.println("Uber car booking From"+source+"To"+destination);
	      c.carbook("Hydrebad", "Nellore"); 
}	

}

