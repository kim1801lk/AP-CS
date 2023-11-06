package Competition;

public class ACSL_2122C4 {

	public static void main(String[] args) {
	
	
	float a =(float) -1.21;
	float b = (float) -0.32;
	
		cycleLength(a, b);
	}
	public static String cycleLength(float realPartC, float imagPartC) {
		
	     int cycle = 0;
         float r1 = realPartC;
         float i1 = imagPartC;
         float r2 = 0;
         float i2 = 0;
    
         
 
         String value = "";
         for (int i= 0; i < 8; i++) {
                 r2 = (r1 * r1 - i1 * i1) + realPartC;
               
                 
                 i2 = (r1 * i1 + r1 * i1) + imagPartC;
                 cycle++;
                
                 //it only prints the right answer (-0.185) when it's printed like this:
//                 System.out.printf( "%f", i2);
//                 System.out.printf("\n%f * %f * 2 + %f = %f\n", r1, i1, imagPartC, i2);
                 
                 
                 //when i2 is printed like this it uses the wrong value (-0.184999 instead of -0.185)
//                 System.out.println((r1 * i1 + r1 * i1) + imagPartC);
//                 System.out.println(i2);
//                 System.out.println();
                 
             	 double r21 = Math.round((float)r2 * 1000.0) / 1000.0;
                 double i21 = Math.round( i2 * 1000.0) / 1000.0;  
                 System.out.println(i21);
               r21 = Math.round((float)r21 * 100.0) / 100.0;
                  i21 = Math.round((float)i21 * 100.0) / 100.0;  
                 
                 if ((float) r21 == realPartC && (float) i21 == imagPartC) {
                   
                    return Integer.toString(cycle);
       
                }
                 System.out.println(r1);
                 System.out.println(i21);
                 System.out.println();
                 r1 = (float) r21;
                 i1 = (float) i21;
                
         
        }
 
         return "ESCAPES " + (cycle + 1); 
          
          
          
	    }
	}

