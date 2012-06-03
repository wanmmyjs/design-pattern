package com.github.designpattern.template;

public abstract class AbstractClass {

	protected abstract void methodA();

	protected abstract void methodB();

	final public void template() {

		this.methodA();
		this.methodB();

	}

}
