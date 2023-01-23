package com.lin.missyou;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Consumer consumer = System.out::println;
        Function<String,Long> stringToLongFunction = Long::valueOf;
        Long count = stringToLongFunction.apply("1");
        consumer.accept(count);
        Function<Long,String> longToStringFunction = String::valueOf;
        String str = longToStringFunction.apply(3L);
        consumer.accept(str);

        consumer.accept(stringToLongFunction.compose(String::valueOf).apply(1L));
    }
}
