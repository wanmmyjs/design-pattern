package com.github.designpattern.facade;

public class Facade {

	private SubSystem system = new SubSystemImpl();

	public void request() {
		
		system.methodA();
		system.methodB();
		system.methodC();
		
	}

}
