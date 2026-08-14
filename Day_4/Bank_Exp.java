package Day_4;
class InvalidBalanceAccount extends Exception{
    public InvalidBalanceAccount(String error){
        super(error);
    }
}

class BankAccount{
    void withdrawal(int bal,int with) throws InvalidBalanceAccount{
        if(with<bal){
            System.out.println(bal-with);
        }else{
            throw new InvalidBalanceAccount("Balance is not enough");
        }
    }
}

public class Bank_Exp {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        try{
            b.withdrawal(200,300);
        }catch(InvalidBalanceAccount e){
            System.out.println(e);
        }
        
        System.out.println("End of program");
    }
    
}
