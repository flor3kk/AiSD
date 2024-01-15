package ALGORYTMY.Structures.ZADANIA_B;

import java.util.ArrayList;
//insert remove peek isEmpty size
public class zad3_ArrayListQueue {

    private ArrayList<Integer> kolejka;

    public zad3_ArrayListQueue(){
        kolejka = new ArrayList<Integer>();
    }

    public void insert(int value){
        kolejka.add(value);
    }

    public int remove(){
        int firstEL = kolejka.get(0).intValue();
        kolejka.remove(0);
        return firstEL;
    }

    public int peek(){
        return kolejka.get(0).intValue();
    }

    public boolean isEmpty(){
        return kolejka.isEmpty();
    }

    public int size(){
        return kolejka.size();
    }

    public static void main(String[] args) {
        zad3_ArrayListQueue queue = new zad3_ArrayListQueue();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println(queue.peek());

        queue.remove();

        System.out.println(queue.peek());
    }
}
