package ru.job4j.calculate;

public class Turn {
    public static void main(String[] args) {
        int[] a = new int[50];

        for(int i=0; i<a.length; ++i){
            if(i == 0){
                a[i] = 1;
            } else {
                a[i] = a[i-1] + 2;
            }
        }

        for(int x: a){
            System.out.print(x+" ");
        }

        System.out.println();

        for(int i=a.length-1; i>=0; --i){
            System.out.print(a[i]+" ");
        }
    }
}
