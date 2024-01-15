package ALGORYTMY.Structures.ZADANIA_A;

public class ListElem {

    int data;
    ListElem next;

    public ListElem(int xd){
        this.data = xd;
        next = null;
    }

    public String toString(){
        return Integer.toString(data);
    }
}
