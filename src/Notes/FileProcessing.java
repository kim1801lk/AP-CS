package Notes;
import java.util.*; //* is also known as a 'wild card'. This means to import everything from the util package
import java.io.*;

public class FileProcessing {

	public static void main(String[] args) throws IOException { //Make sure to throw an IOException in the main method header!
		
		/*
		 * Token - a series of characters that ends with what Java calls whitespace. A whitespace character can be a blank,
		 * a tab character, a carriage return, or the end of the file.
		 */
		
		//Reading in Inputs from a File
		/*
		 * Syntax:
		 * Scanner scannerObjectName = new Scanner(new File("path_to_input_file"));
		 */
		Scanner in = new Scanner(new File("input.txt"));
		
		//Outputting Results to a File
		/*
		 * Syntax:
		 * PrintWrtier pwObjectName = new PrintWriter(new FileWriter("path_to_output_file"));
		 */
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		
		/*
		 * Syntax:
		 * PrintStream psObjectName = new PrintStream("path_to_output_file");
		 */
		PrintStream ps = new PrintStream("output.txt");
		
		
		ps.println(in.nextLine());
		
		/*
		 * next() Method - finds and returns the next complete token from the Scanner
		 */
		ps.println(in.next());
		ps.println(in.next());
		ps.println(in.next());
		ps.println("testing");
		
		in.close(); //Make sure to close out your Scanner object at the end of your program!
		out.close(); //Make sure to close out your PrintWriter object at the end of your program!
		ps.close(); //Make sure to close out your PrintStream object at the end of your program!
		
		//Practice-It 4th Edition Chapter 6 Self-Check 6.1 - 6.20, Exercises
		
	}

}
