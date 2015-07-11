package org.sourceit.lection8;

import java.util.ArrayList;
import java.util.List;

public class SuperInh {

    public static void main(String[] args) {
        SimpleContainer<C> container = new SimpleContainer<>(new C[100]);

        container.<B>add();
    }

}

class SimpleContainer<T extends A> {
    T[] ts;
    int length;
    int index;

    public SimpleContainer(T[] ts) {
        this.ts = ts;
        index = 0;
        length = ts.length;
    }

    public<V extends B> void add(V v) {
        if (index == length) {
            return;
        }
        this.ts[index] = (T)v;
        index++;
    }

}

class A {

}

class B extends A {

}

class C extends B {

}

class D extends C {

}
