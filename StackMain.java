interface StackADT {
    void push(int item) throws Exception; 
    int pop() throws Exception;          
    int peek() throws Exception;          
    boolean isEmpty();                   
    boolean isFull();                     
}


class StackArray implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Overflow: Cannot push " + item + ", stack is full.");
        }
        stack[++top] = item;
    }

    // Pop operation
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow: Cannot pop from an empty stack.");
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty: Cannot peek.");
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}


public class StackMain {
    public static void main(String[] args) {
        try {
            StackArray stack = new StackArray(5);

            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Top element: " + stack.peek());
            
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
            
            // Trying to pop from an empty stack (exception case)
            System.out.println("Popped element: " + stack.pop());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
