package memento;
 
import java.lang.reflect.Field;
import originator.*;

public class Memento {

	String name;
	int age;
	int salary;
	
	public Memento(Emp emp) {
		this.age = emp.getAge();
		this.salary = emp.getSalary();
		this.name = emp.getName();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	
	
	
}
