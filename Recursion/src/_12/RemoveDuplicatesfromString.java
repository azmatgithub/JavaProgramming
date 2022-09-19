package _12;
//Remove duplicates from string of chrechters consisting only small charechters.
public class RemoveDuplicatesfromString {
    public static void RemoveDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
if (idx==str.length()){
    System.out.println(newstr);
    return;
}
       char currChar= str.charAt(idx);
        if (map[currChar-'a']==true){
          RemoveDuplicates(str,idx+1,newstr,map);
      }
        else {
            map[currChar-'a']=true;
            RemoveDuplicates(str,idx+1,newstr.append(currChar),map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
      RemoveDuplicates(str,0,new StringBuilder(""), new boolean[26]);
    }
}
