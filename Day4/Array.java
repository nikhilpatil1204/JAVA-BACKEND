package Day4;

public class Array {

	public static void main(String[] args) {
		
		int arr[] = {2,4,8,7,9,31,32,55,66};
		
		for(int i = 0; i<arr.length; i++) {
			
//			System.out.println(arr[i]);
			
			if(arr[i] % 2 == 0) {
				System.out.println("Index/Position NO:" +i +" Indexing NO:" +arr[i] +" EVEN NO");
			}
			else {
				System.out.println("Index/Position NO:" +i +" Indexing NO:" +arr[i] +" ODD NO");
			}
		}
		
	}
	
}
