package ALGORYTMY.Structures.ZADANIA_B;

import java.util.LinkedList;
//push pop peek isempty
public class zad2_LinkedListStack {

    private LinkedList<Integer> stos;

    public zad2_LinkedListStack(){
        stos = new LinkedList<Integer>();
    }

    public void push(int value){
        stos.push(value);
    }

    public int pop(){
        return stos.pop();
    }

    public int peek(){
        return stos.peek();
    }

    public boolean isEmpty(){
        return stos.isEmpty();
    }

    public static void main(String[] args) {
        zad1_ArrayListStack stack = new zad1_ArrayListStack();

        stack.push(23);
        stack.push(22);
        stack.push(21);
        stack.push(21);

        System.out.println(stack.pop());
    }

}
