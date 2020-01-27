package Samples;

import com.sun.tools.javac.util.List;

import java.util.Comparator;
import java.util.function.Consumer;

public class ComparatorSortSample {

    public static void main(String[] args) {
        //sortCourses(List.of("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber"));
        //sortCoursesReverse(List.of("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "Kube", "Kuber"));
        sortCoursesUsingLength(List.of("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "Kube", "Kuber"));
    }


    //All these operations can be applied on numbers too
    private static void sortCoursesUsingLength(List<String> courses) {
        Consumer<String> println = System.out::println;
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(println);
    }

    private static void sortCoursesReverse(List<String> courses) {
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void sortCourses(List<String> courses) {
        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }


}
