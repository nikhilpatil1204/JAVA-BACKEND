package Day15;

public class AccessModifiers extends Modifiers{

	public static void main(String[] args) {
//		Modifiers m = new Modifiers();
//		m.m1();
		
		AccessModifiers a = new AccessModifiers();
		a.m1();
		
	}
	
}

class Modifiers{
	
	public int no = 12;
	private String name = "Nikhil";
	int no1 = 04;
	public int no2 = 05;
	
	public void m1() {
		System.out.println(no);
		System.out.println(name);
		System.out.println(no1);
		System.out.println(no2);
	}
	
}

