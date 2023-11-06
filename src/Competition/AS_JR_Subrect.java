package Competition;
import java.util.*;
public class AS_JR_Subrect {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			
			//initializing my 2D array
			String[] input = in.nextLine().split(" ");
			int R = Integer.parseInt(input[0]);
			int C = Integer.parseInt(input[1]);
			int[][] matrix = new int[R][C];
			int counter = 2;
			for(int r = 0; r < R; r++) {
				for(int c = 0; c < C; c++) {
					matrix[r][c] = Integer.parseInt(input[counter]);
					counter += 1;
				}
			}
			//calling the method that finds max sum
			System.out.println(maxMatrixSum(matrix));
		}
		
	}
	
	public static int maxMatrixSum(int[][] matrix) {
		
		int row = matrix.length;
		int col = matrix[0].length;
		int matrixLeft = -1, matrixRight = -1, matrixTop = -1, matrixBottom = -1;
		int maxSum = Integer.MIN_VALUE;
		int[] rowSum = new int[row];
		int sum, start = 0, end;
		for (int left = 0; left < col; left++) {
			Arrays.fill(rowSum, 0);
			for (int right = left; right < col; right++) {
				for (int i = 0; i < row; i++) {
					rowSum[i] += matrix[i][right];
				}
				int currSum = 0, greatestSum = Integer.MIN_VALUE;
				end = -1;
				int currStart = 0;
				for (int i = 0; i < row; i++) {
					currSum += rowSum[i];
					if (currSum < 0) {
						currSum = 0;
						currStart = i + 1;
					} else if (maxSum < currSum) {
						greatestSum = currSum;
						start = currStart;
						end = i;
					}
				}
				if (end != -1) {
					sum = greatestSum;
				} else {
					start = 0;
					end = 0;
					greatestSum = rowSum[0];
					for (int i = 0; i < row; i++) {
						if (greatestSum < rowSum[i]) {
							greatestSum = rowSum[i];
							start = i;
							end = i;
						}
					}
					sum = greatestSum;
				}
				if (maxSum < sum) {
					maxSum = sum;
					matrixLeft = left;
					matrixRight = right;
					matrixTop = start;
					matrixBottom = end;
				}
			}
		}
		return maxSum;
	}

}
