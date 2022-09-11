package collections;

import java.util.Objects;

public class Employee {
	String name;
	String address;
	String email;
	float salary;
	int age;
	public Employee(String name, String address, String email, float salary, int age) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", email=" + email + ", salary=" + salary + ", age="
				+ age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, email, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
}
