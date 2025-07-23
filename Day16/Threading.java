package Day16;

public class Threading extends Thread{

	public void t1() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		for(int a : arr) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1 --> Value of 'a': "+a);
		}
		
		System.out.println("");
	}
	
	
	public void t2() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		for(int a : arr) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread 2 --> Value of 'a': "+a);
		}
	}
	
	Threading(){
		System.out.println("This is an Example of Threading with Non-parameterized Constructor");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Threading t = new Threading();
		t.t1();
		t.t2();
	}
	
}
