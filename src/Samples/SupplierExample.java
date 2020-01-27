package Samples;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> supplier1 = ()-> 4;
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = ()-> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(supplier2.get());

        //Unary Opearator
        UnaryOperator<Integer> u1 = (x)->{
            return x*x;
        };
        System.out.println("Unary:"+u1.apply(5));
    }
}
