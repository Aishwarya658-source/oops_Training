package Day_1;
import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int a = 0;
        int b = 0;

        while (val != 0) {
            int dig = val % 10;

            if (dig % 2 == 0) {
                b = (b * 10) + dig;
            } else {
                a = (a * 10) + dig;
            }

            val = val / 10;
        }

        System.out.print(a - b);
    }
}