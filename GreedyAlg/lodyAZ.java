package ALGORYTMY.GreedyAlg;

import java.util.Arrays;

public class lodyAZ {
    public static void main(String[] args) {
        int[][] czas = new int[][]{
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}
            };
        int[][] czas2 = new int[][]{
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}
            };

        for(int[] t: czas) System.out.println(Arrays.toString(t));
        System.out.println(czas[5][4]);
        int i=0,j=0,k=0;
        int min=10000;
        int czas1=0;
        int[] tab = new int[]{100,100,100,100,100,100,100}; //wyniki
        for(int a =0;a<6;a++) {

            for(int b=0;b<6;b++) {

                if(czas[a][b]<=min && czas[a][b]!=0) {

                    i=a;
                    j=b;
                    min=czas[a][b];
                }
            }
        }
        for(int z=0;z<6;z++) {

            czas[i][z]=0;
            czas[z][i]=0;
        }
        for(int[] t: czas) System.out.println(Arrays.toString(t));
        while(tab[5]==100) {

            int x=100;
            tab[k]=i;
            i=j;
            for(int c=0;c<6;c++) {

                if(czas[i][c]<x&&czas[i][c]!=0) {

                    j=c;
                    System.out.println(j);
                    x=czas[i][c];
                }

                czas[i][c]=0;
                czas[c][i]=0;
            }

            k++;
        }
        tab[6]=tab[0];
        System.out.println(Arrays.toString(tab));
        for(int v=0;v<6;v++) {

            czas1+=czas2[tab[v]][tab[v+1]];
        }
        System.out.println(czas1);
    }
}
