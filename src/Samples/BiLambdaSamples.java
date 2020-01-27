package Samples;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiLambdaSamples {

    public static void main(String[] args) {

        //Takes 2 input and do the test. Returns Boolean
        BiPredicate<Integer,String> biPredicate = (number,str)->{
            return number<10 && str.length()>5;
        };
        System.out.println(biPredicate.test(3,"Renga"));

        //Takes 2 input and returns an output of any type.
       BiFunction<Integer,String,Boolean> biFunction = (number,str)->{
            return number<10 && str.length()>5;
        };
        System.out.println(biFunction.apply(2,"kkk"));

        //Takes 2 input and returns nothing.
        BiConsumer<Integer,String> biConsumer = (s1,s2)->{
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept(12,"10");
    }
}
