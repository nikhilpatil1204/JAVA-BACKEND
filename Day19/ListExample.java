package Day19;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		// it will be store values in Ordered list
		
		List<String> l = new ArrayList<>();
		
		l.add("Nikhil");
		l.add("Sohan");
		l.add("Pratham");
		l.add("Sohan");   // it's store Duplicate values also
		
		System.out.println(l);
	}

}
