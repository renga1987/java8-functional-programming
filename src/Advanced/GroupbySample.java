package Advanced;

import java.util.*;
import java.util.stream.*;

public class GroupbySample {

    public static void main(String[] args) {

        List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        //GroupBy Category
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));

        //Count the courses by category
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));

        //In each category return the course with highest review
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
                Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        //In each category return the course names alone; not the complete objects
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
                Collectors.mapping(Course::getName,Collectors.toList()))));


    }
}
