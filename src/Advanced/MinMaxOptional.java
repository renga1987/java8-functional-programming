package Advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MinMaxOptional {

    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 1001, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 1002, 20000));

        //Sort by number of students and review score. (More Students with More review score)
        Comparator<Course> compareByCoursesReviewScore = Comparator.comparing(Course::getNoOfStudents).
                thenComparing(Course::getReviewScore).reversed();

        //[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98, Docker:20000:92,
        // Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]
        System.out.println(courses.stream().sorted(compareByCoursesReviewScore).collect(Collectors.toList()));

        //Optional[Microservices:25000:96]\
        //In the above list min just returns the first element. Returns optional
        System.out.println(courses.stream().min(compareByCoursesReviewScore));

        //Optional[FullStack:14000:91]
        //In the above list max just returns the last element. returns optional
        System.out.println(courses.stream().max(compareByCoursesReviewScore));

        Predicate<Course> reviewScoreGreater100Predicate = course -> course.getReviewScore() > 100;

        //min/max returns optional. With optional we can choose to write the else condition with optional
        System.out.println(courses.stream()
                .filter(reviewScoreGreater100Predicate)
                .min(compareByCoursesReviewScore)
                .orElse(new Course("A","B",1,1)));

        //FindFirst returns first element
        System.out.println(courses.stream()
                .filter(reviewScoreGreater100Predicate)
                .findFirst());

        //FindFirst returns any element matching criteria
        System.out.println(courses.stream()
                .filter(reviewScoreGreater100Predicate)
                .findAny());

    }
}
