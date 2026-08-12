import java.util.*;

public class Encapsulation {
    public static void main(String[] args) {

        me person = new me("Aishwarya", 19, 50000);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());

        person.setSalary(60000);

        System.out.println("Updated Salary: " + person.getSalary());
    }
}

class me {

    private String name;
    private int age;
    private int salary;

    me(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}