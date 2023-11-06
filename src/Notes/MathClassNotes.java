package Notes;

public class MathClassNotes {

	public static void main(String[] args) {
		
		//abs() method
		System.out.println("abs() Method:");
		/*
		 * The abs() method will return the absolute value of a number.
		 * 
		 * Math.abs(num) - num can be an int, double, long, or float
		 */
		int num1 = -35;
		System.out.println("Math.abs(num1): " + Math.abs(num1));
		System.out.println("Math.abs(-4.76): " + Math.abs(-4.76));
		
		//ceil() Method
		System.out.println("ceil() Method: ");
		/*
		 * ceil() will round your number UP to the nearest integer regardless of the decimal
		 * 
		 * The only exception is when the decimal is 0
		 * 
		 * The return type of the ceil() method is a double
		 */
		double num2 = 8.15;
		double num3 = -5.46;
		System.out.println("Math.ceil(num2): " + Math.ceil(num2));
		System.out.println("Math.ceil(num3): " + Math.ceil(num3));
		System.out.println("Math.ceil(12.0): " + Math.ceil(12.0));
		
		//floor() Method
		System.out.println("floor() Method: ");
		/*
		 * floor() will round your number DOWN to the nearest integer regardless of the decimal
		 * 
		 * The only exception is when the decimal is 0
		 * 
		 * The return type of the floor() method is a double
		 */
		num2 = 8.95;
		num3 = -5.66;
		System.out.println("Math.floor(num2): " + Math.floor(num2));
		System.out.println("Math.floor(num3): " + Math.floor(num3));
		System.out.println("Math.floor(12.0): " + Math.floor(12.0));
		
		//max() Method:
		System.out.println("max() Method: ");
		/*
		 * max() will take in two numeric values and return the greater of the two values
		 * 
		 * Math.max(num1, num2) - num1 and num2 can be an int, double, float, or long
		 */
		System.out.println("Math.max(5, 7): " + Math.max(5, 7));
		System.out.println("Math.max(6.78, 6.77): " + Math.max(6.78, 6.77));
		
		//min() Method:
		System.out.println("min() Method: ");
		/*
		 * min() will take in two numeric values and return the lesser of the two values
		 * 
		 * Math.min(num1, num2) - num1 and num2 can be an int, double, float, or long
		 */
		System.out.println("Math.min(5, 7): " + Math.min(5, 7));
		System.out.println("Math.min(6.78, 6.77): " + Math.min(6.78, 6.77));
		
		//pow() Method
		System.out.println("pow() Method: ");
		/*
		 * pow() will raise the first argument to the power of the second argument
		 * 
		 * Math.pow(num1, num2) - returns num1 to the power of num2
		 */
		System.out.println("Math.pow(2,3): " + Math.pow(2,3));
		System.out.println("Math.pow(5.5,3.2): " + Math.pow(5.5,3.2));
		
		//random() Method
		System.out.println("random() Method: ");
		/*
		 * Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		 */
		System.out.println("Math.random(): " + Math.random());
		
		/*
		 * If you want to generate random number in a specific range, use this formula:
		 * 
		 * (int)(Math.random() * range) + min
		 * 
		 * to get the proper range, do: max - min + 1
		 */
		
		//If we want to generate a random integer from 1 - 5 (inclusive)
		System.out.println("Random integer from 1-5: " + ((int)(Math.random() * 5) + 1));
		
		//sqrt() Method:
		System.out.println("sqrt() method:");
		/*
		 * returns the square root of a number
		 */
		System.out.println("Math.sqrt(100): " + Math.sqrt(100));
		System.out.println("Math.sqrt(7): " + Math.sqrt(7));
		
	}

}
