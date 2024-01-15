package ALGORYTMY.Structures.ZADANIA_A;

import java.util.LinkedList;

public class zad6_TablicaChain {
    //insert delete find print2 size hashFunc getList

    LinkedList[] list;
    int listSize;

    public zad6_TablicaChain(int size){
        list = new LinkedList[size];
        listSize = size;

        for (int i = 0; i < size; i++) {
            list[i] = new LinkedList();
        }
    }

    public LinkedList getList(int index){
        return list[index];
    }

    public int size(){
        return listSize;
    }

    private int hashFUNC(int element){
        return element % listSize;
    }

    public void print(){
        for (int i = 0; i < size(); i++) {
            for (Object val : getList(i)){
                System.out.print(val.toString() + " ");
            }
        }
        System.out.println();
    }

    public void insert(int element){
        int hashVAL = hashFUNC(element);
        if (!list[hashVAL].contains(element)){
            list[hashVAL].addFirst(element);
        }
    }

    public boolean find(int element) {
        int hashVAL = hashFUNC(element);
        return list[hashVAL].contains(element);
    }

    public void remove(int element){
        int hashVAL = hashFUNC(element);
        list[hashVAL].remove((Object) element);
    }

    public static void main(String[] args) {
        zad6_TablicaChain tab = new zad6_TablicaChain(4);

        tab.insert(23);
        tab.insert(24);
        tab.insert(25);
        tab.insert(26);
        tab.print();

        tab.remove(23);
        tab.print();

        System.out.println(tab.find(26));
        System.out.println(tab.size());
    }
}
