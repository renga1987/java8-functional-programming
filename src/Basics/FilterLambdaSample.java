package Basics;

import com.sun.tools.javac.util.List;

public class FilterLambdaSample {

    public static void main(String[] args) {

        //printEvenNumbers(List.of(23,43,12,65,68));
        //printOddNumbers(List.of(23,43,12,65,68));
        //printCourses(List.of("Spring","Spring Boot","Aws","PCF","Spring Cloud","Docker"));
        //printSpringCourses(List.of("Spring","Spring Boot","Aws","PCF","Spring Cloud","Docker"));
        printCoursesWithAtleast4chars(List.of("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber"));

    }

    private static void printCoursesWithAtleast4chars(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(course -> System.out.println(course));
    }

    private static void printCourses(List<String> courses) {
        courses.stream().forEach(course -> System.out.println(course));
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(course -> System.out.println(course));
    }

    private static void printEvenNumbers(List<Integer> numList) {
        numList.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printOddNumbers(List<Integer> numList) {
        numList.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }

    private static boolean even(Integer num) {
        return num % 2 == 0;
    }

}
