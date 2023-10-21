import java.util.*;

public class lnbcal {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int multiply = a * b;

        System.out.println("multiply is " + multiply);

        if (multiply > 500) {

            int sum = a + b;

            System.out.println("the multiply is greater than 500 so the sum is " + sum);
        }

        else {
            System.out.println("Hello  tushar LNB code is running fine !!");
        }

    }
}
