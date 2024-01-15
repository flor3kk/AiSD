package ALGORYTMY.Structures.ZADANIA_B;
//getHash size insert member delete union intersection difference print
import java.util.HashSet;
import java.util.Iterator;

public class zad9_HashSet {

    private HashSet<Integer> hash;

    public zad9_HashSet(){
        hash = new HashSet<Integer>();
    }

    public HashSet<Integer> getHash(){
        return hash;
    }

    public int size(){
        return hash.size();
    }

    public void insert(int value){
        if (!member(value)){
            hash.add(value);
        }
    }

    public boolean member(int value){
        return hash.contains(value);
    }

    public boolean delete(int value){
        if (member(value)){
            hash.remove(value);
            return true;
        }
        return false;
    }


    public zad9_HashSet union(zad9_HashSet second_hash){

        zad9_HashSet union_hash = new zad9_HashSet();
        Iterator<Integer> i = hash.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            union_hash.insert(locEL);
        }

        Iterator<Integer> i2 = second_hash.getHash().iterator();
        while (i2.hasNext()){
            int locEL = i2.next().intValue();
            union_hash.insert(locEL);
        }

        return union_hash;
    }

    public zad9_HashSet intersection(zad9_HashSet second_hash){

        zad9_HashSet intersection_hash = new zad9_HashSet();
        Iterator<Integer> i = hash.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            if (second_hash.member(locEL)){
                intersection_hash.insert(locEL);
            }
        }

        return intersection_hash;
    }

    public zad9_HashSet difference(zad9_HashSet second_hash){

        zad9_HashSet difference_hash = new zad9_HashSet();
        Iterator<Integer> i = hash.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            if (!second_hash.member(locEL)){
                difference_hash.insert(locEL);
            }
        }

        return difference_hash;
    }

    public void print(){
        Iterator<Integer> i = hash.iterator();
        while (i.hasNext()){
            int locEL = i.next().intValue();
            System.out.print(locEL + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        zad9_HashSet hash1 = new zad9_HashSet();
        zad9_HashSet hash2 = new zad9_HashSet();

        hash1.insert(20);
        hash1.insert(40);
        hash1.insert(60);
        hash1.insert(80);

        hash1.print();

        hash2.insert(30);
        hash2.insert(60);
        hash2.insert(90);
        hash2.print();

        zad9_HashSet union = hash1.union(hash2);
        union.print();

        zad9_HashSet intersection = hash1.intersection(hash2);
        intersection.print();

        zad9_HashSet difference = hash1.difference(hash2);
        difference.print();
    }

}
