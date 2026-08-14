import java.util.*;

public class ArraySeg {

    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Get input until -1
        while (true) {

            int a = sc.nextInt();

            if (a == -1) {
                break;
            }

            li.add(a);
        }

        int n = li.size();
        int s;
        int c;

        // Move numbers not ending with 0 to the front
        for (s = 0, c = 0; s < n; s++) {

            if (li.get(s) % 10 != 0) {

                int temp = li.get(s);

                // Shift elements to the right
                for (int i = s; i > c; i--) {
                    li.set(i, li.get(i - 1));
                }

                // Put the selected element at position c
                li.set(c, temp);

                c++;
            }
        }

        System.out.println(li);
    }
}