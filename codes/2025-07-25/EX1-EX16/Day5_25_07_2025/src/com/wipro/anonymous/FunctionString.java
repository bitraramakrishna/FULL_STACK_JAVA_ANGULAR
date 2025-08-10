package com.wipro.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionString {
	public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList("Ramakrishna","hello", "WORLD");

        Function<String, Integer> strLe = s -> s.length();

        List<Integer> lengths = new ArrayList<>();
        for (String s : inputStrings) 
        {
            lengths.add(strLe.apply(s));
        }

        System.out.println("Lengths: " + lengths);
    }

}
