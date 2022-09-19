package _5;
class Student{
    String name;
    int roll;
    Student(){//non parameterized constructors
        System.out.println("called constructors");
    }
    Student (int roll){//paparameterized constructor
        System.out.println(roll);
    }
    Student(Student s1){//copy constructor
        System.out.println("constructor is copy of s1");
    }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student();//calling non parameterized constructors
        Student s2=new Student(23);//calling parameterized constructor
        Student s3= new Student(s1);//calling copy constructor
    }
}
