package Day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// first in first out (FIFO) concept
		
		Queue<String> q = new LinkedList<>();
		
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.add("Four");
		q.add("Five");
		
		System.out.println(q);
		
		q.poll();  // it will be remove the first value which will be inserted in queue
		
		System.out.println(q);
	}
	
}
