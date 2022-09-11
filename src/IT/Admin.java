package IT;

public class Admin {
	protected String name;
	protected int age;

	
	 /* Admin(String name, int age) { 
		  this.name = name; 
		  this.age = age; 
	  }*/
	 

	protected void main() {
		System.out.println(age);
		System.out.println(name);
	}

	
}

 class Employee extends Admin {

	
	  /*Employee(String name, int age) { 
		  super(name, age);
	  
	  }
	 */
	protected void print() {
		System.out.println("class is inherited");
	}

}
 class Animal extends Employee{
	void color() {
		System.out.println("cat is black");
		System.out.println("dog is white");
	}
	void sound() {
		System.out.println("cat sound like meow");
	    System.out.println("Dog barks");
	}
}