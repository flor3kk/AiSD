package ALGORYTMY;

import java.util.Random;

public class zgadywanieMC {

    static Random rand = new Random();
    static int liczba = rand.nextInt(0, 1001);

    public static void main(String[] args) {
        System.out.println("wylosowana liczba: " + liczba);

        int a = 0;
        int b = 1001;
        int srodek = 0;

        while (srodek != liczba) {
            srodek = rand.nextInt(a, b);

            if (srodek == liczba) {
                System.out.println("brawo " + srodek);
                break;
            } else if (srodek > liczba) {
                System.out.println("ZA DUZA " + srodek);
                b = srodek;

            } else {
                System.out.println("ZA MALA " + srodek);
                a = srodek;
            }
        }
    }
}