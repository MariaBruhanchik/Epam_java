package main.java.workWithCollections;

import java.util.Stack;

public class WorkWithStack {
    public static void main(String[] args) {
        int number = 46987;
        int element;
        Stack<Integer> stack = new Stack<>();
        for (; number > 0; number /= 10) {
            element = number % 10;

            stack.push(element);
        }

        System.out.println(stack);

        Stack<Integer> reverseStack = new Stack<>();
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        System.out.println(reverseStack);

        System.out.println(reverseStack.pop().toString() + reverseStack.pop().toString() + reverseStack.pop().toString() + reverseStack.pop().toString() + reverseStack.pop().toString());

    }
}
