package Competition;

public class Approach2 {

	public static void main(String[] args) {
		// Tcycles ODO Auto-generated method stub
		
		float a = (float) -1.21;
		float b = (float)-0.32;
		cycleLength(a, b);

	}
	public static String cycleLength(float realPartC, float imagPartC) {
		
		
		
		int cycles = 0;
		
		float currentReal = 0; 
		float currentImag = 0;
		float previousReal = realPartC; 
		float previousImag = imagPartC;
		
		float roundedReal = 0;
		float roundedImag = 0; 
		
		
		//while (Math.sqrt(currentReal * currentReal + currentImag * currentImag) < 4) {
		for (int i = 0; i < 9; i++) {	
			currentReal = realFunction(previousReal, previousImag, realPartC);
			currentImag = imagFunction (previousReal, previousImag, imagPartC);
			cycles++; 
			
			System.out.println(currentReal);
			System.out.println(currentImag);
			
			roundedReal = (float) (Math.round((float)currentReal * 100.0) / 100.0);
			roundedImag = (float) (Math.round((float)currentImag * 100.0) / 100.0);
			
			if (roundedReal == realPartC && roundedImag == imagPartC) {
				System.out.println(cycles);
				return Integer.toString(cycles);
			}
			
			previousReal = roundedReal;
			previousImag = roundedImag;
		}
		
		System.out.println(cycles);
		return "ESCAPES " + cycles;
	}
	
	public static float realFunction(float previousRealNum, float previousImagNum, float startingRealNum) {
		return (previousRealNum * previousRealNum - previousImagNum * previousImagNum ) + startingRealNum;
	}
	public static float imagFunction(float previousRealNum, float previousImagNum, float startingImagNum) {
		return (previousRealNum * previousImagNum * 2) + startingImagNum;
	}

}
