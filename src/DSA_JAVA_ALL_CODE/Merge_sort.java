package DSA_JAVA_ALL_CODE;

public class Merge_sort {
    public static void conquer(int[] arr, int si, int ei, int mid){
        int merge[]= new int[ei-si+1];
        int i;
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){

            if(arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];

            }else{
                merge[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merge[x++]=arr[idx2++];

        }
        for (i = 0; i < merge.length; i++) {
            for (int j = si; j < merge.length; j++) {
                arr[j]=merge[i];
            }
        }
    }
    public static void divide(int arr[],int si,int ei){
         int mid = si + (ei-si)/2;
        if(si<=ei){
            return;
        }
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");

        }
        System.out.println();
    }
}
