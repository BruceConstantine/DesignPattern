package caretaker;

import java.util.Stack;

import memento.Memento;

public class Caretaker {
	
	private Stack<Memento> mementoStack;
	
	public Caretaker(){
		mementoStack = new Stack<Memento>();
	}
	
	public Memento getMemento(){
		return mementoStack.pop();
	}
	
	public void setMemento(Memento mementoRecord){
		mementoStack.push(mementoRecord);
	}
	
}
