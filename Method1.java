
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Method: A method is a collection of statments that performs an opertaiton when called for. In a more simpler term, a method is a chunk of code that you run with one line.");
		
		System.out.println("For exmaple, if you want your varaibles to multply each other you can simply write a method along the lines on \"public static void muliplty(int a, int b) {\". ");
		System.out.println("Under that code write \"System.out.println(a * b)\".");
		System.out.println("Side Note: rmr to close off the previous braket before you create a new method and end the methods by opening a new bracket.");
		
		hello();
		addNumbers(1, 4);
		addNumbers(17, 39);
		multiply(7, 3);
		multiply(18, 73);	
		}
	
		public static void addNumbers(int a, int b) {
			System.out.println(a + b);
			
		}
		public static void multiply(int b, int c) {
			System.out.println(b * c);
		}
		public static void hello() {
			System.out.println("Hello, this is me teaching my computer math.");
		}
		
	}
