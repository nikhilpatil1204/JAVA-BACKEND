package Day8_inheritancedemo;

public class Class2 extends Class3{
	public void array() {
		int arr[] = {33, 8, 27, 3, 39};

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}
	}
}
