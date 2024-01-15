package ALGORYTMY.Structures.ZADANIA_A;

public class zad2_TablicaDynSort {
    //add get find print size remove
    int elementy;
    int[] tab;
    public zad2_TablicaDynSort(int maxsize){
        tab = new int[maxsize];
        elementy = 0;
    }

    public void add(int value){
        if (elementy >= tab.length ){
            int[] loctab = new int[tab.length*2];
            for (int i = 0; i < tab.length; i++)
                loctab[i] = tab[i];
            tab = loctab;

        }

        tab[elementy] = value;
        elementy++;

        for (int i = 0; i < elementy - 1; i++) {
            for (int j = 0; j < elementy - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    public boolean remove(int index){
        if (elementy == 0 || index >= elementy)
            return false;
        for (int i = index; i < elementy - 1; i++){
            tab[i] = tab[i + 1];
        }
        elementy--;
        return true;
    }

    public int find(int value){
        for (int i = 0; i < elementy; i++) {
            if (tab[i] == value)
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < elementy; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public int get(int index){
        return tab[index];
    }
    public int size(){
        return elementy;
    }


    public static void main(String[] args) {
        zad2_TablicaDynSort tab = new zad2_TablicaDynSort(2);

        tab.add(11);
        tab.add(22);
        tab.add(3);
        tab.add(-4);
        tab.add(-4);
        tab.add(-4);
        tab.add(-4);
        tab.add(-4);

        tab.print();

        System.out.println();
        System.out.println(tab.size());

        tab.remove(2);
        tab.print();
        System.out.println();
        System.out.println(tab.size());

        System.out.println(tab.find(0));
    }
}
