package Competition;

public class roundingTest {

	public static void main(String[] args) {
		
		float a = (float) -0.185;

		double aRounded = Math.round((float)a * 100.0) / 100.0;
		
		System.out.println(aRounded);
		
		double aRounded_ = Math.round(-0.185 * 1000.0) / 1000.0;
		
		System.out.println(aRounded_);

		double negNum = Math.round((float)-0.5);
		System.out.println(negNum);
	}

}
