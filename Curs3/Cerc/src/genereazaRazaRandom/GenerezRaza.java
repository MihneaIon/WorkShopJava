package genereazRandomRaza;

import java.util.Random;

public class GenerezRaza {

   private static final double low=1;
   private static final double high=10;

   public static double returnRandom()
   {
       Random random=new Random();
       Double raza=null;
       return raza=low+ (high-low)* random.nextDouble();
   }


}
