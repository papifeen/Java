package recurtions;

public class recurtions {

	public static void main(String[] args) {
	
		finish(5);
	}
	public static void finish(int a) {
		if (a == 0) {
		System.out.println("Yes we are here.");
		} else {
			System.out.println("are we there yet?");
			a--;
			finish(a);
		}
	}
}
