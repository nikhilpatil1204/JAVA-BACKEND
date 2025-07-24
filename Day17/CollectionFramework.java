package Day17;

import java.util.ArrayList;

public class CollectionFramework {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Nikhil");
		arr.add("Sohan");
		arr.add("Pratham");
		
		System.out.println(arr);
		
		arr.remove(1);
		
		System.out.println(arr);
		
		arr.set(0, "Nikhil Patil");
		arr.set(1, "Sohan Sirvi");
		
		System.out.println(arr);
		
		arr.clear();
		
		System.out.println(arr);
		
	}
	

	
}
