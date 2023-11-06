package Notes;
import java.util.ArrayList; //make sure to have this import statement when you want to use ArrayLists
public class ArrayListNotes {

	public static void main(String[] args) {
		
		/*
		 * Syntax:
		 * ArrayList<WrapperClassDataType> arrayListName = new ArrayList<WrapperClassDataType>();
		 * 
		 * Wrapper Class Data Type:
		 * 
		 * Primitive:		Wrapper Class:
		 * int				Integer
		 * double			Double
		 * boolean			Boolean
		 * char				Character
		 * ----				String
		 * 
		 * IMPORTANT: Primitive data types CANNOT be used to declare and initialize an ArrayList.
		 * 
		 * You CAN store primitive data type values inside the ArrayLists you create.
		 * 
		 */
		
		ArrayList<Integer> i1 = new ArrayList<Integer>();

		ArrayList<String> s = new ArrayList<String>();
		System.out.println(s);
		
		//add() Method
		System.out.println("add() Method: ");
		//add(element) - Appends the specified element to the end of this list.
		s.add("a");
		s.add("b");
		s.add("c");
		System.out.println(s);
		//add(index, element) - Inserts the specified element at the specified position in this list.
		s.add(1,"d");
		System.out.println(s);
		
		//get() Method
		System.out.println("get() Method: ");
		//get(index) - Returns the element at the specified position in this list.
		System.out.println("s.get(2): " + s.get(2));
		
		//set() Method
		System.out.println("set() Method: ");
		//set(index, element) - Replaces the element at the specified position in this list with the specified element.
		s.set(0, "Hello!");
		System.out.println(s);
		
		//remove() Method
		System.out.println("remove() Method: ");
		//remove(index) - Removes the element at the specified position in this list.
		s.remove(0);
		System.out.println(s);
		//remove(element) - Removes the first occurrence of the specified element from this list, if it is present.
		s.add("d");
		System.out.println("Before: " + s);
		s.remove("d");
		System.out.println("After: " + s);
		
		//removing a value that does not exist
		s.remove("z"); //no errors for trying to remove a value that does not exist in the ArrayList
		System.out.println(s);
		
		//size() Method
		System.out.println("size() Method: ");
		//returns the number of elements in an ArrayList
		System.out.println("size: " + s.size());
		
		//Iterating through and Updating an ArrayList
		System.out.println("Iterating through and Updating an ArrayList: ");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(2);
		nums.add(2);
		nums.add(3);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		System.out.println("nums BEFORE: " + nums);
		
		System.out.println("Removing all instances of 2: ");
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == 2) {
				nums.remove(i);
				i--; //You can decrement i when we remove a value from the ArrayList to keep up with the size change
			}
		}
		System.out.println(nums);
		
		//Practice-It 4th Edition Chapter 10 Self-Check 10.2 - 10.18, Exercise 10.1 - 10.10
		
	}

}
