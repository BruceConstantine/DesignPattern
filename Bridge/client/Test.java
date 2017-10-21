package client;

import computer.*;
import brand.*;

public class Test {
	public static void main(String []args){
		Computer computer = new Desktop( new Lenovo() );
		System.out.println( computer.getDescribe());
	}
}
