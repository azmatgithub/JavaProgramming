package _3;
class BankAccount {
    public String name;//accessible every where
    protected String DOB;//class packages and subclasses of this class
    int balance;//whit in class and packages
    private String password="12345";//cannot accessible outside the class at any where
    public String getPassword(){//get the password value
       return password;
    }
    String setPassword(String s){//set or change the password value
        return password=s;
    }
}
public class getANDset {
    public static void main(String[] args) {
        BankAccount B1=new BankAccount();
        B1.balance=20;
        B1.DOB="26-08-1998";
        B1.name="AZMAT ABDULLAH";
        System.out.println(B1.name);
        System.out.println(B1.setPassword("AZMAT"));

    }


}

