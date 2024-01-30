package DSA_JAVA_ALL_CODE;

public class bubble_s {
    void swap(int n1,int n2)
    {
        int temp = n1;
        n1=n2;
        n2=temp;
    }

        void bubblesort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr[j],arr[j+1]);

                }
            }
        }
    }
    void insertionsort(int arr[],int n){
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];

                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;

        }
    }
    void printarr(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.println("" +arr[i]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {2,3,2,3,32,3};
        bubble_s bs = new bubble_s();
        bs.bubblesort(arr,5);
        bs.printarr(arr,5);

        bs.insertionsort(arr,5);
        bs.printarr(arr,5);


    }
}
