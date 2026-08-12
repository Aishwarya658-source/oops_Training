package Day_3;

public class Employee1 {
    public static void main(String[] args){
       FullStack f = new FullStack(); 
       f.getName("John");
       f.getSalary(200000);
       f.bonus_call();

        Mern_stack m = new Mern_stack(); 
       m.getName("Jane");
       m.getSalary(250000);
       m.bonus_call();

        Manager mg = new Manager(); 
       mg.getName("Alice");
       mg.getSalary(300000);
       mg.bonus_call();
    }
}

abstract class Employee{
    private String name;
    private int salary;

    public void getName(String name){
        this.name = name;
    }
    public String setName(){
        return name;
    }
    public void getSalary(int salary){
        this.salary = salary;
    }
    public int setSalary(){
        return salary;
    }
 
 abstract void bonus_call(); 
}

abstract class Developer extends Employee{

}
class FullStack extends Developer{
    @Override
    void bonus_call(){
        System.out.println(setName()+" "+(setSalary()+1000));
    }
}
class Mern_stack extends Developer{
    @Override
    void bonus_call(){
        System.out.println(setName()+" "+(setSalary()+2000));
    }
}
class Manager extends Employee{
    @Override
    void bonus_call(){
        System.out.println(setName()+" "+(setSalary()+3000));
    }
}


