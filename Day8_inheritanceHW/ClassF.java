package Day8_inheritanceHW;

public class ClassF {
	public void printnamefromascii() {
		
		int[] name = {78, 73, 75, 72, 73, 76}; 
		
		for (int i = 0; i < name.length; i++) {
			System.out.print((char) name[i]);
		}
		System.out.println(); 
	}
	
}
