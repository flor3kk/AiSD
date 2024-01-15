package ALGORYTMY.Structures.ZADANIA_B;

import java.util.LinkedList;
//insert remove peek isEmpty size
public class zad4_LinkedListQueue {

    private LinkedList<Integer> kolejka;

    public zad4_LinkedListQueue(){
        kolejka = new LinkedList<Integer>();
    }

    public void insert(int value){
        kolejka.addLast(value);
    }

    public int remove(){
        int firstEL = kolejka.get(0).intValue();
        kolejka.removeFirst();
        return firstEL;
    }

    public int peek(){
        return kolejka.peekFirst().intValue();
    }

    public boolean isEmpty(){
        return kolejka.isEmpty();
    }

    public int size(){
        return kolejka.size();
    }

    public static void main(String[] args) {
        zad4_LinkedListQueue queue = new zad4_LinkedListQueue();

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
