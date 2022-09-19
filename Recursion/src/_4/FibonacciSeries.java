package _4;
public class FibonacciSeries {
    public static long fibonacci(int n)
    {
        if (n==0) return 0;
        if (n==1) return 1;
        long fibnm1=fibonacci(n-1);
        long fibnm2=fibonacci(n-2);
        long fib=fibnm1+fibnm2;
        return fib;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(fibonacci(n));
    }
}
