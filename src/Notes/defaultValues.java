package Notes;
public class defaultValues {

	static boolean bool;
	static char ch;
	static double d;
	static int i;
	static String str;
	
	public static void main(String[] args) {
		
		//Every data type has a default value
		System.out.println("Boolean Default Value: " + bool);
		
		/*
		 * While it may seem that nothing gets printed out for
		 * the default value of char, there is an actual value there.
		 * It is an empty char, which looks like this: ''
		 */
		System.out.println("char Default Value: " + ch);
		System.out.println("double Default Value: " + d);
		System.out.println("int Default Value: " + i);
		System.out.println("String Default Value: " + str);

	}

}
