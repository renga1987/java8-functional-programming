package Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CustomClass {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        Predicate<Course> reviewScoreGreater90Predicate = course -> course.getReviewScore() > 90;

        Predicate<Course> reviewScoreGreater100Predicate = course -> course.getReviewScore() > 100;


        System.out.println(courses.stream().allMatch(reviewScoreGreater90Predicate));

        System.out.println(courses.stream().noneMatch(reviewScoreGreater100Predicate));

        System.out.println(courses.stream().anyMatch(reviewScoreGreater100Predicate));



    }
}
