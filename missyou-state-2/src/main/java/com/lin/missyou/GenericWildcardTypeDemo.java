package com.lin.missyou;

import java.util.*;
import java.util.function.Consumer;

public class GenericWildcardTypeDemo {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        upperBounded(numbers);
    }

    private static void upperForEach(Iterable<? extends Number> iterable, Consumer<Object> consumer) {
        for (Object o : iterable) {
            consumer.accept(o);
        }
    }

    private static void lowerForEach(Iterable<? extends Number> iterable, Consumer<Object> consumer) {
        for (Object o : iterable) {
            consumer.accept(o);
        }
    }

    private static void upperBounded(List<Number> numbers) {
        numbers.add((byte) 1);
        numbers.add((short) 2);
        numbers.add(3);
        numbers.add(4L);
        List<Byte> bytes = Collections.singletonList((byte) 5);
        List<Short> shorts = Collections.singletonList((short) 6);
        List<Integer> integers = Collections.singletonList(7);
        numbers.addAll(bytes);
        numbers.addAll(shorts);
        numbers.addAll(integers);
        upperForEach(numbers, System.out::println);
    }


    private static void lowerBounded(List<? super Number> numbers){

    }
}
