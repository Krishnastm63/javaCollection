package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRunner {

	public static void main(String[] args) {
		HashSet<Student> student=new HashSet<Student>();
		Student std1=new Student("Krishna",20,"B.E","1BO18CS045");
		Student std2=new Student("Krishna",20,"B.E","1BO18CS045");
		student.add(std1);
		student.add(std2);
		student.add(std2);
		student.add(std1);
		//student.remove(std2);
		System.out.println(student.contains(std2));
		//System.out.println(std1);
		//System.out.println(std2);
		
		Iterator<Student> it=student.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
	
	

}
