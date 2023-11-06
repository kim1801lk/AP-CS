package Notes;
import java.util.Scanner; //This is the import statement that MUST be written to take in user input

public class userInput {

	/*
	 * Steps to Take to get started with User Input:
	 * 1. Make sure to have your import statement at the very top of your code. (import java.util.Scanner;)
	 * 2. Make sure to have your Scanner object created properly in the main method (Scanner in = new Scanner(System.in);)
	 * 3. Use proper methods to read in the user input
	 */
	
	public static void main(String[] args) {
		
		//For now, memorize the statement below
		Scanner in = new Scanner(System.in); //Scanner object created for user input

		System.out.println("Enter a name: ");
		String name = in.nextLine(); //use when reading input Strings
		System.out.println("Your name is " + name);
		
		System.out.println("Enter an integer: ");
		int num1 = in.nextInt(); //use when reading input integers
		System.out.println("You picked the number " + num1);
		
		System.out.println("Enter a double: ");
		double num2 = in.nextDouble(); //use when reading input doubles
		System.out.println("You picked the number " + num2);
		
		
	}

}
