package Day19;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		// it will store values in key-value pair
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Nikhil");
		m.put(2, "Sohan");
		m.put(3, "Pratham");
		m.put(4, "Rohit");
		m.put(5, "Surojeet");
		
		m.put(4, "Onkar");  // overwritten value
		
		System.out.println(m);
	}
	
}
