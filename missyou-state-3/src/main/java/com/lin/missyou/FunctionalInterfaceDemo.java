package com.lin.missyou;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        FunctionalInterfaceWithAnnotation annotation = () -> System.out.println("FunctionalInterfaceWithAnnotation");
        FunctionalInterfaceWithoutAnnotation withoutAnnotation = () -> System.out.println("FunctionalInterfaceWithoutAnnotation");
    }

    @FunctionalInterface
    public interface FunctionalInterfaceWithAnnotation{
        void execute();
    }

    @FunctionalInterface
    public interface FunctionalInterfaceWithoutAnnotation{
        void execute();
    }

}
