package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueRunner {

	public static void main(String[] args) {
		NumberCompator obj=new NumberCompator();
		PriorityQueue<Integer> pq=new PriorityQueue<>(obj);
		pq.offer(600);
		pq.add(100);
		pq.add(300);
		pq.add(400);
		System.out.println(pq.contains(800));
		System.out.println(pq);
		System.out.println(pq.remove());
	}

}
class NumberCompator implements Comparator<Integer>{

	public int compare(Integer pq1, Integer pq2) {
		if(pq1>pq2) {
			return -1;
		}
		else if(pq1<pq2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
