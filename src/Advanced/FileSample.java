package Advanced;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class FileSample {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("test"));
        lines.forEach(System.out::println);
        System.out.println("*********************Distinct**************");
        //Take the Distinct words from the file
        Files.lines(Paths.get("test"))
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
        System.out.println("*********************List all files in that dir**************");
        Files.list(Paths.get("."))
                .forEach(System.out::println);
        System.out.println("*********************List all directories **************");
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);



    }
}
