package _6;
//gridways to find the number of ways on a nxn grid from one co-ordinates to others you can
// move only in right and down directions
public class Gridways {
    public static int findways(int i,int j,int m,int n){
      //base case
        if (i==n-1 && j==m-1){
            return 1;
        }
        else if (i==n || j==m){
            return 0;
        }
        int w1=findways(i+1,j,n,m);//function call
        int w2=findways(i,j+1,n,m);//function call
        return w1+w2;
    }
    public static int optimizedways(int n,int m){
        int fnm1=1; int fm1m=1; int fmn=1;
        for (int i=n-1; i>0; i--){
               fnm1 *=i;
           }
        for (int j=m-1; j>0;j--){
            fm1m *=j;
        }
        for (int i=m+n-2; i>0;i--){
            fmn *=i;
        }
        int ans1=fnm1*fm1m;
        return fmn/ans1;
    }
    public static void main(String[] args) {
        int m=4,n=4;
        System.out.println(findways(0,0,n,m));
        //TC -O(N^2)
        //SC-O(N^2)
        System.out.println(optimizedways(n,m));
        //TC-O(N)
    }
}
