package _11;
//how many ways a 2xn board or floor can be filled by 2x1 tile size
public class TiilingProblem {
    public static int numberOfWays(int n){
        //Base case
        if (n==0 || n==1){
            return 1;
        }
        //vertical cases
        int fnm1=numberOfWays(n-1);//for n-1 cases
        //for horigontal cases
        int fnm2=numberOfWays(n-2);
        int  totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(numberOfWays(4));
    }
}
