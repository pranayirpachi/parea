package DSA_JAVA_ALL_CODE;
import java.util.*;
public class Arraylist<I extends Number> {
    public static void main(String[] args) {

        //int sum=0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                for(int j = i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        System.out.println(arr[j]);

                    }
                }

            }
        }



//        int n = sc.nextInt();
//        int aarr[] = new int[n];
//        //sum of array
//        for (int i = 0; i < n; i++) {
//            aarr[i]= sc.nextInt();
//
//        }
//        for (int i = 0; i < n;i++){
//            sum += aarr[i]%10;
//            aarr[i]/=10;
//
//        }
//        System.out.println(sum);




//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //add elements list
//        list.add(12);
//        list.add(34);
//        list.add(55);
//        list.add(34);
//        System.out.println(list);
//        int elements = list.get(2);
//        System.out.println(""+elements);
//
//        //add a elements between a index
//        list.add(1,32);
//        System.out.println(list);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println();
//
//        //sorting
//        Collections.sort(list);
//        System.out.println(list);
    }

}
