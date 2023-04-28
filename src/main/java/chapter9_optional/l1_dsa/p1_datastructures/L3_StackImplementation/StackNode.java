package chapter9_optional.l1_dsa.p1_datastructures.L3_StackImplementation;

/**
 * No need to change anything in this class (other than perhaps adding getters and setters).
 * @param <T>
 */
public class StackNode<T> {
    T data;
    StackNode<T> next;
    public StackNode(T data){
        this.data = data;
    }
    public StackNode(T data, StackNode<T> next){
        this.data = data;
        this.next = next;
    }
}
