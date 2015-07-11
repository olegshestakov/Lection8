package org.sourceit.lection8;

public class Box<T> {

    T obj;

    public void setT(T t) {
        this.obj = t;
    }

    public static void main(String[] args) {

        Box<Integer> box = new Box<>();

        box.setT(34);

        Box rawBox = new Box();

        rawBox.setT(new Integer(2));

        String s = (String)rawBox.obj;


    }

}
