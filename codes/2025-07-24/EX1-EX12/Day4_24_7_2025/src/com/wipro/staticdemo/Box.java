package com.wipro.staticdemo;

public class Box <T>{
	private T content;

    public void addContent(T obj) {
        this.content = obj;
    }

    public T getContent() {
        return this.content;
    }

    public static void main(String[] args) {
        
        Box<Integer> intBox = new Box<>();
        intBox.addContent(10);
        System.out.println("Integer Box Content: " + intBox.getContent());

      
        Box<String> stringBox = new Box<>();
        stringBox.addContent("Hello");
        System.out.println("String Box Content: " + stringBox.getContent());
    }
}
