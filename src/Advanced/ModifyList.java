package Advanced;

import com.sun.tools.javac.util.*;

import java.util.*;
import java.util.List;

public class ModifyList {

    public static void main(String[] args) {

        List<String> courseList = Arrays.asList("Spring", "Spring Boot", "Aws", "PCF", "Spring Cloud", "Docker", "kube", "kuber");

        courseList.replaceAll(String::toUpperCase);
        System.out.println(courseList);

        ArrayList<String> courseList2 = new ArrayList<>(courseList);
        courseList2.removeIf(str->str.length()>5);
        System.out.println(courseList2);
    }
}
