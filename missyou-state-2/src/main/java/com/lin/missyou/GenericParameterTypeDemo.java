package com.lin.missyou;

public class GenericParameterTypeDemo {
    public static void main(String[] args) {
        Container<StringBuffer> container = new Container("hello world");
        System.out.println(container.getElement());
    }


    public static class Container<E extends CharSequence> {
        private E element;

        public Container(E element) {
            this.element = element;
        }

        public boolean add(E element){
            this.element = element;
            return true;
        }

        public E getElement() {
            return element;
        }
    }
}
