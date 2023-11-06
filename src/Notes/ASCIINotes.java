package Notes;
import java.util.Arrays;

public class ASCIINotes {

	public static void main(String[] args) {
		
		char c = 'A'; //A has an ASCII decimal value of 65
		System.out.println("c + 10: " + (c + 10));
		
		String str = "helloworldlwaskjdhfiopasdluglaskjdblkj";
		
		//Let's say we want to create an array keeping track of the frequency of the letters that appear
		int[] freqArray = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			
			freqArray[str.charAt(i)-'a'] += 1;
			
		}
		
		System.out.println("Frequency Array: \n" + Arrays.toString(freqArray));
		System.out.println("[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]");
		
		//Type Casting with Chars and Ints
		int n = 97;
		System.out.println("Type-Casting n to a char: " + (char)(n));
		char ch = 'z';
		System.out.println("Type-Casting ch to an int: " + (int)(ch));

	}

}
