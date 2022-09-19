package _3;

import java.util.Stack;

public class ReverseanStack {
    public static void pushAtbottom(int data,Stack<Integer> s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(data, s);
        s.push(top);
    }
    public static void Reverse(Stack<Integer> s){
        if (s.isEmpty())
        {    return;}
        int top=s.pop();
        Reverse(s);
        pushAtbottom(top,s);

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();//Stack using collection framework
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Reverse(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
