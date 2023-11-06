package Notes;

public class methodNotes {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		swap(a,b);
		System.out.println("a: " + a + "\nb: " + b);
		
		System.out.println(greeting("bob"));

	}
	
	/*
	 * Example Syntax:
	 * public static int methodName(int a, int b) {
	 * 		//method body
	 * }
	 * 
	 * Formal Syntax:
	 * modifier(s) returnType nameOfMethod(parameterList) {
	 * 		//method body
	 * }
	 * 
	 * modifier - It defines the access type of the method and it is optional to use
	 * returnType - the type of value that the method will return
	 * nameOfMethod - the method name
	 * Parameter List - The list of parameters: the type, order and number of parameters of a method. These
	 * 					are optional, and methods may contain zero parameters
	 * Method body - It defines what the method does with the statements
	 * 
	 * !!!ALL methods that you create need to be written OUTSIDE of the main method!!!
	 */
	
	public static String greeting(String name) {
		return "Hello, " + name + "!";
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
