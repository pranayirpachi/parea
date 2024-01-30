package LINKEST_LIST;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insetfirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    public void insetatend(int val){
        if(tail==null){
            insetfirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public  void insertatspecific(int val,int index){
        if(index==0){
            insetfirst(val);
            return;
        }
        if(index==size){
            insertatspecific(val,index);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
            size++;

        }
        Node node = new Node(val,temp.next);
        temp.next=node;
    }
    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return  val;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ "-> ");
            temp=temp.next;
        }
        System.out.print("END");
    }
    private class Node
    {
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int value,Node next){
            this.val=val;
            this.next=next;
        }
    }


}
