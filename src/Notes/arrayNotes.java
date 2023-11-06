package Notes;
import java.util.Arrays;

public class arrayNotes {

	public static void main(String[] args) {
		
		/*
		 * Primitive Data Types:
		 * int 		- 12, -75, 125, 1580
		 * double	- 3.56, -97.4
		 * char		- 'a', '@', '3', 'X'
		 * boolean 	- true, false
		 * short
		 * byte
		 * float
		 * 
		 * Non-Primitive Data Types:
		 * String 	- "Hello World!"
		 */
		
		/*
		 * An Array stores a fixed-size sequential collection of elements of the same type. An array is used to store
		 * a collection of data, but it is often more useful to think of an array as a collection
		 * of variables of the same type.
		 * 
		 * Instead of declaring individual variables, such as num0, num1, num2, ..., and num99, you can declare
		 * one array variable such as num and use num[0], num[1], num[2], ..., and num[99] to represent
		 * individual variables.
		 */
		
		//Declaring Arrays
		/*
		 * Preferred Syntax: dataType[] arrayName;
		 * Alternative Syntax: dataType arrayName[];
		 */
		
		int[] numArr;
		
		//Creating Arrays:
		
		/*
		 * Syntax: arrayVarName = new dataType[arraySize];
		 * 
		 * The above statement does two things:
		 * -It creates an array using new dataType[arraySize];
		 * -It assigns the reference of the newly created array to the variable arrayVarName
		 */
		
		numArr = new int[10];
		//Empty arrays will be filled with the default value of its dataType
		System.out.println(Arrays.toString(numArr));
		
		//Declare and Initialize an Array At Once
		/*
		 * Syntax: dataType[] arrayVarName = new dataType[arraySize];
		 * 
		 * Alternatively, you can create an array with concrete values by following this syntax:
		 * 
		 * dataType[] arrayVarName = {value0, value1, value2, ..., valueK};
		 */
		
		double[] ex1 = {1.3, -4.6, 5.1, 10.39};
		
		//Indexing in Arrays
		
		/*
		 * Array elements are accessed through the index number. Array indices are
		 * 0-based, meaning that they start from 0 to arrayVarName.length - 1
		 */
		
		//Accessing Elements in an Array
		
		/*
		 * arrayVarName[indexNumber] = value;
		 */
		
		System.out.println("Accessing the first element: " + ex1[0]);
		
		//length method for Arrays
		
		/*
		 * To get the length of an array, you must use:
		 * arrayVarName.length
		 * 
		 * IMPORTANT: The length "method" for arrays is different from the length method for strings.
		 * 			  Notice that the length method for arrays does not require the parentheses, while 
		 * 			  the string method does.
		 */
		
		System.out.println("The length of the array: " + ex1.length);
		
		//Different Use Cases for Arrays
		
		int[] ex2 = new int[5];
		ex2[0] = 10;
		ex2[1] = 4;
		ex2[2] = 78;
		ex2[3] = 9;
		ex2[ex2.length - 1] = 15;
		
		System.out.println(Arrays.toString(ex2));
		
		//Processing Arrays
		
		int[] myList = {2,4,6,8,10};
		System.out.println("Printing out all values in the Array: ");
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		String[] strList = {"a","b","c","d","e"};
		for(int i = 0; i < strList.length; i++) {
			if(strList[i].equals("c")) {
				break;
			}
			System.out.println(strList[i]);
		}
		
		/*
		 * Directions:
		 * -Create an array with these values in this order: 5, 10, 15, 20, 25
		 * -Create a for loop to traverse through your array
		 * -As you go through your array, check to see if the value in the current position of the array is a multiple of 4
		 * 		-If it is, break out of the for-loop
		 * 		-If not, print out the current value in the array
		 */
		
		int[] num = {5, 10, 15, 20, 25};
		for(int i = 0; i < num.length; i++) { // variable i is used as an index number for the array
			if(num[i] % 4 == 0) {
				break;
			}
			else {
				System.out.println(num[i]);
			}
		}
		
		//You can pass arrays into methods, and methods can also have a return type of an array
		
		//Arrays Class Built-In Methods
		
		//equals() Method
		System.out.println("equals() Method: ");
		/*
		 * Returns true if the two specified arrays of longs/ints/chars/etc. are equal to one another. Two arrays 
		 * are considered equal if both arrays contain the same number of elements, and all corresponding 
		 * pairs of elements in the two arrays are equal. This returns true if the two arrays are equal. 
		 * Same method could be used by all other primitive data types (Byte, short, Int, etc.)
		 */
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = {1,2,4};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("The two arrays are equal to each other!");
		}
		
		//sort() method
		System.out.println("sort() method: ");
		/*
		 * Sorts the specified array of objects into ascending order, according to the natural ordering 
		 * of its elements. Same method could be used by all other primitive data types ( Byte, short, Int, etc.)
		 */
		int[] arr4 = {7, 1, 10, 4, 6, 2, 8};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		//Practice-It Chapter 7 Self-Check 7.1 - 7.9

	}

}
