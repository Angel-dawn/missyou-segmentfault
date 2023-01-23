package com.lin.missyou;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer consumer = System.out::println;
        consumer.accept("hello 若晨曦");
        Consumer<String> stringConsumer = ConsumerDemo::echo;
        stringConsumer.andThen(consumer).accept("hello 素衣绾绾");
    }

    private static void echo(String message) {
        System.out.println("echo" + message);
    }


}
