package com.lin.missyou;

public class GenericType {


    public static interface Converter<S,T> {
        T convert(S source);
    }

    public static void main(String[] args) {

    }

}
