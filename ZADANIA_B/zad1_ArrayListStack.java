package ALGORYTMY.Structures.ZADANIA_B;

import java.util.ArrayList;
//push pop peek isempty
public class zad1_ArrayListStack {

    private ArrayList<Integer> stos;

    public zad1_ArrayListStack(){
        stos = new ArrayList<Integer>();
    }

    public void push(int value){
        stos.add(value);
    }

    public int pop(){
        return stos.remove(stos.size() - 1);
    }

    public int peek(){
        return stos.get(stos.size() - 1);
    }

    public boolean isEmpty(){
        return stos.isEmpty();
    }

    public static void main(String[] args) {
        zad1_ArrayListStack stack = new zad1_ArrayListStack();

        stack.push(23);
        stack.push(234);
        stack.push(2355);
        stack.push(23566);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
