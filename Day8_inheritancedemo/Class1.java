package Day8_inheritancedemo;

public class Class1 extends Class2{

	public void evenodd(){

		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				System.out.println("Even No:- "+i);
			}
			else {
				System.out.println("Odd No:- "+i);
			}
		}
	
	}
	
}
