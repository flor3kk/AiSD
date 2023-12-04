package ALGORYTMY.GreedyAlg;

import java.util.Arrays;

public class drogaAZ_ew {
    public static void main(String[] args) {
        int[][] droga = new int[][]{
                {0,300,402,356,0,0,0,0,0},
                {300,0,0,0,440,474,0,0,0},
                {402,0,0,0,0,330,0,0,0},
                {356,0,0,0,0,0,823,0,0},
                {0,440,0,0,0,0,0,430,0},
                {0,447,330,0,0,0,813,365,774},
                {0,0,0,823,0,813,0,0,403},
                {0,0,0,0,430,365,0,0,768},
                {0,0,0,0,0,774,403,768,0}
        };
        for(int[] q:droga) System.out.println(Arrays.toString(q));
        int[] tab=new int[10];
        int i=0,j=0,k=0;

        while(true) {

            tab[k]=i;
            int mintemp=10;
            for(int a=0;a<9;a++) {

                if(mintemp<droga[i][a]&&droga[i][a]!=0&&a>i) {

                    j=a;
                    mintemp=droga[i][a];
                    System.out.println(droga[i][a]);
                    droga[i][a]=0;
                    droga[a][i]=0;
                }
            }
            if(tab[k]==8) break;
            i=j;
            k++;
        }
        System.out.println(Arrays.toString(tab));
    }
}
