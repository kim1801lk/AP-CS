import java.util.Scanner;

public class Andover1 {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		int boardSize = in.nextInt();
		
		int row = in.nextInt();
		int col = in.nextInt();
		
		String [][] board = new String [boardSize][boardSize];
		
		for (int i = 0; i < boardSize; i++) {
			for ( int j = 0; j < boardSize; j++) {
				board [i][j] = in.next();
			}
		}
		
		if (board[row][col].equals("S"))
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}
