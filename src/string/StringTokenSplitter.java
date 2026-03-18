package string;

import java.util.*;

public class StringTokenSplitter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();
        String word = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                word += ch;
            } else {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            list.add(word);
        }

        System.out.println(list.size());

        for (String w : list) {
            System.out.println(w);
        }
    }
}
