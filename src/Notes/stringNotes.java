package Notes;

public class stringNotes {

	public static void main(String[] args) {
		
		//String Length
		
		//The length of a string is just the number of characters inside the string
		String str = "Hello";
		int len = str.length(); //len is 5
		//"Hello".length();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + "*");
		}
		System.out.println();
		
		//String Index Numbers
		
		/*
		 * Index numbers - 0,1,2,...
		 * Left-most char in a string is at Index 0
		 * Last char in a string is at Index length()-1
		 * 
		 * H e l l o
		 * 0 1 2 3 4
		 * 
		 * Every character in a string can be identified by an Index Number
		 */
		
		//String Substring
		System.out.println("Substring: ");
		/*
		 * The substring() method picks out a part of a string using index numbers to identify the desired part. The simplest
		 * form, substring(int start) takes a start index number and returns a new string made of the chars starting at
		 * that index and running through the end of the string.
		 * 
		 * str.substring(start)
		 * Chars beginning at index start(inclusive) through the end of the string
		 */
		String str2 = "Hello";
		String a = str2.substring(1);
		System.out.println("a: " + a);
		String b = str2.substring(2);
		System.out.println("b: " + b);
		String c = str2.substring(3);
		System.out.println("c: " + c);
		
		/*
		 * There is a more complex version of substring() that takes both start and end index numbers: substring(int start, int end)
		 * It returns a string of the chars beginning at the start index number and running up to but not including the end index
		 * 
		 * str.substring(start, end)
		 * returns a String beginning at start(inclusive) up to end(exclusive)
		 */
		String d = str2.substring(2,4);
		System.out.println("d: " + d);
		String e = str2.substring(0,3);
		System.out.println("e: " + e);
		String f = str2.substring(4,5);
		System.out.println("f: " + f);
		
		/*
		 * The example f above uses substring(4,5) to grab the last char. The 5 is one more than the index of the last char.
		 * However, this does not go out of bounds because of the substring() "up to but not including" use of the end index.
		 */
		
		//String Index Errors: "String Index Out of Bounds" or "String Index Out of Range"
		
		/*
		 * Common mistakes: index is greater than the String's length
		 * 
		 * To avoid mistakes, use if-statements to check the length first
		 */

		//Suppose we want the first 4 chars of str
		//String x = str.substring(0,4); //WRONG sometimes*
		String x;
		if(str.length() >= 4) {
			x = str.substring(0,4);
		}
		else {
			//whatever you want to do when length is < 4
		}
		
		//String str3 = "a";
		//System.out.println(str3.substring(0,5)); //generates an error
		
		//String Equals
		
		/*
		 * Compare two Strings:
		 * a.equals(b)
		 * 
		 * DO NOT USE == when comparing two strings for equality
		 */
		
		a = "hello";
		b = "there";
		
		if(a.equals("hello")) {
			System.out.println("The strings are equal!");
		}
		if(a == "hello") { //DO NOT USE THIS METHOD.
			System.out.println("== is being used to compare the strings");
		}
		
		//String indexOf Method
		System.out.println("indexOf(): ");
		/*
		 * The indexOf(String target) method searches left to right inside the given string for a "target" string. The indexOf() method
		 * returns the index number where then target string is first found or -1 is the target is not found. This method is
		 * case-sensitive, so uppercase and lowercase chars are considered different.
		 * 
		 */
		str = "Here there everywhere";
		//     012345
		int num1 = str.indexOf("there");
		System.out.println("num1: " + num1);
		int num2 = str.indexOf("er");
		System.out.println("num2: " + num2);
		int num3 = str.indexOf("eR");
		System.out.println("num3: " + num3);
		
		//String lastIndexOf() Method
		System.out.println("lastIndexOf(): ");
		/*
		 * The same thing as the indexOf() method, but instead it will search for the target string from right to left.
		 */
		int num4 = str.lastIndexOf("er");
		System.out.println("num4: " + num4);
		
		//charAt() Method
		System.out.println("charAt(): ");
		/*
		 * The charAt() method will return the character at the specified index in a string
		 * 
		 * the return type of this method is a 'char'
		 */
		
		str = "Hello";
		char result = str.charAt(2);
		System.out.println("result: " + result);
		
		str = "A";
		result = str.charAt(0);
		System.out.println("result2: " + result);
		
		//replace() Method:
		System.out.println("replace() Method: ");
		/*
		 * Syntax:
		 * replace(char searchChar, char newChar);
		 * 
		 * searchChar - A char representing the character that will be replaced by the new character in the string
		 * newChar - A char representing the character to replace the searchChar with
		 */
		
		String myStr = "Hello";
		System.out.println(myStr.replace('l','p'));
		
		//toLowerCase() and toUpperCase() Methods
		System.out.println("toLowerCase() and toUpperCase(): ");
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
	
		//Only the letters will get affected by these methods. Numbers and symbols are not affected.
		String txt2 = "123HellO!@#";
		System.out.println(txt2.toUpperCase());
		System.out.println(txt2.toLowerCase());
		
	}

}
