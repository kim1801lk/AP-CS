import java.util.*;
public class Andover3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num = input.nextInt();
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		
		while (num !=0) {
		int digit = num % 10;
		
		num = num / 10;
		
		while (digit % 2 == 0 || digit % 7 == 0) {
			 
			digit++;
		}
		
		i1.add(0, digit);
		}
		
		
		//for (int i = 0; i < )
	}

}
