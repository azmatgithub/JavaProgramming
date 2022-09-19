package _9;
//power of x to power n x^n
public class PowerofXpowN {
    //brute force method
    public static int calcpower(int x, int n){
        if (n==1){
            return x;
        }
        int powxmn= calcpower(x,n-1);
        int powxn=x*powxmn;
        return powxn;
    }
    //optimized method
    public static int caloptimizedpower(int x, int n){
      if (n==0){
          return 1;
      }
      int halfsqpower1=caloptimizedpower(x,n/2);
      int halfsqpower=halfsqpower1*halfsqpower1;
      if (n%2!=0){
          halfsqpower=x*halfsqpower;
          return halfsqpower;
      }
      return halfsqpower;
    }
    public static void main(String[] args) {
        int out1=calcpower(2,10);
        int out=caloptimizedpower(2,10);
        System.out.println(out1);
        System.out.println("otimized power");
        System.out.println(out);
    }
}
