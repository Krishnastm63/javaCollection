package collections;

import java.util.HashMap;
//import java.util.Iterator;

public class HashMapRunner {

	public static void main(String[] args) {
		HashMap<Employee,String>employees=new HashMap<>();
		Employee emp1=new Employee("Krishna","Bihar", "krishnastm63@gmail.com", 50000, 22);
		Employee emp2=new Employee("Krishna", "Bihar", "krishnastm63@gmail.com", 60000, 22);
		employees.put(emp1,"12");
		employees.put(emp1, "12");
		 
   		System.out.println(employees);
	}

}
