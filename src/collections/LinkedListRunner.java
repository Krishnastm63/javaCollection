package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;


public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList<String> animal=new LinkedList<>();
		animal.offer("123");
		animal.offer("Lion");
		animal.offer("Cat");
		animal.add("Dear");
		animal.set(2,"456");
		animal.add("Elephant");
		System.out.println(animal);
		System.out.println(animal.element());
		System.out.println(animal.peek());
		System.out.println(animal.poll());
		Iterator<String> itr=animal.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
