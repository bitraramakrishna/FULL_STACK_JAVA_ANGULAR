package com.wipro.stream;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
        Optional<Integer> optval = Optional.of(123);
        
       // Optional<Integer> opwv = Optional.empty();

       
        optval.ifPresent(value -> System.out.println("Value is present: " + value));

        
       // opwv.ifPresent(value -> System.out.println("Value is present: " + value));

       /* Integer valueFromPresent = optionalWithValue.orElse(0);
        System.out.println("Value from optionalWithValue " + valueFromPresent);

        Integer valueFromAbsent = opwv.orElse(999);
        System.out.println("Value from opwv : " + valueFromAbsent);*/
    }

}
