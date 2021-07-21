package myPackage;

import java.util.PriorityQueue;

public class MyClass {

	public static void main(String[] args) 
	{
		//PriorityQueue is a class which implements Queue Interface
		/*similarly, for List Interface we have 3 classes 
		1. ArrayList
		2. LinkedList
		3. Vector*/
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		
		System.out.println(pq.peek());//fetch first element in a queue i.e 10
		System.out.println(pq.poll());//fetch and remove first element from a queue i.e 10
		System.out.println(pq.peek());////fetch current first element in a queue after 10 is removed
		
		/*peek() - fetch first element in a queue without removing it
		 * poll() - fetch and remove first element from a queue
		 * */
	}
}
