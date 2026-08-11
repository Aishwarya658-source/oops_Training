package Day_1;
import java.util.*;
public class swi {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n == 1 || n==2){
        System.out.println("prime");
        return;
       } 
       if(n%2 == 0){
        System.out.println("Not a prime");
        return;
       }
       for(int i = 3;i*i<n;i++){
        if(n%i == 0){
            System.out.println("Not a prime");
            return;
        }
       
       }
        
            System.out.println("Prime");
        
    }
}
