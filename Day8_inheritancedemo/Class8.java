package Day8_inheritancedemo;

public class Class8 extends Class9{

	public void starpattern() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
}
