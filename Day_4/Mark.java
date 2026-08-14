package Day_4;
import java.util.*;
public class Mark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
           arr[i] = sc.nextInt(); 
        }
        System.out.println(s.avg(arr));
    }
    
}

class InvalidMarkException extends RuntimeException{
    public InvalidMarkException(String error){
        super(error);
    }
}
class InsufficientMarkException extends RuntimeException{
    public InsufficientMarkException(String error){
        super(error);
    }
}
class Student{
    int avg(int[] arr) throws RuntimeException{
        int count = 0;
        for(int i = 0;i<5;i++){
            if(arr[i]>100){
                throw new InvalidMarkException("Mark is greater than 100");
            }else if(arr[i]<0){
                throw new InsufficientMarkException("Mark is less than 0");
            }else{
                count+=arr[i];
            }
        }
        return count/5;
    }
}
