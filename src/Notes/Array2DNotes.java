package Notes;
import java.util.Arrays;



public class Array2DNotes {

	public static void main(String[] args) {
		
		//2D Arrays
		/*
		 * Syntax:
		 * dataType[][] 2DArrayName = new dataType[numOfRows][numOfCol];
		 * 
		 */

		int[][] arr = new int[3][5];
		
		//Accessing values in a 2D Array
		arr[0][0] = 10;
		System.out.println(arr[0][0]);
		
		//How to access the 2nd row and 4th column?
		System.out.println(arr[1][3]);
		
		//Important: 2D Arrays, conceptually, are an array of arrays. For example: { {}, {}, {} }
		
		//We are accessing the very first ARRAY within the 2D Array in this example
		System.out.println(Arrays.toString(arr[0]));
		
		int[][] arr2 = {{1,2,3,1},
						{4,5,6,1},
						{7,8,9,1}};
		
		int[][] arr3 = {{1},
						{2,3},
						{4,5,6}};
		
		//Traversing Through a 2D Array
		for(int row = 0; row < arr2.length; row++) { //keeps track of what row we are in
			for(int col = 0; col < arr2[row].length; col++) { //keeps track of what column we are in
				System.out.println(arr2[row][col]);
			}
		}
		
		//initializing a 2D Array with only the # of rows
		int[][] arr4 = new int[5][];
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = new int[3]; //Initializing the current row with a definite/concrete size
			for(int j = 0; j < 3; j++) {
				arr4[i][j] = j;
			}
		}
		System.out.println(Arrays.deepToString(arr4));
		
	}

}
