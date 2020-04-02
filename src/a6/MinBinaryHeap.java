package a6;

public class MinBinaryHeap <V, P extends Comparable<P>> implements BinaryHeap<V, P> {

    // Your instance fields here.
	
	
    /**
     * Constructor that creates an empty heap of Prioritized objects.
     */
    public MinBinaryHeap() {    	
    	// Your code here.
    }
    
    /**
     * Constructor that builds a heap given an initial array of Prioritized objects.
     */
    public MinBinaryHeap(Prioritized<V,P> initialEntries[]) {
    	// Your code here.    	
    }

    @Override
    public int size() {
    	// Your code here.
    }

    @Override
    public void enqueue(V value, P priority) {
    	// Your code here.
    }

    @Override
    public V dequeue() {
    	// Your code here.    	
    }

    @Override
    public V getMin() {
    	// Your code here.    	
    }

    @Override
    public Prioritized<V, P>[] getAsArray() {
    	// Your code here.    	
    }
}
