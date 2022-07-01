package Pre_defined_FI;

import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {
		
		Consumer<String> c1=s->System.out.println(s+"  "+"Is White");
		Consumer<String> c2=s->System.out.println(s+"  "+"is having four legs");
		Consumer<String> c3=s->System.out.println(s+"  "+"is eating grass");
		
	/*	c1.accept("Horse");
		c2.accept("Horse");
		c3.accept("horse");
		*/
		
		//or
		
		// c1.andThen(c2).andThen(c3).accept("horse");
		
		//or
		
		Consumer<String> c4=c1.andThen(c2).andThen(c3);
		c4.accept("Horse");
	}

}
