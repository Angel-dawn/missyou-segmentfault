package com.lin.missyou;

import java.beans.PropertyChangeListener;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo {


    @FunctionalInterface
    public interface Action{
        void execute();

        default void doExecute(){
            execute();
        }
    }

    public static void main(String[] args) {
        stream();
        Action action = ()->{

        };
    }

    private static void stream(){
        String str = Stream.of(1, 2, 3, 4, 5, 6).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(str);
    }

    private static void supplierDemo(){
        Supplier<String> supplier = ()-> "hello world";
    }

    private static void consumerDemo(){
        PropertyChangeListener listener = System.out::println;
    }

    private static void functionDemo(){

    }
}
