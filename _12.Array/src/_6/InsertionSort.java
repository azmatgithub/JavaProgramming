package _6;
public class InsertionSort {
    public static void  insertarray(int arr[]){
        for (int i=1;i< arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            for (int k=prev; prev>=0 && arr[prev]>cur; prev--){
                arr[prev+1]=arr[prev];

            }
            arr[prev+1]=cur;
        }
        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1};
        insertarray(arr);
    }
}
