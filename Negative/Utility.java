package Negative;

public final class Utility {

     /**
      * Generates random __double__ between high and low
      * 
      * @param high -- highest value
      * @param low  -- lowest number
      * @return Number between high and low
      */
     public static double genRandNum(double high, double low) {
          double d = Math.random();

          d *= (high - low);
          d += low;
          return d;
     }

     /**
      * Generates Random Integer between high and low
      * 
      * @param high --highest value
      * @param low  --lowest number
      * @return randon Number
      */
     public static int genRandNum(int high, int low) {
          return Math.round((float) genRandNum((double) high, (double) low));
     }
}
