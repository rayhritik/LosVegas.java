import java.security.SecureRandom;

public class Warmup {
    public static void main(String[] args) {
        for(int i=1;i<=100; i++)
        System.out.printf("%3d. the die rolled %d%n",i,rolldie());
    }
    /**
     * this method simulates rolling die and returns number 1-6
     */
 public static int rolldie ()
 {
     SecureRandom rng = new SecureRandom();
     return rng.nextInt(6)+1;
 }
 }

