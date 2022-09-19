package _2;
//print numbers in increasing order
public class Recusion2 {
    public static void printincreasing(int n){
             if (n==1){
                 System.out.println(1);
                 return;
             }
             printincreasing(n-1);
        System.out.println(n+" ");
    }

    public static void main(String[] args) {
        int  n=10;
        printincreasing(10);
    }
}
