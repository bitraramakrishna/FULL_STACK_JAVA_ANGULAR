package com.wipro.collection;

import java.util.ArrayList;

public class ArrayListdemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println( numbers);

        numbers.remove(2);

        System.out.println( numbers);

        numbers.add(60);

        System.out.println( numbers);
    }
}
