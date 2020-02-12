package Basics;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceSample {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber");

        courses.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
