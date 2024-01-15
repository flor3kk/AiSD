package ALGORYTMY.Structures.ZADANIA_B;

import java.util.LinkedList;
//isEmpty insertFIRST insertLAST removeFIRST removeLAST getFIRST getLAST size print
public class zad6_LinkedList {
    private LinkedList<Object> list;

    public zad6_LinkedList(){
        list = new LinkedList<Object>();
    }

    public boolean isEMPTY(){
        return list.isEmpty();
    }

    public void inserFIRST(Object value ){
        list.addFirst(value);
    }

    public void insertLAST(Object value){
        list.addLast(value);
    }

    public Object removeFIRST(){
        return list.removeFirst();
    }

    public Object removeLAST(){
        return list.removeLast();
    }

    public Object getFIRST(){
        return list.getFirst();
    }

    public Object getLAST(){
        return list.getLast();
    }

    public int size(){
        return list.size();
    }

    public void print(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        zad6_LinkedList listaa = new zad6_LinkedList();

        listaa.inserFIRST("sda");
        listaa.inserFIRST(24);
        listaa.inserFIRST(25);
        listaa.insertLAST(55);
        listaa.insertLAST(56);
        listaa.insertLAST(57);
        listaa.print();
    }

}
