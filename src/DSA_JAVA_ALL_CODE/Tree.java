package DSA_JAVA_ALL_CODE;
import java.io.FilterOutputStream;
import java.util.*;

public class Tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        createtree();
    }

    static Nodde1 createtree(){
        Nodde1 root = null;
        System.out.println("enter the data  ");
        int data = sc.nextInt();
        if(data==-1){
            return  null;
        }
        root = new Nodde1(data);
        System.out.println("enter left side of Node " + data);
        root.left = createtree();

        System.out.println("enter right side of node  " + data);
        root.right = createtree();


        return root;
    }

    static void inorder(Nodde1 root){
        if(root==null){
            return;

        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    static void preorder(Nodde1 root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }

    static void postorder(Nodde1 nodde1){
        if(nodde1==null){
            return;
        }
        postorder(nodde1.left);
        postorder(nodde1.right);
        System.out.println(nodde1.data);
    }
}

class Nodde1{
    Nodde1 left,right;
    int data;

    public Nodde1(int data){
        this.data=data;
    }

}
