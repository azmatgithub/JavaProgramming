package _1;
/*this program is written for understand the classes and objects*/
class Pen{//this is a class name as pen
    String color;//these are the properties of a class
    int tip;
    void write(){//function or method of the class
        System.out.println("write something");
    }
}


public class classandObjects {
    public static void main(String[] args) {
     Pen p1=new Pen();//object of class pen the pen() called constructors
     p1.color="blue";
     p1.tip=2;
        System.out.println(p1.tip);
     p1.write();
    }
}

