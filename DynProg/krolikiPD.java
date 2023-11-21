package ALGORYTMY;
class krolikiPD {

    public static void main(String[] args)
    {
        final int N = 2 ; // n-ty wyraz ciagu
        System.out.println(kroliki(N));
    }

    static int kroliki(int n)
    {
        int[] tab = new int[n + 1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        tab[1] = 1;
        tab[2] = 1;
        for (int i = 3; i < tab.length; i++)
        {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        return tab[tab.length - 1];
    }
}
