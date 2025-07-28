package Day19;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		// it will be store values in unordered list
		
		Set<String> s = new HashSet<>();
		
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Four");
		s.add("Five");
		
		s.add("Two"); // it's ignores the Duplicate values
		
		System.out.println(s);
		
	}
}
