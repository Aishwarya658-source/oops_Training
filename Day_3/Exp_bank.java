package Day_3;

public class Exp_bank {
    public static void main(String[] args) {
        Bank b = new Bank(500);
        b.withdraw(300);
        b.withdraw(800);
    }
    
}
class Bank{
    int balance;
    Bank(int balance){
        this.balance = balance;
    }
    void withdraw(int amt){
       if(amt<balance){
        System.out.println("The balance is"+" "+(balance-amt));
       } else{
        throw new Exception("Amount must be lesser than balance");
       }
    }
}
