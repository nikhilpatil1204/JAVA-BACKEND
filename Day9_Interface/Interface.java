package Day9_Interface;

import java.util.Scanner;

public class Interface extends ClassA implements Y,X,F,O,N{

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st no: ");
//		int a = sc.nextInt();
//		
//	    System.out.println("Enter 2nd no: ");
//		int b = sc.nextInt();
		
		Interface i = new Interface();
		
//		extends

//		i.add(a, b);
//		i.sub(a, b);
//		i.myname();
//		i.multiply(a, b);
//		i.div(a, b);
//		i.printnamefromascii();	
//		i.array();
//		i.twoD();
//		i.threeD();
//		i.star1();
//		i.star2();
//		i.evenodd();
//		i.storeproducts();
//		i.ascii();
//		i.gradechecker();
		
//		implements
		
		i.ClassY();
		i.ClassX();
		i.ClassF();
		i.ClassO();
		i.ClassN();
	}

	public void ClassN() {
		System.out.println("This is Example of Interface N");
	}
	
	public void ClassO() {
		System.out.println("This is Example of Interface O");
	}

	public void ClassF() {
		System.out.println("This is Example of Interface F");
	}

	public void ClassX() {
		System.out.println("This is Example of Interface X");
	}

	public void ClassY() {
		System.out.println("This is Example of Interface Y");
	}
		
}

interface Y{
	void ClassY();
}

interface X{
	void ClassX();
}

interface F{
	void ClassF();
}

interface O{
	void ClassO();
}

interface N{
	void ClassN();
}



