package Day_1;
public class Emp {
    public static void main(String[] args){
        Employee[] list = new Employee[3];
        Employee e1 = new Employee(1001,"AAA",113132.3);
        list[0] = e1;
        Employee e2 = new Employee(1002,"BBB",123241.3);
        list[1] = e2;
        Employee e3 = new Employee(1003,"CCC",1453.3);
        list[2] = e3;
    }
}
class Employee{
    int emp_id;
    String name;
    double salary;
    
    void addr(){
        System.out.println("Address");
    }
    Employee(int emp_id,String name,double salary){
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

}
