class Abstract1{
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.sleep();
    }
}

abstract class Person{
    void eat(){
        System.out.println("Person is eating");
    }
    abstract void sleep();
}
class Student extends Person{
    void sleep(){
        System.out.println("Student is sleeping");
    }
}