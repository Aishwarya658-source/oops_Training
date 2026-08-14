package Day_5;
class Account{
    int acNum;
    String acName;
    long Mobile;
    String accTy;
    int bal;
    Account(int acNum, String acName, long Mobile,String accTy, int bal){
        this.acNum = acNum;
        this.acName = acName;
        this.Mobile = Mobile;
        this.accTy = accTy;
        this.bal = bal;
    }
    void Display(){
        System.out.println("Account Number : "+acNum);
        System.out.println("Account holder Name  : "+acName);
        System.out.println("Mobile Number : "+Mobile);
        System.out.println("Account type : "+accTy);
        System.out.println("Account Balance : "+bal);
        System.out.println();
    }
}

public class Tenth{
    public static void main(String[] args) {
        Account a = new Account(2001,"AAA",68734698343l,"Savings",2000000);
        Account w = new Account(2002,"BBB",68783848893L,"Current", 2000);
        Account d = new Account(2003,"CCC",89854698343L,"Savings",20000);
        a.Display();
        w.Display();
        d.Display();
    }
    
}
