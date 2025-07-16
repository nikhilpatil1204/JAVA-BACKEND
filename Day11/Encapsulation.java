package Day11;

import java.util.Scanner;

public class Encapsulation {

	private String name;
	private int age;
	private double marks;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			if(age>=18) {
				this.age = age;
				System.out.println("You're Eligible t vote !");
			}
			else {
				this.age = age;
				System.out.println("You're not Eligible t vote !");
			}
		}
		else {
			System.out.println("Enter valid Age !!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		String n = sc.next();
		
		System.out.println("Enter your Age : " );
		int a = sc.nextInt();
		
		System.out.println("Enter your Marks : ");
		double m = sc.nextDouble();
		
		Encapsulation e = new Encapsulation();
		e.setName(n);
		e.setMarks(m);
		e.setAge(a);
		
//		System.out.println("Name: " +e.getName());
//		System.out.println("Marks: " +e.getMarks());
		
		System.out.println("Age: " +e.getAge());
	}
	
}
