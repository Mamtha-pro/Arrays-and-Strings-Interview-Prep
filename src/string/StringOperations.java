package string;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        String str1 = sc.next();
        String str2 = sc.next();

        // 1. Sum of lengths
        System.out.println(str1.length() + str2.length());

        // 2. Lexicographical comparison
        if (str1.compareTo(str2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize first letter
        String result1 = Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
        String result2 = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);

        System.out.println(result1 + " " + result2);

        sc.close();
    }
}
