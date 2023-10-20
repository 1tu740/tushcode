import java.util.*;

public class lnbstrindex {

    public static void main(String[] args) {

        String characters = new String();

        Scanner sc = new Scanner(System.in);
        characters = sc.next();
        System.out.println("the length of string is " + characters.length());

        if (characters.length() > 7) {

            for (int i = 0; i < characters.length(); i += 2) {
                System.out.println(characters.charAt(i));
            }
        }

        else {
            for (int i = 1; i < characters.length(); i += 2) {
                System.out.println(characters.charAt(i));
            }
        }

    }

}