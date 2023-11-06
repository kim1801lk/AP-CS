import java.util.Scanner;
import java.util.*;

public class Andover2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		if (y2 - y1 == 1 && x2-x1 == 2)
			System.out.println(1);
		else if (y2 - y1 == -1 && x2-x1 == 2)
			System.out.println(1);
		else if (y2 - y1 == 1 && x2-x1 == -2)
			System.out.println(1);
		else if (y2 - y1 == -1 && x2-x1 ==-2)
			System.out.println(1);
		else if (y2 - y1 == 2 && x2-x1 == 1)
			System.out.println(1);
		else if (y2 - y1 == -2 && x2-x1 == 1)
			System.out.println(1);
		else if (y2 - y1 == 2 && x2-x1 == -1)
			System.out.println(1);
		else if (y2 - y1 == -2 && x2-x1 == -1)
			System.out.println(1);
		else if (y2-y1 == x2-x1)
			System.out.println(1);
		else if ((y2-y1 ) * -1 == x2-x1)
			System.out.println(1);
		else 
			System.out.println(3);

	}

}
