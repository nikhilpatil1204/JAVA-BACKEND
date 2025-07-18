package Day13;

public class TryCatch {
	public static void main(String[] args) {
		StaticArray da = new StaticArray();
		da.array();
	}
}

class StaticArray{
	public void array() {
		try {
			int arr[] = {1,2,3,4,5,6,7,8};
			System.out.println(arr[10]);
		}
		catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}