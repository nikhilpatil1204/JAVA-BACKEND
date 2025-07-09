package Day5;

public class DyanmicArray {

	public static void main(String[] args) {
		
		int arr[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
		
		System.out.println("2D: " +arr[1][3]);
		
		System.out.println();	
		
		int arr1[][][] = {
				{
					{11,12,13,14},
					{15,16,17,18},
					{19,20,22,25}
				}
		};
		
		System.out.println("3D: " +arr1[0][0][0]);
		
	}
	
}
