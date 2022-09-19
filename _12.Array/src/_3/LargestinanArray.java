package _3;
//this program is written for  brute force method in finding largest in an rray
public class LargestinanArray {
    public static int printlargest(int arr[]){
        int maximum = 0;
        for (int i=0;i<arr.length;i++){
            maximum=arr[i];
            for (int j=1;j< arr.length-1;j++){
                if (maximum<arr[arr[j]]){
                    maximum=arr[j];
                }
            }
        }
       return maximum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(printlargest(arr));
    }
}
