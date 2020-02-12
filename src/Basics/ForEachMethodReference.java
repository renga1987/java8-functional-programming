package Basics;

import com.sun.tools.javac.util.List;

public class ForEachMethodReference {

    public static void main(String[] args) {
        printNumbers(List.of(23,43,12,65,68));
    }

    private static void printNumbers(List<Integer> numList) {
        numList.stream().forEach(ForEachMethodReference::print);
    }

    private static void print(Integer num) {
        System.out.println(num);
    }
}
