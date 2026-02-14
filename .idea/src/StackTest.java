public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<>();

        try {
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            // Display stack content
            System.out.println("Number stack: " + numberStack.list());

            // Peek top element
            System.out.println("Peek: " + numberStack.peek());

            // Pop elements
            System.out.println("Pop: " + numberStack.pop());
            System.out.println("After pop: " + numberStack.list());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        Stack<String> textStack = new Stack<>();

        try {
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Generics");

            System.out.println("Text stack: " + textStack.list());

            System.out.println("Pop: " + textStack.pop()); //delete
            System.out.println("Pop: " + textStack.pop());
            System.out.println("Pop: " + textStack.pop());

            textStack.pop(); //exception

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}