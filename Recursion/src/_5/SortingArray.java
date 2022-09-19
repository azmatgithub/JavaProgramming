package _5;

public class SortingArray {
    public static boolean isSorted(int arr[],int i){
        if (i== arr.length-1) return true;
        if (arr[i]>arr[i+1]) return false;
        return isSorted(arr,i+1);
    }
    public static void printindex(int[] arr, int i){
        int key=7;
        if (key==arr[i]){
            System.out.println(i);
        return;
        }
        printindex(arr,i-1);
        if (i==1){
            System.out.println("key not found");
            return;
        }



    }
    public static void main(String[] args) {
         int arr[]={1,2,6,4,5,5};
         printindex(arr, arr.length-1);

}}
