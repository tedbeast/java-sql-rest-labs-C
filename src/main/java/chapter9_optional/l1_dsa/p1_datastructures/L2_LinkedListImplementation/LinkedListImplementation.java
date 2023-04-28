package chapter9_optional.l1_dsa.p1_datastructures.L2_LinkedListImplementation;
/**
 * https://www.programiz.com/dsa/linked-list
 * (note - the Java implementation provided isn't fully leveraging OOP)
 *
 * Linked lists rely on keeping track of a 'node' of data, which is built around special objects which both contain
 * some value and point to where to find the next object in memory.
 * @param <T>
 */
public class LinkedListImplementation<T> {
    private LinkedNode<T> head;
    private int size;

    /**
     * Head will be null and size will be 0, which is the correct starting setup for a new linkedList.
     * (these are actually the default values ... so nothing needs to be written)
     */
    public LinkedListImplementation(){

    }


    /**
     * TODO: Add a new item to the end of a linkedList.
     * If head is null, that means that the list must be empty: you can simply set head to be a new node.
     *
     * Otherwise, you will need to traverse the linked list, navigating through all the elements except the last one
     * (using size-1 to determine how many nodes to traverse), and then setting the next node of the last node to a new
     * LinkedNode containing the T item. Because you are traversing a chain of LinkedNodes, you will need to keep track
     * of the 'current' LinkedNode and use the .next property of a LinkedNode to progress along the chain. You can keep
     * track of the current LinkedNode outside of the forLoop, and use the for loop to set the current node to
     * current.next. example:
     * (before adding 'blue'): red->yellow->green->
     * (after adding 'blue'): red->yellow->green->blue
     *
     * In either case, the logical size of the LinkedList has grown, so increment size via size++.
     *
     * Check out the solution in add.png.
     *
     * This is an O(n) operation, because the amount of work needed to perform the add scales directly with
     * the current size of the linkedList.
     *
     * @param item New item added to the ArrayList.
     */
    public void add(T item){

    }

    /**
     * TODO: Get the value at an index. For a linkedList, this will require traversing the linked list.
     *
     * Similarly to adding an item to the linkedList, you will need to keep track of a current LinkedNode, and use
     * a for loop to traverse the chain of LinkedNodes. Once you've traversed the amount of nodes described by
     * 'index', the current node would be the item at the index.
     *
     * Check out the solution in get.png.
     *
     * This is an O(n) operation, because the amount of work needed to perform the get scales directly with
     * the current size of the linkedList.
     *
     * @param index index in data.
     * @return the value of data at index.
     */
    public T get(int index){
        return null;
    }

    /**
     * No need to change this method - it works and will be used in testing.
     * @return the size of the ArrayList.
     */
    public int size(){
        return size;
    }
}
