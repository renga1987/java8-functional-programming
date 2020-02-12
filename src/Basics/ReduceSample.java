package Basics;

import com.sun.tools.javac.util.List;

import java.util.function.BinaryOperator;

public class ReduceSample {

    public static void main(String[] args) {

        int sum =0;
        //sum = addNumbers(List.of(2,3,6,7,8,912,14));
        //sum = squareNumbersAndFindSum(List.of(2,3,4));
        //sum = cubeNumbersAndFindSum(List.of(2,3,4));
        sum = findOddNumbersAndFindSum(List.of(2,3,5));
        System.out.println("Sum of numbers:"+sum);
    }

    private static int findOddNumbersAndFindSum(List<Integer> num) {
        BinaryOperator<Integer> sum = Integer::sum;

        BinaryOperator<Integer> sum1 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x+y;
            }
        };

        return num.stream().filter(num1 -> num1%2!=0).reduce(0, sum1);
    }

    private static int squareNumbersAndFindSum(List<Integer> num) {
        return num.stream().map(x -> x*x).reduce(0,Integer::sum);
    }

    private static int cubeNumbersAndFindSum(List<Integer> num) {
        return num.stream().map(x -> x*x*x).reduce(0,Integer::sum);
    }

    private static int addNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,ReduceSample::sum);
                //.reduce(0,(num1,num2)->num1+num2);
                //.reduce(0,Integer::sum);
    }
    private static Integer sum(Integer aggregate, Integer element) {
        System.out.println(aggregate + " " + element);
        return aggregate+element;

        /*
            0 2
            2 3
            5 6
            11 7
            18 8
            26 912
            938 14*/
    }
}
