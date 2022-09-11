package collections;

import java.util.Objects;

public class Student {
	
	String name;
	int age;
	String course;
	String rollno;
	public Student(String name, int age, String course, String rollno) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + ", rollno=" + rollno + "]";
	}
	@Override
	public int hashCode() {
		//System.out.println("hashcode is called");
		return Objects.hash(rollno);
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals is called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(rollno, other.rollno);
	}
	
}
