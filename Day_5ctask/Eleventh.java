package Day_5;
import java.util.*;

public class Eleventh {
    static String name = "Marriamman Indian Bank";
    
    public static void main(String[] args){
        Bank_n k = new Bank_n(3001, 6000000, name);
        Bank_n a = new Bank_n(3002, 3668, name);
        Bank_n f = new Bank_n(3003, 3650000, name);
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
}