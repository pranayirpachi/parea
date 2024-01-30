package DSA_JAVA_ALL_CODE;

import java.util.LinkedList;

public class LL3 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        list.addFirst("sahil");
        list.addFirst("is ");
        list.addFirst("programmer");
        list.addLast("java");
        System.out.println(list +"");
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+"--> ");

        }
        list.removeLast();
        System.out.println(list);
    }
}
