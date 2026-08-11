package Day_1;
import java.util.*;
public class valid_date{
    
    public static void main(String[] args){
       Scanner c = new Scanner(System.in);
        int date = c.nextInt();
        int month = c.nextInt();
        int year = c.nextInt();
        if(year>9999 || year<999 || month >12){
            System.out.print("Invalid");
            return;
        }
        
         if(month == 2 && isleap(year) && date<=29){
                System.out.print("valid");
            }else if(month == 2 && !isleap(year) && date<=28){
                System.out.print("valid");
            }
       

        else if((month==4 || month ==6|| month == 9|| month == 11) && date<=30){
            System.out.print("Valid");
        }else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) && date<=31){
            System.out.print("Valid");
        }else{
            System.out.print("invalid");
        }

    }
    public static boolean isleap(int a){
         if(a%400 ==0){
        return true;
       }else if(a%100==0){
        return false;
       }else if(a%4==0){
        return true;
       }else{
        return false;
       }
    }
}