package _6;
//find array is sorted or not
public class isSortedArray {
    public static boolean isSorted(int arr[],int i){
        if (i== arr.length-1){//
            return true;
        }
           if (arr[i]>arr[i+1]){//
                   return false;
        }
           return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
           int arr[]={1,2,4,4,5};
        System.out.println(isSorted(arr,0));
    }
}
