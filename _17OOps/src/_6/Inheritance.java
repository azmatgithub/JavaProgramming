package _6;
public class Inheritance {
    public static void main(String[] args) {
   Dog dog1=new Dog();
   dog1.eat();
    }
}
class Animal{
    String color;
    int legs;
    void eat(){
        System.out.println("eat all things");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eat meat");
    }
}