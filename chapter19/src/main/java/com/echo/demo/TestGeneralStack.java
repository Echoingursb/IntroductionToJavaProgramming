package com.echo.demo;

public class TestGeneralStack {
    public static void main(String[] args) {
        GeneralStack<String> stack1 = new GeneralStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println(stack1);
        GeneralStack<Integer> stack2 = new GeneralStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2);
    }
}
