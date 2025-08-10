package com.wipro.oop;
import com.wipro.oop.Convertor;
public class ConvertrtTest {
	public static void main(String[] args) {
        Convertor converter = new Convertor();
        int result1 = converter.convert(10);
        System.out.println("Result 1 (int): " + result1);

        int result2 = converter.convert(5, 7);
        System.out.println("Result 2 (int, int): " + result2);
        double result3 = converter.convert(12.5);
        System.out.println("Result 3 (double): " + String.format("%.2f", result3));
    }
}
