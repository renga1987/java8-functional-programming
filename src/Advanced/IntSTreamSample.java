package Advanced;

import java.util.stream.*;

public class IntSTreamSample {

    public static void main(String[] args) {

        //range do no consider the last value.
        System.out.println(IntStream.range(1,12).sum());

        //Considers last value
        System.out.println(IntStream.rangeClosed(1,12).sum());

        System.out.println(IntStream.iterate(1,e->e+2).limit(10).sum());

        //peek method will allow to look into the stream without changing the stream values
        System.out.println(IntStream.iterate(1,e->e+2).peek(System.out::println).limit(10).sum());

        //print even numbers
        //Good thing is it's dynamic and we are passing an algorithm e->e+2.
        System.out.println(IntStream.iterate(2,e->e+2).peek(System.out::println).limit(10).sum());

        //To convert to a list we must use boxed().
        System.out.println(IntStream.iterate(2,e->e+2).limit(5).boxed().collect(Collectors.toList()));

       // Like Int Stream we have LongStream DoubleStream to play with primitives



    }
}
