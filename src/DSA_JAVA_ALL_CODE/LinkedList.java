package DSA_JAVA_ALL_CODE;


class Node{
    public int data;
    public Node next = null;

    public Node(int value) {
    }
}
public class LinkedList {

    private Node head;
    private Node tail;
    public LinkedList(){
        head = null;
        tail= null;

    }
    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head=tail=null;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public int sum(){
        Node current = head;
        int sum=0;
        if(current!=null){
            sum += sum+current.data;
            current = current.next;

        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.insert(12);
        linkedList.insert(23);
        System.out.println(linkedList);
    }

}
