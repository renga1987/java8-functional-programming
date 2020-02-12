package Advanced;


import java.util.*;
import java.util.stream.*;

public class FlatMapSample {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber");

        //Combine all of them to one separated by a comma
        String str = courses.stream().collect(Collectors.joining(","));
        System.out.println(str);

        //Scenario: Look into the characters in each string
        System.out.println("Spring".split(""));

        List<String[]> collect = courses.stream().map(course -> course.split("")).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect1.size());
    }
}
