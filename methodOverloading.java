package methodOverloading;

public class methodOverloading {

	public static void main(String[] args) {

		System.out.println(add(7.5, 8.8));
		System.out.println(add(4, 6, 10));
		System.out.println(add(8, 10));
		System.out.println(add("Hello", " world."));



		
	}
	public static int add(int a, int b) {
		return (a + b);
		
	}
	public static int add(int a, int b, int c) {
		return (a+b+c);
	}
	
	public static double add(double a, double b) {
		return (a + b);
	}
	public static String add(String a, String b) {
		return (a + b);
		
	}
}

