import java.util.*;

public class lnblist {

    public static void main(String[] args) {

        int l1[] = { 11, 21, 24, 12, 18 };
        int l2[] = { 14, 44, 25, 37, 13 };

        for (int i = 0; i < l1.length; i += 2) {

            System.out.println(l1[i]);
        }

        for (int i = 1; i < l2.length; i += 2) {

            System.out.println(l1[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < l1.length; i++) {
            if (l1[i] % 2 == 0) {
                list.add(l1[i]);

            }

            for (int j = 0; j < l2.length; j++) {
                if (l2[j] % 2 != 0) {
                    list.add(l2[j]);
                }
            }

            System.out.println("{" + l1 + l2 + "}");
        }
    }
}
