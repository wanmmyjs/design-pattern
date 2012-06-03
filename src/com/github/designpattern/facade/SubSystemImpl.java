package com.github.designpattern.facade;

public class SubSystemImpl implements SubSystem {

	@Override
	public void methodA() {
		System.out.println("Method A");
	}

	@Override
	public void methodB() {
		System.out.println("Method B");
	}

	@Override
	public void methodC() {
		System.out.println("Method C");
	}

}
