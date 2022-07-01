package Pre_defined_FI;

import java.sql.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

	Supplier<Date> s=()->new Date(0);
	System.out.println(s.get());
	}

}
