package ALGORYTMY.Structures.ZADANIA_B;

import java.util.ArrayList;
//addLAST removeLAST get find size print
public class zad5_ArrayList {
    private ArrayList<Object> list;

    public zad5_ArrayList(){
        list = new ArrayList<Object>();
    }

    public boolean addLAST(Object value){
        return list.add(value);
    }

    public Object removeLAST(){
        int lastINDEX = list.size() - 1;
        return list.remove(lastINDEX);
    }

    public Object get(int index){
        return list.get(index);
    }

    public int find(Object value){
        return list.indexOf(value);
    }

    public int size(){
        return list.size();
    }

    public void print(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        zad5_ArrayList listaa = new zad5_ArrayList();

        listaa.addLAST("xd");
        listaa.addLAST("xd2");
        listaa.addLAST("xd3");
        listaa.addLAST("xd4");

        listaa.print();

        System.out.println(listaa.get(2));

        System.out.println(listaa.removeLAST());

        listaa.print();

        System.out.println(listaa.find("xd4"));
    }
}
