# A6 - Binary Heap

Implement a binary heap.

The interface of the binary heap is provided as BinaryHeap. You need to provide the code for its implementation as MinBinaryHeap. These are expressed with respect to generic types V and P where V is the type of the data value and P is the type of the priority value. Notice that the type P is bound as Comparable allowing you to use the method compareTo in order to compare one priority with another. The heap is a "minimum" priority queue which means that the smallest priority should be at the heap root and be associated with the data value that is returned by a call to the method dequeue.

The interface Prioritized<V,P> and its implementation PrioritizedImpl<V,P> should be used to glue the data value and the priority value together within your implementation. You shouldn't have to change either of these.

Your implementation should provide two different constructors. One constructor takes no parameters and creates an initially empty heap. The other constructor is given an array of Prioritized objects that should be the initial contents of the heap. The second constructor should use the efficient heap build procedure described at the end of lecture 17. 

Within your implementation, you should use a List of Prioritized objects as your heap storage. Because the bubble-up and bubble-down algorithms require swapping elements at different indexes, you need to use an ArrayList as your List implementation to be efficient.

The getAsArray method should return an array of Prioritized objects with the current contents of the heap in the order stored within your implementation and will be used for testing purposes.

