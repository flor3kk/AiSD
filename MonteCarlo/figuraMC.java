package ALGORYTMY.MonteCarlo;

import java.util.Random;

public class figuraMC {
    public static void main(String[] args) {
        //System.out.println("POLE = " + pole(1000));
        //System.out.println(xd(1000));
        System.out.println(xd2(1000));
    }

    public static double pole(int llos) {
        Random los = new Random();
        int licz = 0;
        for (int i = 0; i < llos; i++) {
            double x = (los.nextInt(201) - 100) /100.0; //(los.nextInt(101) -50 )/ 1.0;
            double y = (los.nextInt(201) -100) /100.0; //(los.nextInt(101) -50 )/ 1.0;
            System.out.println("x= "+x+"\ty= "+y);
            if( y <= Math.sin(2*x + Math.PI/2) && y >= Math.sin(2*x - Math.PI/2) ){
                licz++;
                System.out.println("gra " + x + " " + y);
            }
        }
        return ( licz / 1000.0 * 4);
    }

    public static double xd(int los){
        Random a = new Random();
        int licz = 0;
        for (int i = 0; i < los; i++) {
            double x = (a.nextInt(401) -200) / 100.0;
            double y = (a.nextInt(601) -300) / 100.0;
            System.out.println(x + " " + y);
            if (y >= (x*x-3) && y <= (-(x*x)+3))
                licz++;
        }
        return (licz / 1000.0 * 24);
    }

    public static double xd2(int los){
        Random aa = new Random();
        int licz = 0;
        for (int i = 0; i < los; i++) {
            double x = (aa.nextInt(151) -50) / 100.0;
            double y = (aa.nextInt(151) -50) / 100.0;
            System.out.println(x + " " + y);
            if (y >= x)
                licz++;
        }
        return (licz / 1000.0 * 2.25);
    }
}



//public class figuraMC {
//    public static void main(String[] args) {
//        System.out.println("POLE = " + pole(10000));
//    }
//
//    public static double pole(int llos) {
//        Random los = new Random();
//        int licz = 0;
//        for (int i = 0; i < llos; i++) {
//            double x = (los.nextInt(401) - 200) /100.0; //(los.nextInt(101) -50 )/ 1.0;
//            double y = (los.nextInt(601) -300) /100.0; //(los.nextInt(101) -50 )/ 1.0;
//            System.out.println("x= "+x+"\ty= "+y);
//            if( y >= x*x - 3 && y <= -(x*x) + 3 ){
//                licz++;
//                System.out.println("gra " + x + " " + y);
//            }
//        }
//        return ( licz / 10000.0 * 24 );
//    }
//}
