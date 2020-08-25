package corejavapractice;

import java.util.PriorityQueue;

public class QDemo {

	public static void main(String[] args) {
		//PriprityQueue class helps prioritize the ellemets in q
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		for(int i=10; i>0;i--) {
			queue.add(i);
		}
		System.out.println("The head of queue is : "+ queue.peek());
		System.out.println("The REMOVE head of queue  : "+ queue.poll());
		System.out.println("The new  head of queue is : "+ queue.peek());
		
        
	}

}
