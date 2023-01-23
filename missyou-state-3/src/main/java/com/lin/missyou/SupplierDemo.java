package com.lin.missyou;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Long> supplier = getLong();
        System.out.println(supplier.get());
    }

    private static Supplier<Long> getLong(){
        return System::currentTimeMillis;
    }
}
