//by array
public class Roll {
 public static void main(String[] args) {
     int[] counts = new int[6];
     for (int i = 1; i <= 100; i++) {
         int dieValue = ();
         System.out.printf("%3d. the die rolled %d%n", i, dieValue);

         counts[dieValue - 1]++;
     }

     for (int i=0; i<counts.length; i++)
         System.out.printf("%d: %d times%s",i+1,counts[i],(i%2!=0)?"
 }
}