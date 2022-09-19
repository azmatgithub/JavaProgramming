package _2;
//access modicfierss in java
class BankAccount{
    public String name;//accessible every where
    protected String DOB;//class packages and subclasses of this class
    int balance;//whit in class and packages
    private String password;//cannot accessible outside the class at any where

}
public class Acessmodifiers {
    public static void main(String[] args) {
      BankAccount B1=new BankAccount();
     B1.balance=20;
     B1.DOB="26-08-1998";
     B1.name="AZMAT ABDULLAH";
     //B1.password=12345; //error becuase this not accessible outside the class
    }
}
