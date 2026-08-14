package Day_5;
import java.util.*;

public class Twelfth {
    static String name = "Marriamman Indian Bank";
    static String branch = "Main Branch";
    
    public static void main(String[] args){
        // Account 1
        System.out.println("========== ACCOUNT 1 ==========");
        Bank_n k = new Bank_n(3001, 6000000, name, "9876543210");
        k.deposit(5000);
        k.displayBalance();
        k.withdraw(3000);
        k.displayBalance();
        k.changeMobile("9999999999");
        k.displayMobile();
        k.deposit(-500);
        k.withdraw(-1000);
        k.withdraw(10000000);
        
        System.out.println("\n========== ACCOUNT 2 ==========");
  
        Bank_n a = new Bank_n(3002, 3668, name, "8765432109");
        
        a.deposit(10000);
        a.withdraw(5000);
        a.displayAccountDetails();
    }
}

class Bank_n {
    int id;
    int bal;
    String name;
    String mobileNo;
    
    Bank_n(int id, int bal, String name, String mobileNo) {
        this.id = id;
        this.bal = bal;
        this.name = name;
        this.mobileNo = mobileNo;
        displayAccountDetails();
    }
    
    void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount! Cannot deposit negative amount: Rs." + amount);
            return;
        }
        bal += amount;
        System.out.println("Deposited Rs." + amount + " successfully.");
    }
    
    void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount! Cannot withdraw negative amount: Rs." + amount);
            return;
        }
        if (amount > bal) {
            System.out.println("Insufficient balance! Cannot withdraw Rs." + amount + ". Available balance: Rs." + bal);
            return;
        }
        bal -= amount;
        System.out.println("Withdrawn Rs." + amount + " successfully.");
    }
    
    void displayBalance() {
        System.out.println("Current Balance: Rs." + bal);
    }
    
    void changeMobile(String newMobile) {
        System.out.println("Mobile number changed from " + mobileNo + " to " + newMobile);
        this.mobileNo = newMobile;
    }
    
    void displayMobile() {
        System.out.println("Current Mobile Number: " + mobileNo);
    }
    
    void displayAccountDetails() {
        System.out.println("Bank Name: " + name);
        System.out.println("Account ID: " + id);
        System.out.println("Account Balance: Rs." + bal);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("-----------------------------");
    }
}