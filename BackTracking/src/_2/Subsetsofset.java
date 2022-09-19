package _2;
//find the all subsets of a given string set.
public class Subsetsofset {
    public static void findsubsets(String str, String ans, int i) {
       if (i==str.length())
       {
           if (ans.length()==0){
               System.out.println("null");
           }
            System.out.println(ans);
            return;
        }
        //for yes choice
        findsubsets(str,ans+str.charAt(i),i+1);
        //for no choice
        findsubsets(str,ans,i+1);

    }

    public static void main(String[] args) {
       String str="abc";
       String ans="";
       findsubsets(str,ans,0);
    }
}
