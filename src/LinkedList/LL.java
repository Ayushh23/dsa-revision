package LinkedList;

public class LL  {
    public static void main(String[] args) {
        CustomLinkedList l1=new CustomLinkedList();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(3);
        l1.insertLast(5);
        l1.insertLast(14);
        l1.display();
        l1.deleteFirst();
        l1.display();
        l1.deleteLast();
        l1.display();
        l1.insertAtIndex(333,2);
        l1.display();

    }
}
