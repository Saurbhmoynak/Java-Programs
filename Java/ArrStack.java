class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to print the stack elements
    public void printStack() {
        while (!isEmpty()) {
            int value = stackArray[top--];
            System.out.println(value);
        }
    }
}

public class ArrStack {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Print the stack
        stack.printStack();
        
        // Uncomment below lines to demonstrate pop functionality
        // System.out.println("Popped element: " + stack.pop());
        // System.out.println("Popped element: " + stack.pop());
        // System.out.println("Popped element: " + stack.pop());
    }
}

