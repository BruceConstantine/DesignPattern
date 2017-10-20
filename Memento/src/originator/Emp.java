package originator;

import com.sun.swing.internal.plaf.metal.resources.metal;

import memento.Memento;

public class Emp {

	private String name;
	private int age;
	private int salary;
	
	public Emp(String name , int i , int salary) {
		this.name = name;
		this.salary = salary;
		this.age = i;
	}
	
	public Memento createCurrencyStateAsMemento() {
		return new Memento( this );
	}

	public void recoverState(Memento m) {
		this.age = m.getAge();
		this.salary = m.getSalary();
		this.name = m.getName(); 
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

	public void setAge(short age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString(){
		return "name: "+name + "    --- age: "+age + "  --- salary: "+salary; 
	}
	
	
}
