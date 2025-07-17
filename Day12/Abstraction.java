package Day12;

public class Abstraction extends Abstract{
	
	public void two() {
		System.out.println("Abstract Method Without Body");
	}

	public static void main(String[] args) {
		Abstract a = new Abstraction();
		a.One();
		a.two();
	}
	
}

abstract class Abstract{
	public void One() {
		System.out.println("Abstract Method With Body");
	}
	public abstract void two();
}