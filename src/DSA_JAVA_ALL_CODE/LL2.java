package DSA_JAVA_ALL_CODE;
public class LL2 {
    class Node{
        Node next;
        Node head;
        String data;

        Node(String data){
            this.data=data;
            this.next=null;
        }
        public void addfirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            head.next=newNode;
            head=newNode;
        }
        public void addlast(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node curNode=head;
            while(curNode.next!=null){
                curNode=curNode.next;
            }
            curNode.next=newNode;

        }
        public void printlist(){
            Node newNode = new Node(data);
            if(head==null){
                System.out.println("LIST IS empty");
                return;
            }
            Node curNode = head;
            while(curNode.next!=null) {
                System.out.println(curNode.data +" -> ");
                curNode = curNode.next;
            }
            System.out.println("NULL");
        }
        public  void deletefirst(){
            if(head==null){
                System.out.println("this list is empty");
                return;

            }
            head=head.next;
        }
        public void lastdelete(){
            if(head==null){
                System.out.println("this is empty");
                return;

            }
            Node secomdlast = head;
            Node lastNode = head.next;
        }

        }

    }

