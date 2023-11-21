package ALGORYTMY;

import java.util.Random;

public class FiguraMC {
    public static void main(String[] args) {
        System.out.println("POLE = " + pole(100));
    }
    
    public static double pole(int llos) {
        Random los = new Random();
        int licz = 0;
        for (int i = 0; i < llos; i++) {
            double x = (los.nextInt(301) - 151) /100.0; //(los.nextInt(101) -50 )/ 1.0;
            //double z = (los.nextInt(10001) -5000 )/ 100.0;
            //double y = los.nextInt(101)/100.0;
            double y = (los.nextInt(301) -150) /100.0; //(los.nextInt(101) -50 )/ 1.0;
            System.out.println("x= "+x+"\ty= "+y);
            if(y >= (x * x + 2*x)) {
                licz++;
                System.out.println(x + " " + y + " " + (x * x + 2*x) );
            }
        }
        return ( licz / 100.0 );
    }
}
