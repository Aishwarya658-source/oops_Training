package Day_5;

public class Third {
    public static void main(String[] args) {
        Bank q = new Bank();
        q.setName("AAA");
        q.setNum(1001);
        q.setbal(2000000);
        q.setmob("8828671872");
        q.settyp("Savings");
        q.getval();
    }
}
class Bank{
    private int accNum;
    private String accName;
    private String mob;
    private String accType;
    private double bal;

    void setNum(int accNum){
        this.accNum = accNum;
    }
    void setName(String accName){
        this.accName = accName;
    }
    void setmob(String  mob){
        this.mob = mob;
    }
    void settyp(String  accType){
        this.accType = accType;
    }
    void setbal(double bal){
        this.bal = bal;
    }
    void getval(){
        System.out.println("Account Number : "+accNum);
        System.out.println("Account Name : "+accName);
        System.out.println("Mobile Number : "+mob);
        System.out.println("Account type : "+accType);
        System.out.println("Account Balance : "+bal);
    }

}
