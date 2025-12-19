package LinkedList;

public class CustomLinkedList {

    private Node head;
    private int size=0;

    public boolean insertFirst(int val){
       Node node=new Node(val);
        node.next=head;
        head=node;
        size+=1;
        return true;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("end");

    }

    public void deleteFirst(){
    head=head.next;
    size--;
}
public void deleteLast(){
        if (size==1){
            deleteFirst();
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

}

    public boolean insertLast(int val){
        if (head==null){
            insertFirst(val);
            return true;
        }
        Node node=new Node(val);
        node.next=null;
         Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size+=1;
        return true;

    }

    public void insertAtIndex(int val , int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;


    }



    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }

        public Node(int data, Node node){
            this.data=data;
            this.next=node;
        }
    }


}
