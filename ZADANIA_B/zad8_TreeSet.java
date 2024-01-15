package ALGORYTMY.Structures.ZADANIA_B;

import java.util.Iterator;
import java.util.TreeSet;
//getTree size insert member delete union intersection difference print
public class zad8_TreeSet {

    private TreeSet<Integer> tree;

    public zad8_TreeSet(){
        tree = new TreeSet<Integer>();
    }

    public TreeSet<Integer> getTree() {
        return tree;
    }

    public int size(){
        return tree.size();
    }

    public void insert(int value){
        if (!member(value)){
            tree.add(value);
        }
    }

    public boolean member(int value){
        return tree.contains(value);
    }

    public boolean delete(int value){
        if (member(value)){
            tree.remove(value);
            return true;
        }
        else return false;
    }

    public zad8_TreeSet union(zad8_TreeSet second_tree){
        zad8_TreeSet union_tree = new zad8_TreeSet();
        Iterator<Integer> i = tree.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            union_tree.insert(locEL);
        }

        Iterator<Integer> i2 = second_tree.getTree().iterator();
        while (i2.hasNext()){
            int locEL = i2.next().intValue();
            union_tree.insert(locEL);
        }

        return union_tree;
    }

    public zad8_TreeSet intersection(zad8_TreeSet second_tree){
        zad8_TreeSet intersection_tree = new zad8_TreeSet();

        Iterator<Integer> i = tree.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            if (second_tree.member(locEL))
                intersection_tree.insert(locEL);
        }

        return intersection_tree;
    }

    public zad8_TreeSet difference(zad8_TreeSet second_tree){
        zad8_TreeSet difference_set = new zad8_TreeSet();

        Iterator<Integer> i = tree.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            if (!second_tree.member(locEL))
                difference_set.insert(locEL);
        }

        return difference_set;
    }

    public void print(){
        Iterator<Integer> i = tree.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            System.out.print(locEL + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
            zad8_TreeSet tree1 = new zad8_TreeSet();
            zad8_TreeSet tree2 = new zad8_TreeSet();

            tree1.insert(20);
            tree1.insert(40);
            tree1.insert(60);
            tree1.insert(80);
            tree1.print();


            tree2.insert(30);
            tree2.insert(60);
            tree2.insert(90);
            tree2.print();

            zad8_TreeSet union = tree1.union(tree2);
            union.print();

            zad8_TreeSet intersection = tree1.intersection(tree2);
            intersection.print();

            zad8_TreeSet difference = tree1.difference(tree2);
            difference.print();
    }

}
