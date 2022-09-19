package _2;

import java.util.Stack;
//push the element in bottom of Stack
public class PushinBottom {
    public static void pushAtbottom(int data,Stack<Integer> s){
             if (s.isEmpty()){
                 s.push(data);
                 return;
             }
             int top=s.pop();
             pushAtbottom(data, s);
             s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtbottom(4,s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
