package Day10;

import java.util.Scanner;

public class Speed {
	
	public static void speed(float dist,float time) {
		
		float t = time/60;
		
		float speed = dist/t;
		
		float fair = dist*10;
		
		System.out.println("Calculated Speed is "+speed +"km/hr");
		
		System.out.println("Total fair will be: " +fair +"rs");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter distance in km: ");
		float d = sc.nextFloat();
		
		System.out.println("Enter time in minutes: ");
		float t = sc.nextFloat();
		
		speed(d,t);
		sc.close();
	}
}
