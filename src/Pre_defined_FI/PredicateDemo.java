package Pre_defined_FI;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		// Ex1 By using Integer value
		Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(20)); //true
		System.out.println(p.test(9));  //false
		
		//Ex2 Check the length of given String is greater then 5 or not
		Predicate<String> ps =s->(s.length()>5);
		
		System.out.println(ps.test("Welcome"));
		System.out.println(ps.test("ABC"));
		
		//Ex3 print array elements whose size is > 4 form array
		
		String []names = {"siva","Praveen","paven","Raja","Prakesh"};
		
		Predicate<String> ps1 =s->(s.length()>4);
		for(String name:names)
		{
		/*	if(ps1.test(name))
			{
				System.out.println(name);
			}
        */          //(Or)	
			
			if(name.length()>4)
			{
				System.out.println(name);
			}
		}
	}

}
