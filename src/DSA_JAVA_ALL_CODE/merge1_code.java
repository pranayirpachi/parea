package DSA_JAVA_ALL_CODE;

public class merge1_code {
    int arr[];
    int tempmergearr[];
    int length;
    public static void main(String[] args) {
        int inputarr[] = {2,3,4,4,3,3,3};
        merge1_code ms = new merge1_code();
        ms.sort(inputarr);
        for (int i:inputarr){
            System.out.print(i+" ");
        }

    }
    public void sort(int inputarr[]){
        this.tempmergearr = new int[length];
        this.length=inputarr.length;
        this.arr=inputarr;
        dividedarr(0,length-1);
    }
    public void dividedarr(int lowidx,int hightidx){
        if(lowidx<=hightidx){
            int middle=lowidx+(hightidx-lowidx)/2;
            dividedarr(middle,lowidx);
            dividedarr(middle+1,hightidx);

        }
    }
    public void mergesort(int lowidx,int middle,int highidx){
        for (int i = lowidx; i < highidx; i++) {
            tempmergearr[i]=arr[i];
        }
        int i = lowidx;
        int j = middle+1;
        int k = lowidx;
        while (i<=middle&&j<=highidx){
            if(tempmergearr[i]<tempmergearr[j]){
                arr[k]=tempmergearr[i];
                i++;
            }
            else{
                arr[k]= tempmergearr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            arr[k]=tempmergearr[i];
            k++;
            i++;
        }
    }



}
