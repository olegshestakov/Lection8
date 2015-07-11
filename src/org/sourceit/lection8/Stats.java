package org.sourceit.lection8;

public class Stats<T extends Number> {

    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        Double[] dnums = {1.1, 1.2, 1.3, 1.4, 1.5};
        Stats<Double> dob = new Stats<>(dnums);

        System.out.println(dob.sameAvg(iob));


    }


}
