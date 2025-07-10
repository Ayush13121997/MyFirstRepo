package in.Collection.PriorityQueue1;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(5);
		pq.offer(30);
		
		System.out.println("Priority Queue: " + pq);
		
		System.out.println("Head of the queue: " + pq.peek());
		
		System.out.println("Removing head: " + pq.poll());
		
		
		
		System.out.println("Priority Queue after removal: " + pq);
		
		System.out.println("Size of the queue: " + pq.size());
		
		pq.clear();
		
		System.out.println("Priority Queue after clearing: " + pq);
		
		//System.out.println("Removing head: " + pq.element()); //java.util.NoSuchElementException
		
//		System.out.println("Removing head: " + pq.remove());//java.util.NoSuchElementException
		
		//pq.add(null); //java.lang.NullPointerException
		
		//pq.offer(null); //java.lang.NullPointerException
		
		//pq.peek(); //java.lang.NullPointerException
		
		//pq.poll(); //java.lang.NullPointerException
		
		//pq.element(); //java.lang.NullPointerException
		
		//pq.remove(); //java.lang.NullPointerException
		
		
		System.out.println("Is the queue empty? " + pq.isEmpty());
		
		System.out.println("Does the queue contain 10? " + pq.contains(10));
		
		pq.add(25);
		
		System.out.println("Priority Queue after adding 25: " + pq);
		
		pq.remove(15);
		
		System.out.println("Priority Queue after removing 15: " + pq);
		
		pq.add(5);
		
		System.out.println("Priority Queue after adding 5: " + pq);
		
		pq.remove(30);
		
		System.out.println("Priority Queue after removing 30: " + pq);
		
		pq.add(20);
		
		System.out.println("Priority Queue after adding 20: " + pq);
		
		pq.remove(10);
		
		System.out.println("Priority Queue after removing 10: " + pq);

	}

}
