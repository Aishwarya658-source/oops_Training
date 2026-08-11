import java.util.*;
public class Inheri {
    public static void main(String[] args){
        Student s = new Student("John",20,101,9);
        System.out.println(s.name+" "+s.age+" "+s.roll+" "+s.cgp);
    }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

}

class Student extends Person{
    int roll;
    int cgp;
    Student(String name,int age,int roll,int cgp){
        super(name,age);
        this.roll = roll;
        this.cgp = cgp;
    }
}
