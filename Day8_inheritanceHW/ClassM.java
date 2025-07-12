package Day8_inheritanceHW;

public class ClassM extends ClassN{
	public void star2() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}