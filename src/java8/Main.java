package java8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,3,6,9,12,16,19,20);

        li.stream()
                .filter(n ->n %2==0)
                .forEach(System.out::println);

        li.stream()
                .filter((n)->n%2 !=0)
                .forEach(System.out::println);
    }
}
