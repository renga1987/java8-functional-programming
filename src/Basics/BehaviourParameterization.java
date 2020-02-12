package Basics;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class BehaviourParameterization {

    public static void main(String[] args) {
        //Predicate<Integer> evenPredicate = num->num%2==0;
        //printEvenNumbers(Arrays.asList(23, 43, 12, 65, 68),evenPredicate);
        printSquareNumbers(Arrays.asList(23, 43, 12, 65, 68),num->num * num);
        printEvenNumbers(Arrays.asList(23, 43, 12, 65, 68),num->num%2==0);

    }

    private static void printSquareNumbers(List<Integer> numList,Function<Integer, Integer> sumFunction) {
        numList.stream()
                .map(sumFunction)
                .forEach(System.out::println);
    }

    private static void printEvenNumbers(List<Integer> numList,Predicate<Integer> predicate) {
        numList.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
