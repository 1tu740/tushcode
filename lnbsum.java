import java.util.*;

public class lnbsum {

    public static int sum(int numbers[]) {

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            if (numbers[i] >= 9) {

                sum += numbers[i];
            }

        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("sum of the numbers is " + sum(numbers));

    }

}