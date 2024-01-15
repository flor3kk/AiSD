package ALGORYTMY.Structures.ZADANIA_A;

public class zad1_TablicaDyn {
    //add get find print size remove
    int elementy;
    int[] tab;
    public zad1_TablicaDyn(int maxsize){
        tab = new int[maxsize];
        elementy = 0;
    }

    public void add(int value){
        if (elementy >= tab.length) {
            int[] locTab = new int[tab.length * 2];
            for (int i = 0; i < tab.length; i++) {
                locTab[i] = tab[i];
            }
            tab = locTab;
        }
        tab[elementy] = value;
        elementy++;
    }

    public boolean remove(int index){
        if (elementy == 0 || index >= elementy)
            return false;
        else{
            for (int i = index; i < elementy - 1; i++){
                tab[i] = tab[i + 1];
            }
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
        zad1_TablicaDyn tab = new zad1_TablicaDyn(2);

        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);

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
