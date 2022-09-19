package _3;

public class SumofNnatural {
    public static int printSum(int n){//for calculating the sum
        if (n==1){
            return 1;
        }
       int smn1=printSum(n-1);
       int Sn=n+smn1;

        return Sn;
    }
    public static int printFact(int n){//for caculating the factorial
        if (n==0){
            return 1;
        }
      int   factnm1=printFact(n-1);
      int fatcn=n*factnm1;
      return fatcn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printSum(n));
        System.out.println(printFact(n));

    }

}
