package a6;

import java.util.ArrayList;

public class MinBinaryHeap <V, P extends Comparable<P>> implements BinaryHeap<V, P> {

    // Your instance fields here.
	@SuppressWarnings("unused")
	private ArrayList <Prioritized<V,P>> aList;
	
    /**
     * Constructor that creates an empty heap of Prioritized objects.
     */
    public MinBinaryHeap() {    	
    	aList = new ArrayList<Prioritized<V,P>>();
    }
    
    /**
     * Constructor that builds a heap given an initial array of Prioritized objects.
     */
    public MinBinaryHeap(Prioritized<V,P> initialEntries[]) {
    	// Your code here.
    	aList = new ArrayList<Prioritized<V,P>>();
    	for (int i = 0; i < initialEntries.length; i++) {
    		aList.add(initialEntries[i]);
    	}
    }

    @Override
    public int size() {
    	return aList.size();
    }

    @Override
    public void enqueue(V value, P priority) {
    	// Your code here.
    	PrioritizedImpl<V, P> prioritized1 = new PrioritizedImpl<V,P>(value, priority);
    	aList.add(prioritized1);
    	
    	int position = aList.size() - 1;
    	
    	//int pos2 = (position - 1) / 2;
    	while (position > 0) {
    		if (aList.get(position).getPriority().compareTo(aList.get((position - 1) / 2).getPriority()) < 0) {
    			Prioritized<V,P> temp = aList.get(position);
    			aList.set(position, aList.get((position - 1) / 2));
    			aList.set((position - 1) / 2, temp);
    			position = (position - 1) / 2;
    		} else {
    			return;
    		}
    	}
    	return;
    	
    }

    @Override
    public V dequeue() {
    	// Your code here. 
    	V res = aList.get(0).getValue();
    	aList.set(0, aList.get(aList.size()-1));
    	aList.remove(aList.size()-1);
    	int position = 0;
    	int left = position * 2 + 1;
    	int right = position * 2 + 2;
    	
    	while (left < aList.size()) {
    		int smaller;
    		if (right > aList.size()) {
    			smaller = left;
    		} else {
    			if (left > aList.size()-1 || right > aList.size()-1 || position > aList.size()-1) {
    				throw new IndexOutOfBoundsException("Out of bounds");
    			}
    			if (aList.get(left).getPriority().compareTo(aList.get(right).getPriority()) < 0) {
    				smaller = left;
    			} else {
    				smaller = right;
    			}
    		}
    		if (aList.get(position).getPriority().compareTo(aList.get(smaller).getPriority()) < 0) {
    			return res;
    		} else {
    			Prioritized<V,P> temp = aList.get(position);
    			aList.set(position, aList.get(smaller));
    			aList.set(smaller, temp);
    			position = smaller;
    			left = position * 2 + 1;
    			right = position * 2 + 2;
    		}
    	}
    	return res;
    }

    @Override
    public V getMin() {
    	// Your code here.    	
    	return aList.get(0).getValue();
   }

    @Override
    public Prioritized<V, P>[] getAsArray() {
    	// Your code here.    	
    	Prioritized<V,P>[] array = (Prioritized<V,P>[]) new Prioritized[aList.size()];
    	for (int i = 0; i < aList.size(); i++) {
    		array[i] = aList.get(i);
    	}
    	return array;
    }
}
