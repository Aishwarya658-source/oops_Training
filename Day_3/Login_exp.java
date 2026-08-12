package Day_3;

public class Login_exp {
    public static void main(String[] args){
        throws_demo t = new throws_demo();
        try{
            t.divide(23,0);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        System.out.println("hyfluyfl,yfl");
    }
}

class throws_demo{
    void divide(int a,int b)throws RuntimeException{
            System.out.println(a/b);
    }
}
