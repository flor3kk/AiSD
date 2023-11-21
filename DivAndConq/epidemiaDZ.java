package ALGORYTMY;

public class epidemiaDZ {
    public static void main(String[] args) {
        final int dni = 7;
//        System.out.println("zdrowych: " + (10000 - epidemia(dni))
//                + ", chorych: " + epidemia(dni));
        System.out.println(epidemia(7));
    }

   static int epidemia(int dni){
       if (dni == 0)
           return 0;
       else if ( dni == 1)
           return 10;
       else if (dni > 1 && dni < 8)
           return 3 * epidemia(dni - 1);
       else if (dni == 8)
           return 3 * epidemia(dni - 1) - epidemia( dni - 7);
       else
           return 3 * epidemia(dni - 1) - 2 * epidemia(dni - 8);
   }
