package com.wipro.anonymous;

import java.util.function.Function;
import java.math.BigDecimal;

public class functionTest {
	public static void main(String[] args) {

        Function<Double, BigDecimal> getFractionalPart = num -> {
            BigDecimal bdNum = new BigDecimal(num.toString());
            
            BigDecimal fractionalPart = bdNum.remainder(BigDecimal.ONE);
            
            return fractionalPart.abs();
        };

        double number1 = 12.4578;
        

        System.out.println(getFractionalPart.apply(number1));
	}

	
}
