package Pre_defined_FI;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		
		Function<Integer,Integer> f=n->n*n;
		
		System.out.println(f.apply(5)); //5*5=25
		System.out.println(f.apply(7)); //7*7=49
		System.out.println(f.apply(9)); //9*9=81
		System.out.println(f.apply(25)); //25*25=625
		
		//Find String length
		//String --->length--->int
		
		Function<String,Integer> fs=s->s.length();
		
		System.out.println(fs.apply("Welcome")); //7
		System.out.println(fs.apply("Lambda Expression")); //17
		
	}

}
