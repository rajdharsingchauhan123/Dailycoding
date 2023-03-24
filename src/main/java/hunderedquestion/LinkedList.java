package hunderedquestion;



public class LinkedList{
    private Node head;
    private Node tail;
    private int size=0;

    public LinkedList(){
        this.size=0;

    }
    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;

        size++;

    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public   void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;

        }
    }
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }



    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insertFirst(1);

        linkedList.display();

    }

}
