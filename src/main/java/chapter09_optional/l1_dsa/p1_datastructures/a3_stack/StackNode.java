package chapter09_optional.l1_dsa.p1_datastructures.a3_stack;

/**
 * No need to change anything in this class (other than perhaps adding getters and setters).
 * @param <T>
 */
public class StackNode<T> {
    T data;
    StackNode<T> next;
    public StackNode(T data, StackNode<T> next){
        this.data = data;
        this.next = next;
    }
}
