package stack_queue_package;

import java.util.Stack;

public class StackQueueClass {
	public static void stack() {
        Stack<Integer> stack = new Stack<>();

        //UC1=Ability to create a Stack of 56->30->70
        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Stack = " +stack);
        System.out.println();
    }
	public static void main(String[] args) {
		stack();
	}
}
