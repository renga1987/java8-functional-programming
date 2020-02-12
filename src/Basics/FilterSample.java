package Basics;

import com.sun.tools.javac.util.List;

public class FilterSample {

    public static void main(String[] args) {
        printEvenNumbers(List.of(23,43,12,65,68));
    }

    private static void printEvenNumbers(List<Integer> numList) {
        numList.stream()
                .filter(FilterSample::even)
                .forEach(System.out::println);
    }

    private static boolean even(Integer num) {
        return num%2==0;
    }

}
