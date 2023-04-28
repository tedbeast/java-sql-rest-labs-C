package chapter9_optional.l1_dsa.p1_datastructures.L6_HashSetImplementation;

/**
 * HashSets are a relatively simple data structure to implement if you disregard the small chance of collision when
 * two Objects have the same HashCode. We will be ignoring that possibility here.
 * @param <T>
 */
public class HashSetImplementation<T> {
    /**
     * The sparesely-populated array in which our data will be stored.
     */
    private T[] data;
    /**
     * the size of data - it should be very large as we want to minimize the risk of two objects trying to occupy
     * the same spot in data.
     */
    private int bucketSize;
    /**
     * the amount of items in HashSet.
     */
    private int size;

    /**
     * on the creation of a HashSet, we initialize a large sparsely populated array.
     * no need to change anything here.
     */
    public HashSetImplementation(){
        bucketSize = 1000000;
        data = (T[]) new Object[bucketSize];
        size = 0;
    }

    /**
     * TODO: Find a position in which to place an object and set that index of the array to the object
     *
     * All objects in java contain a method called hashcode, which can be used to generate a large number
     * that can be used to identify a specific object - in order to store that object into a sparsely populated array,
     * we could use hashcode % bucketsize to determine a random index that can be easily found later. Make sure that
     * the position index value is positive value is positive - you can use the Math.abs method.
     *
     * Then, increment size. Don't worry about the possibility of two values occupying the same index in the bucket.
     * In the real world, this is solved with the bucket containing {bucketsize} amount of linkedlists, which
     * complicates the problem.
     *
     * Check out the add.png for a solution.
     *
     * This is an O(1) operation, because the amount of work needed to complete the operation doesn't change with
     * respect to the amount of items stored.
     *
     * @param item an item to be added.
     */
    public void add(T item){

    }

    /**
     * TODO: You can use the exact same strategy as used in the add method to locate items within the set, since
     * HashCode will always remain consistent. Make sure that the position index value is positive so that it can be
     * indexed - you can use the Math.abs method.
     *
     * Check out the add.png for a solution.
     *
     * This is an O(1) operation, because the amount of work needed to complete the operation doesn't change with
     * respect to the amount of items stored.
     *
     * @param item an item that may be in the hashSet already.
     * @return true if item is already contained in the set, false otherwise.
     */
    public boolean contains(T item){
        return false;
    }
    /**
     * No need to change this method, it works and will be used in testing.
     */
    public int size(){
        return size;
    }
}
