package Day8_inheritanceHW;

public class ClassB extends ClassC{
	public int sub(int a, int b) {
		int result = a-b;
		System.out.print("Substraction is: "+result);
		return a-b;
	}
}
