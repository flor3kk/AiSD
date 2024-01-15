package ALGORYTMY.Structures.ZADANIA_A;
//isEmpty insertFIRST (ListElem)getFIRST find (ListElem)delete (ListElem)deleteFIRST print

public class zad3_LinkedList{
    ListElem first;
    public zad3_LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFIRST(int value){
        ListElem newEL = new ListElem(value);
        if (!isEmpty()){
            newEL.next = first;
        }
        first = newEL;
    }

    public ListElem getFIRST(){
        return first;
    }

    public boolean find(int value){
        if (isEmpty()){
            return false;
        }

        ListElem curr = first;
        while (curr.data != value){
            if (curr.next == null)
                return false;
            else
                curr = curr.next;
        }
        return true;
    }

    public ListElem delete(int value){
        if (isEmpty()){
            return null;
        }

        ListElem curr = first;
        ListElem prev = null;

        while (curr.data != value){
            if (curr.next == null){
                return null;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }

        if (prev == null)
            first = first.next;
        else
            prev.next = curr.next;

        return curr;
    }

    public ListElem deleteFIRST(){
        if (isEmpty()){
            return null;
        }

        ListElem curr = first;
        first = first.next;
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
        zad3_LinkedList list = new zad3_LinkedList();

        list.insertFIRST(23);
        list.insertFIRST(25);
        list.insertFIRST(27);
        list.print();

        list.delete(27);
        list.print();

        list.deleteFIRST();
        list.print();

        System.out.println(list.find(23));
        System.out.println(list.getFIRST());
    }
}