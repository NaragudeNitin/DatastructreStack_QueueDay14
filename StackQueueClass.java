package stack_queue_package;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueClass {
	public static void stack() {
		Stack<Integer> stack = new Stack<>();

		// UC1=Ability to create a Stack of 56->30->70
		stack.push(56);
		stack.push(30);
		stack.push(70);

		System.out.println("Stack = " + stack);
		System.out.println();

		int peakStack = stack.peek();
		System.out.println("Peeking in stack: " + peakStack + "\n");

		int popStack = stack.pop();
		System.out.println("poping in stack: " + popStack);
	}

	static void queue() {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(56);
		queue.add(30);
		queue.add(70);

		System.out.println("Queue = " + queue);
		System.out.println("Dequeuing using linkedlist operations");
		queue.remove();
		System.out.println(queue);
	}

	public static void main(String[] args) {
		System.out.println("---------------stack solution------------- \n");
		stack();
		System.out.println("---------------queue solution------------- \n");
		queue();
	}
}
