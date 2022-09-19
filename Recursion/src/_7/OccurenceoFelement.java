package _7;
//Occurence of Element or value  in an array
public class OccurenceoFelement {
    //Occurence of Element or value  in an array from first
    public static int OccurfisrtIndex(int arr[], int i,int key){
        if (i== arr.length){
            System.out.println("Element not found");
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
       return OccurfisrtIndex(arr,i+1,key);
    }
    //Occurence of Element or value  in an array from last
    public static int OccurlastIndex(int arr[],int i, int key){
        if (i==-1){
            System.out.println("Element not found");
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return OccurlastIndex(arr,i-1,key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,6};
        System.out.println(OccurfisrtIndex(arr,0,6));
        System.out.println(OccurlastIndex(arr,arr.length-1,5));
    }
}
