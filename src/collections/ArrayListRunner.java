package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListRunner {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		List<Integer> al2=new ArrayList<>();
		al.add(100);
		al.add(500);
		al.add(300);
		al.add(100);
		al.set(1, 700);
		System.out.println(al);
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.size());
		al2.add(600);
		al2.add(400);
		al2.add(900);
		System.out.println(al2.remove(0));
		System.out.println(al2.size());
		System.out.println(al.equals(al2));
		//System.out.println(al.addAll(al2));
		System.out.println(al);
		Iterator<Integer> itr=al.iterator();
		Iterator<Integer> itr1=al2.iterator();
		for (int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
