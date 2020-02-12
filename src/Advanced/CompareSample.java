package Advanced;

import java.util.*;
import java.util.stream.*;

public class CompareSample {

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

        Comparator<Course> compareByCoursesIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
        List<Course> coursesListIncreaeOrder = courses.stream().sorted(compareByCoursesIncreasing).collect(Collectors.toList());
        System.out.println(coursesListIncreaeOrder);

        Comparator<Course> compareByCoursesDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
        List<Course> coursesListDecreaseOrder = courses.stream().sorted(compareByCoursesDecreasing).collect(Collectors.toList());
        System.out.println(coursesListDecreaseOrder);

        //Sort by number of students and review score. (More Students with More review score)
        Comparator<Course> compareByCoursesReviewScore = Comparator.comparing(Course::getNoOfStudents).
                thenComparing(Course::getReviewScore).reversed();
        List<Course> coursesListReviewOrder = courses.stream().sorted(compareByCoursesReviewScore).collect(Collectors.toList());
        System.out.println(coursesListReviewOrder);


    }
}
