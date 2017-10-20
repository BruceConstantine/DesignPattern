package test;

import caretaker.*;
import memento.*;
import originator.*;

public class Test {
	public static void main(String [] args) {
		Caretaker caretaker = new Caretaker();
		Emp employee = new Emp("Bruce", 22, 0);
		System.out.println(employee.toString()); 
		
		caretaker.setMemento( employee.createCurrencyStateAsMemento() );

		employee = new Emp("Bruce", 25, 11100);
		System.out.println(employee.toString()); 
		
		employee.recoverState( caretaker.getMemento() );
		System.out.println(employee.toString()); 
		
	}
}
