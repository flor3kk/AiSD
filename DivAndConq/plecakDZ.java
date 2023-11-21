package ALGORYTMY;

public class plecakDZ
{
        final static int N = 6;                // liczba przedmiotow
        final static int MAX_V = 10;           // objetosc plecaka
        final static int[] V = {6,2,3,2,3,1};  // objetosci przedmiotow
        final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow
        static int[] p = new int[N];
        static int plecak(int i, int v) {
            int w1;
            int w2;
            if (i == 0 && v < V[0]) {
                p[i]=0;
                return 0;
            }

            if (i == 0 && v >= V[0]) {
                p[i]=1;
                return W[0];
            }
            w1 = plecak(i - 1, v);

            if (i > 0 && v < V[i])
                return w1;

            w2 = W[i] + plecak(i - 1, v - V[i]);

            if (w2 > w1){
                p[i]=1;
                return w2;
            }
            else {
                p[i]=0;
                return w1;
            }
        }

        public static void main(String[] args) {
            System.out.println("Wartosc przedmiotow: " + plecak(N - 1, MAX_V));

            for (int i = 0; i < p.length; i++) {
                if(p[i]==1)
                    System.out.print((i)+" ");
            }
        }
    }
