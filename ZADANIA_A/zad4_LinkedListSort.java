package ALGORYTMY.Structures.ZADANIA_A;
//isempty insertFirst insert (ListElem)find (ListElem)delete (ListElem)deletefirst print

public class zad4_LinkedListSort {
    ListElem first;
    public zad4_LinkedListSort(){
        first = null;
    }

    public boolean isempty(){
        return (first == null);
    }

    public void insertFirst(int value){
        ListElem newEL = new ListElem(value);
        newEL.next = first;
        first = newEL;
    }

    public void insert(int value){
        ListElem newEL = new ListElem(value);
        ListElem curr = first;
        ListElem prev = null;

        while (curr != null &&  newEL.data > curr.data){
            prev = curr;
            curr = curr.next;
        }

        if (prev == null){
            first = newEL;
        }
        else
            prev.next = newEL;
        newEL.next = curr;
    }

    public ListElem find(int value){
        if (isempty())
            return null;

        ListElem curr = first;

        while (curr.data != value){
            if (curr.next == null)
                return null;
            else
                curr = curr.next;
        }

        return curr;
    }

    public ListElem deletefirst(){
        if (isempty())
            return null;

        ListElem curr = first;
        first = first.next;
        return curr;
    }

    public ListElem delete(int value){
        if (isempty())
            return null;

        ListElem curr = first;
        ListElem prev = null;

        while (curr.data != value){
            if (curr.next == null){
                return null;
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }

        if (prev == null)
            first = first.next;
        else
            prev.next  = curr.next;

        return curr;
    }

    public void print(){
        ListElem curr = first;
        while (curr != null){
            System.out.print(curr.toString() + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        zad4_LinkedListSort tes = new zad4_LinkedListSort();

        tes.insert(23);
        tes.insert(232);
        tes.insert(231);
        tes.insert(213);
        tes.insert(123);
        tes.print();
    }
}
