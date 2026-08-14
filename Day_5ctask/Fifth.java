package Day_5;

public class Fifth {
    public static void main(String[] args) {
        Bank q = new Bank(2001,"AAA","8838269180","Savings",20000);
        q.getName();
        q.getNum();
        q.getbal();
        q.getmob();
        q.gettyp();
    }
}
class Bank{
    private int accNum;
    private String accName;
    private String mob;
    private String accType;
    private double bal;
    Bank(int accNum, String accName, String mob,String accType, int bal){
        this.accNum = accNum;
        this.accName = accName;
        this.mob = mob;
        this.accType= accType;
        this.bal = bal;
    }

    void getNum(){
        System.out.println("Account Number : "+accNum);
    }
    void getName(){
        System.out.println("Account Holder Name : "+accName);
    }
    void getmob(){
        System.out.println("Mobile Number : "+mob);
    }
    void gettyp(){
        System.out.println("Account Type : "+accType);
    }
    void getbal(){
        System.out.println("Account balance : "+bal);
    }

}
