package Day_3;

public class Bank_poly {
    public static void main(String[] args){
        Savings s = new Savings();
        s.calculation(20000);
        s.deposit(45,"Amount",1001);
        Current c = new Current();
        c.calculation(28300);
    }
}
class BankAccount{
    void deposit(int amt){
        System.out.println(amt);
    }
    void deposit(int amt, String description){
        System.out.println(amt+" "+description);
    }
    void deposit(int amt, String description,int id){
        System.out.println(amt+" "+description+" "+id);
    }
    void calculation(int amt){
        System.out.println(amt*0.02);
    }
}
class Savings extends BankAccount{
    void calculation(int amt){
        System.out.println(amt*0.06);
    }
}
class Current extends BankAccount{
    void calculation(int amt){
        System.out.println(amt*0.04);
    }
}
