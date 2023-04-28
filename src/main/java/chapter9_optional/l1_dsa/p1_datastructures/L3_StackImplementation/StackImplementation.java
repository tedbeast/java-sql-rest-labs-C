package chapter9_optional.l1_dsa.p1_datastructures.L3_StackImplementation;

/**
 * Stack is actually one of the easiest data structures to implement, so we'll start with it.
 * Conceptually, always think of a stack like a real stack of something (plates, papers, etc). Remember that
 * stacks are LIFO: the most recently added item is the next to be removed.
 *
 * https://www.programiz.com/dsa/stack
 * (note - the implementation given on that site uses an array rather than a linked structure.
 * please attempt the linked structure)
 * @param <T> the type of data that the Stack will contain.
 */
public class StackImplementation<T> {
    /**
     * The item that is currently at the top of the stack.
     */
    private StackNode<T> head;
    private int size;

    /**
     * TODO: Push a new item to the stack.
     * This works similarly to how LinkedLists are manipulated, where the chain of nodes are manipulated or traversed
     * via the '.next' field of a node.
     * For stacks, the head can be replace
     */
    public void push(T value){
        StackNode<T> newNode = new StackNode<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * TODO: check if the stack is empty
     * You can check if the stack is empty by simply checking if the head is null or not.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * TODO: return the value at the top of the stack
     * @return the data of the head (top item) of the stack - so, return head.data
     */
    public T peek(){
        return head.data;
    }
    /**
     * TODO: remove the top item of the stack
     * @return the value of the head (top item) of the stack, and set the head to the next node of the old head.
     * check that the head is not null before you try accessing the next node to avoid a null pointer exception.
     * Don't forget to decrement the size!
     */
    public T pop(){
        if(head == null){
            return null;
        }else{
            StackNode<T> oldHead = head;
            head = head.next;
            size--;
            return oldHead.data;
        }
    }

    /**
     * No need to change this method. It is needed for testing.
     * @return the number of items in the stack.
     */
    public int size(){
        return size;
    }
}