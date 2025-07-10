package in.Collection.PriorityQueue2;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue(15, new MyComparator());
		
		pq.offer("A");
		pq.offer("Z");
		pq.offer("L");
		pq.offer("B");
		pq.offer("N");
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		System.out.println(pq.size());
		
		System.out.println(pq.isEmpty());
		
		pq.clear();
		
		System.out.println(pq);
	}

}
