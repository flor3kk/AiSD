package ALGORYTMY;


class krolikiDZ {

    public static void main(String[] args) {
        final int N = 0; // n-ty wyraz ciagu
        System.out.println(kroliki(N));
    }

    static int kroliki(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return kroliki(n - 1) + kroliki(n - 2);
        }
    }
}