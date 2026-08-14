package Day_5;
import java.util.*;

public class Ninth {
    static String name = "Marriamman Indian Bank";  // ✅ Moved here
    
    public static void main(String[] args){
        Bank_n k = new Bank_n(3001, 6000000, name);
        k.withdraw(100);
        Bank_n a = new Bank_n(3002, 3668, name);
        k.withdraw(-233);
        Bank_n f = new Bank_n(3003, 3650000, name);
        f.withdraw(1000000000);
    }
}

class Bank_n {
    int id;
    int bal;
    String name;
    
    Bank_n(int id, int bal, String name) {
        this.id = id;
        this.bal = bal;
        this.name = name;
        System.out.println("Name : " + name);
        System.out.println("Account Id : " + id);
        System.out.println("Account balance : " + bal);
        System.out.println();  
    }
    void withdraw(int amount){
        if(amount<0){
            System.out.println("Invalid amount");
        }
        else if(amount>bal){
            System.out.println("Insufficient amount");
        }else{
        bal-=amount;
            System.out.println("The updated amount is "+bal);
        }
        System.out.println();

    }
    
}