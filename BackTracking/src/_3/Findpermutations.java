package _3;

import java.util.Stack;

//Find permutation of given string
public class Findpermutations {
    public static void findpermutaion(String str,String ans){
        //base case
        if (str.length()==0){
            System.out.println(ans);
            return;}
        for (int i=0; i<str.length();i++){
            //recurssive case & backtracking
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1,str.length());
            findpermutaion(newstr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findpermutaion(str,"");

    }
}
