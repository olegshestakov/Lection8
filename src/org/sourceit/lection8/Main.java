package org.sourceit.lection8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Pair<Integer, String> pair = new Pair<Integer, String>(34, "sdsd");
//
//        int t = pair.first;
//        String s = pair.second;
//
//        Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(34, 45);
//
//        int t1 = pair1.first;
//        int t2 = pair1.second;

        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(45);
        list.add(34);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            sum += list.get(i);
        }

        System.out.println(sum);

    }

}

class Pair<T, V> {
    T first;
    V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }
}
