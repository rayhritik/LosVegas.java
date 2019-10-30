import java.security.SecureRandom;

public class Rollingdie {
    public static void main (String[] args){
       //variables to store how many time a value was rolled
        int one =0;
        int two =0;
        int three =0;
        int four =0;
        int five =0;
        int six =0;

        for( int i=1; i<=100;i++){
            int dieValue=rolldie();
            System.out.printf("%3d. the die rolled %d%n",i,dieValue);

            if (dieValue ==1)
                one++;
            else if (dieValue ==2)
                    two++;
            else if (dieValue ==3)
                three++;
            else if (dieValue ==4)
                four++;
            else if (dieValue ==5)
                five++;
            else if (dieValue ==6)
                six++;
        }
        System.out.printf("1: %d times        2: %d times%n",one,two);
        System.out.printf("3: %d times        4: %d times%n",three,four);
        System.out.printf("5: %d times        6: %d times%n",five,six);



    }
    public static int rolldie (){
        SecureRandom rng = new SecureRandom();
        return rng.nextInt(6)+1;

    }
}

