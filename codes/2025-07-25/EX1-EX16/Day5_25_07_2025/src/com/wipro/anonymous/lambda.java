package com.wipro.anonymous;

interface Greeter {
    void sayHello(); 
}

public class lambda {
	
	public static void main(String[] args) {

        Greeter helloLambda = () -> {
            System.out.println("Hello Lambda");
        };

        helloLambda.sayHello();
    }

}
