package ru.job4j.calculate.arrays;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int array[]={5,4,6,9,11,8};
        int a=Integer.MAX_VALUE;

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
            //System.out.println(Arrays.copyOf(array, 4));
            System.out.println(array);
        }

        int b[] = {17,4,85};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
