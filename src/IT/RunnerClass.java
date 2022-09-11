package IT;
public class RunnerClass{
	public static void main(String args[]) {
		// Employee emp = new Employee("Krishna ",22);
		Animal emp = new Animal();
		emp.name = "Krishna";
		emp.age = 22;
		//System.out.println(emp.name);
		// System.out.println(emp.age);
		emp.main();
		emp.print();
		emp.color();
		emp.sound();
	}
}
