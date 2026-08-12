package Day_3;

public class Exception {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        try{
            int a = 10;
            String b = "kgyj,uy,fyhj";
            
            System.out.println(a/10);
            System.out.println(b.length());
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception"+" "+e);
        }
        catch(NullPointerException e){
            System.out.println("Nullpointer exception"+" "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound"+" "+e);
        }
    }
    
}
