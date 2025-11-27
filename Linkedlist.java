public class Linkedlist{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode=new Node();
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void main(String args[]){
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);


    }
}