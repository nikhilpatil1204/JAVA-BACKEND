package Day8_externalpackage;

public class PrintNamefromAscii {

	public void printnamefromascii() {
		
		int[] name = {78, 73, 75, 72, 73, 76}; 
		
		for (int i = 0; i < name.length; i++) {
			System.out.print((char) name[i]);
		}
		System.out.println(); 
	}
	
}
