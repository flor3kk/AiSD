package ALGORYTMY;

public class bakterieDZ {

    public static void main(String[] args) {
        System.out.println(bakt(8));
    }

    static int bakt(int czas){
        if (czas == 0)
            return 0;
        else if (czas < 2)
            return 1;
        else if (czas == 2)
            return 2 * bakt(czas-1);
        else
            return 2 * bakt(czas-2);

    }
}
