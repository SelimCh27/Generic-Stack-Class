public class Stack<T> {
    /**
     * Array that stores the stack elements (runtime polymorphism)
     */
    private Object[] elements;

    /**
     * Index of the top element
     */
    private int top;

    /**
     * Default constructor that creates a stack
     * with a capacity of 10 elements.
     */
    public Stack() {
        this.elements = new Object[10];
        this.top = -1;
    }

    /**
     * Constructor that creates a stack with a given array.
     * @param elements the array used to store stack elements
     */
    public Stack(Object[] elements) {
        this.elements = elements;
        this.top = -1;
    }

    /**
     * Pushes an element onto the stack.
     * @param value the element to be pushed
     * @throws StackFullException if the stack is full
     */
    public void push(T value) throws StackFullException {
        if (top == elements.length - 1) {
            throw new StackFullException("Stack is full.");
        }
        elements[++top] = value;
    }

    /**
     * Removes and returns the top element of the stack.
     * @return the top element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty.");
        }
        return (T) elements[top--];
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return the top element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty.");
        }
        return (T) elements[top];
    }

    /**
     * Returns a string containing all elements of the stack separated by a semicolon.
     * @return a string representation of the stack
     */
    public String list() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            result.append(elements[i]);
            if (i < top) {
                result.append(";");
            }
        }
        return result.toString();
    }
}
