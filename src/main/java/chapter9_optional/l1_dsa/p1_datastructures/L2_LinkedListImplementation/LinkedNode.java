package chapter9_optional.l1_dsa.p1_datastructures.L2_LinkedListImplementation;

/**
 * this class will hold a single Object's worth of data, and also link itself to another LinkedNode, like a chain.
 * no need to change anything.
 * @param <T>
 */
public class LinkedNode<T> {
    public T data;
    public LinkedNode<T> next;
    public LinkedNode(T data){
        this.data = data;
    }
}
