package Basics;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorSample {

    public static void main(String[] args) {
        //java.util.List<Integer> integerList = doubleList(List.of(8, 1, 2, 3, 4));
        //List<Integer> integerList = evenNumberList(Arrays.asList(1, 2, 4, 6, 7, 9, 16));
        List<Integer> integerList = listWithLengthOfCourses(Arrays.asList("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber"));
        System.out.println(integerList);
    }

    private static List<Integer> listWithLengthOfCourses(List<String> asList) {
        return asList.stream().map(String::length).collect(Collectors.toList());
    }

    private static java.util.List<Integer> evenNumberList(List<Integer> num) {
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        return num.stream().filter(integerPredicate).collect(Collectors.toList());
    }

    private static java.util.List<Integer> doubleList(List<Integer> num) {
        Function<Integer, Integer> integerFunction = num1 -> num1 * num1;
        return num.stream().map(integerFunction).collect(Collectors.toList());
    }

}
