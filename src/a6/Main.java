package a6;

/*
 * A simple test program for A6
 * 
 */
public class Main {

	public static void main(String[] args) {
		BinaryHeap<String, Integer> heap = new MinBinaryHeap<String, Integer>();
		
		heap.enqueue("First", 1);
		heap.enqueue("Last", 100);
		heap.enqueue("Red", 3);
		heap.enqueue("Blue", 40);
		heap.enqueue("Green", 12);
		heap.enqueue("Apples", 6);

		System.out.println("Size should be 6 and is: " + heap.size());

		// First three items out should be "First", "Red", "Apples"
		System.out.println(heap.dequeue());
		System.out.println(heap.dequeue());
		System.out.println(heap.dequeue());

		System.out.println("Size should be 3 and is: " + heap.size());

		heap.enqueue("Bananas", 2);

		System.out.println("Size should be 4 and is: " + heap.size());

		// Remaining four items out should be "Bananas", "Green", "Blue", "Last"
		System.out.println(heap.dequeue());
		System.out.println(heap.dequeue());
		System.out.println(heap.dequeue());
		System.out.println(heap.dequeue());

		System.out.println("Size should be 0 and is: " + heap.size());
	}
}
