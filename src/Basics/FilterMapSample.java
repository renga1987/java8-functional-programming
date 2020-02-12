package Basics;

import com.sun.tools.javac.util.List;

public class FilterMapSample {

    public static void main(String[] args) {
        //printSquareNumbers(List.of(23, 43, 12, 65, 68));
        //printCubeOfOddNumbers(List.of(23, 43, 12, 65, 68));
        printNumofCharsInCourses(List.of("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber"));
    }

    private static void printNumofCharsInCourses(List<String> courses) {
        courses.stream()
               .map(course -> course.length())
               .forEach(System.out::println);
    }

    private static void printCubeOfOddNumbers(List<Integer> numList) {
        numList.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * num * num)
                .forEach(System.out::println);
    }

    private static void printSquareNumbers(List<Integer> numList) {
        numList.stream()
                .map(num -> num * num)
                .forEach(System.out::println);
    }
}
