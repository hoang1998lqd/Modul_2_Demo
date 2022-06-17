package Demo_B10_Stack_Queue;

import sun.misc.Queue;

import java.util.Stack;

public class Demo_Stack {
    public static void main(String[] args) throws InterruptedException {
        Linked_Stack<String> stack = new Linked_Stack<>();
        stack.push("Thứ hai");
        stack.push("Thứ ba");
        stack.push("Thứ tư");
        stack.push("Thứ năm");
        stack.push("Thứ sáu");
        stack.push("Thứ bảy");
        stack.push("Thứ chủ nhật");
        System.out.println(stack.size());
//        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println("*************************");

        Stack<String> newStack = new Stack<>();
        newStack.push("Thứ hai");
        newStack.push("Thứ ba");
        newStack.push("Thứ tư");
        newStack.push("Thứ năm");
        newStack.push("Thứ sáu");
        newStack.push("Thứ bảy");
        newStack.push("Thứ chủ nhật");


        System.out.println(newStack);
        System.out.println("*********************");
        Queue<String> queue = new Queue<>();
        queue.enqueue("Thứ hai");
        queue.enqueue("Thứ ba");
        queue.enqueue("Thứ tư");
        queue.enqueue("Thứ năm");
        System.out.println(queue);
        System.out.println("**************************");
        queue.enqueue("Thứ hai");
        queue.enqueue("Thứ ba");
        queue.dequeue();
        queue.enqueue("Thứ năm");
        System.out.println(queue.dequeue());



    }

}
