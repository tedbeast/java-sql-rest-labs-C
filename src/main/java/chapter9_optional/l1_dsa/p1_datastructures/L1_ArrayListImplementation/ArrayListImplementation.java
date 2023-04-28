package chapter9_optional.l1_dsa.p1_datastructures.L1_ArrayListImplementation;

public class ArrayListImplementation<T> {
    /**
     * This array contains generic data.
     * The field is private because an external class modifying the field directly could break the ArrayList's internal
     * logic.
     */
    private T[] data;
    /**
     * The logical - not the physical - size of data. How many items exist.
     * The field is private because an external class modifying the field directly could break the ArrayList's internal
     * logic.
     */
    private int size;

    /**
     * TODO: Initialize data to a new array of type T of a small size, like 1 or 2.
     * You will need to create an Array of Objects and cast it to the generic type T[].
     * use this: data = (T[]) new Object[2];
     */
    public ArrayListImplementation(){
    }

    /**
     * TODO: logic to insert a new item into the array.
     * First, check if data is capable of taking in more items, by comparing the logical size of the arraylist
     * to the actual size of data.
     * (if size == data.length)
     * If it's full, resize the array by creating a new generic array of length size*2,
     * and copy over all the items from the old data into the new data, and set the data array to the new array.
     * Then, add a new item at the current index of size, then increment size by 1.
     *
     * Check out the add.png for the solution.
     *
     * This is an O(1) operation, because as the ArrayList grows infinitely in size, the time it takes to
     * add a new item asymptotically approaches a constant time, even though the array double takes work. This
     * is known as 'amortized time complexity'.
     *
     * @param item New item added to the ArrayList.
     */
    public void add(T item){

    }

    /**
     * TODO: Get the value at an index of data.
     * This is an O(1) operation, because this operation doesn't become any more difficult as the ArrayList grows.
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