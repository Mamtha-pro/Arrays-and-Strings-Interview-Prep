package string;

import java.util.*;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        // convert to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // convert to char array
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        // sort both
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
