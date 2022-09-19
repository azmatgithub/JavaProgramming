package _1;
//decrease all the elements of an array by 2.
public class ChangeinArray {
    public static void changeinArray(int arr[], int i, int val){
        if (i== arr.length){
            printArray(arr);
            return;
        }
        arr[i]=val;
        changeinArray(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArray(int arr[]){
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeinArray(arr,0,1);
        printArray(arr);
    }
}
