package com.lin.missyou;

public class CloneableDemo {
    public static void main(String[] args) {
        Data data = new Data();
        data.setValue(2);
        try {
            System.out.println(data.clone().getValue());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static class Data extends Object implements Cloneable{
        private Integer value;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Data clone() throws CloneNotSupportedException {
            return (Data) super.clone();
        }
    }
}
