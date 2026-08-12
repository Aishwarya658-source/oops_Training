package Day_3;

public class Arrex {

    public static void main(String[] args) throws Exception {

        int arr[] = {1, 200, -8, 453, 2, 3, 12412, 12, -273};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 100 && arr[i] > 0) {

                System.out.println("Accepted");

            } else if (arr[i] > 100) {

                throw new RuntimeException("Value is more than 100");

            } else {

                throw new RuntimeException("Number is negative");
            }
        }
    }
}