package _13;
//given m friends each one can remain single or can be paired with
//some other friend can be paired only once.Find out the total number of ways in
//which friends can remain single or can be paired up.
public class FriendsPairingproblem {
    public static int FriendsPairs(int n){
        //base case
        if (n==1 || n==2){
            return n;
        }
            //choice for single
            int  fnm1 =FriendsPairs(n-1);
        //choice for pairs
        int fnm2=FriendsPairs(n-2);
        int pairways=(n-1)*fnm2;
        int total=fnm1+pairways;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairs(3));
    }
}
