package ALGORYTMY;

import java.util.Random;
public class kosmonauciMC {
    public static int[] A = {1, 0, 0, 1, 0};
    public static int[] B = {0, 1, 1, 1, 0};
    public static int[] C = {0, 0, 1, 0, 1};
    public static int[] D = {1, 1, 0, 0, 1};
    public static String [] listaGlobal = new String[100];

    public static void main(String[] args) {
        int resultCounter=0;

        for(int i=0; i<100; i++) {
            boolean katA = false;
            boolean katB = false;
            boolean katC = false;
            boolean katD = false;
            boolean[] listaAktual = {false,false,false,false,false};
            String lista ="";
            while(!katA || !katB || !katC || !katD) {
                Random r = new Random();
                int x = r.nextInt(0, A.length);
                if(!listaAktual[x]) {
                    if(A[x]==1) katA=true;
                    if(B[x]==1) katB=true;
                    if(C[x]==1) katC=true;
                    if(D[x]==1) katD=true;
                    listaAktual[x]=true;
                    lista += (String)((x+1)+" ");
                }
            }

            boolean resultExists=false;
            for(String k : listaGlobal) {
                if(lista.equals(k))
                    resultExists=true;
            }
            if(!resultExists) {
                listaGlobal[resultCounter]=lista;
                resultCounter++;
            }

        }
        for(String k : listaGlobal)
            if(k!=null) System.out.println(k);

        System.out.println("Najlepsze wyniki: ");
        for(String k : listaGlobal)
            if(k!=null && k.length()==4) System.out.println(k);
    }
}
