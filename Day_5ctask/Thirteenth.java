package Day_5;
import java.util.*;

public class Thirteenth {
    public static void main(String[] args){
        // Account 1
        System.out.println("========== ACCOUNT 1 ==========");
        Bank_n k = new Bank_n(3001, "Aishwarya", "9876543210", "Savings", 6000000);
        k.displayAccountDetails();
        k.deposit(5000);
        System.out.println("Current Balance: Rs." + k.getBalance());
        k.withdraw(3000);
        System.out.println("Current Balance: Rs." + k.getBalance());
        k.setMobileNumber("9999999999");
        System.out.println("Updated Mobile Number: " + k.getMobileNumber());
        k.deposit(-500);
        k.withdraw(-1000);
        k.withdraw(10000000);
        
        System.out.println("\n========== ACCOUNT 2 ==========");
  
        Bank_n a = new Bank_n(3002, "Priya", "8765432109", "Current", 3668);
        a.displayAccountDetails();
        a.deposit(10000);
        a.withdraw(5000);
        a.displayAccountDetails();
    }
}

class Bank_n {

    static String bankName = "Marriamman Indian Bank";
    
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    
    Bank_n(int accountNumber, String accountHolderName, String mobileNumber, 
           String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
  
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public String getMobileNumber() {
        return mobileNumber;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber != null && mobileNumber.length() == 10) {
            System.out.println("Mobile number updated from " + this.mobileNumber + " to " + mobileNumber);
            this.mobileNumber = mobileNumber;
        } else {
            System.out.println("Invalid mobile number! Must be 10 digits.");
        }
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount! Amount must be positive. Rs." + amount + " rejected.");
            return;
        }
        balance += amount;
        System.out.println("Deposited Rs." + amount + " successfully.");
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount! Amount must be positive. Rs." + amount + " rejected.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw Rs." + amount + 
                             ". Available balance: Rs." + balance);
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn Rs." + amount + " successfully.");
    }
    
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
        System.out.println("-----------------------------");
    }
}