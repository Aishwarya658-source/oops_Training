package Day_1;
import java.util.Scanner;

public class swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int b = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]%10 !=0){
                int temp = arr[i];
                arr[i] = arr[b];
                arr[b] = temp;
                b++;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }

    } 
}
