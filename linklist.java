public class linklist {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addMiddle(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        if(idx==0){
            addFirst(data);
            return;
        }
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }


    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;


    }

    public int removeFirst(){
       
        if(size==0){
            System.out.println("linked list is Empty.");
            return -1;
        }else if(size==1){
            head=tail=null;
            int value=head.data;
            size=0;
            return value;
        }
        int value=head.data;
        size--;
        head=head.next;
        return value;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return -1;
        }else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        Node prev=head;

        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int value=prev.next.data;
        
        prev.next=null;
        tail=prev;
        
        size--;
        return value;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalidrome(){
        if(head==null || head.next==null){ //step 1 to check end case
            return true;
        }
        Node midNode=findMid(head); // step 1: to find midnode

        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){    //step 2: to reverse 2nd half
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }


    public static void main(String args[]){
        linklist ll=new linklist();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        // ll.addLast(1);

        System.out.println(ll.checkPalidrome());


    }
}
