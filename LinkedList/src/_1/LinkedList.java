package _1;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size;
    public void addfirst(int data){
        //step-1 create new node
        Node newNode=new Node(data);
        if (head==null){//corner case for empty LL
            head=tail=newNode;
            size++;
            return;
        }
        //step-2 point next of new node to head
        newNode.next=head;
        //step-3 update the value of head with new node
        head=newNode;
        size++;
    }
    public void addlast(int data){
        //step-1 create new node
        Node newNode=new Node(data);
        if (head==null){//corner case for empty LL
            head=tail=newNode;
            size++;
            return;
        }
        //step-2 tail next=new node
        tail.next=newNode;
        //step-3 new node
        tail=newNode;
        size++;
    }
    public void printLL(){
        Node temp=head;
        if (head==null){
            System.out.print("LL is empty");
        }
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int data,int idx ){//add a node in nth position in node
      Node newNode=new Node(data);
      if (idx==0){
          addfirst(data);
          size++;
          return;
      }
      Node temp=head;
      int i=0;
      while (i<idx-1){
          temp=temp.next;
          i++;
      }
      //i=idx-1 temp=prev element  where the node to be inserted
        newNode.next=temp.next;
         temp.next=newNode;
         size++;
    }
    public int removefirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
            size--;
            int val = head.data;
            head = head.next;
            return val;
    }
    public int removelast(){
        if (size==0){
            return -1;
        }
        else if (size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //preve: i=size-2
            Node prev=head;
        for (int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int Itrativesearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null){
            if (temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;//key not found
    }
    public int recusivesearch(int key){
        return helper(head,key);
    }
    public int helper(Node head,int key){
        if (head==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if (idx==-1){
            return -1;
        }
        return idx+1;
    }
    public void iterativereverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
          head=prev;

    }
    public  void removenthendside(int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if (n==size){
            head=head.next;
            return;
        }
        int i=1;
        int indextofind=size-n;
        Node prev=head;
        while (i<indextofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.printLL();
        ll.addfirst(2);
        ll.printLL();
        ll.addfirst(1);
        ll.printLL();
        ll.addlast(3);
        ll.printLL();
        ll.addlast(4);
        ll.printLL();
        ll.addMiddle(6,1);
        ll.printLL();
        ll.removefirst();
        ll.printLL();
        System.out.println(ll.size);
        ll.removelast();
        ll.printLL();
        System.out.println(ll.size);
        System.out.println(ll.Itrativesearch(3));
        System.out.println(ll.Itrativesearch(10));
        ll.iterativereverse();
        ll.printLL();
        ll.removenthendside(1);
        ll.printLL();
    }
}
