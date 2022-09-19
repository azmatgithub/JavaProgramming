package _7;
class  Animal{//main class1
    String color;
    int leg;
    void eat(){
        System.out.println("eat everything");
    }
}
class Cow extends Animal{// inheriting the animal class properties

   void eat(){
       System.out.println("cow eat grass");

   }
}
class Childcow extends Cow{//inheriting the cow class property and indirectly Animal also
    void eat(){
        System.out.println("only drink milk");
    }
}
public class Multilevelinheritance {
    public static void main(String[] args) {
        Childcow c1=new Childcow();
        c1.eat();
        c1.leg=4;
        System.out.println(c1.leg);
    }
}
