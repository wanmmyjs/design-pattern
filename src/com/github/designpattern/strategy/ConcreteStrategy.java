package com.github.designpattern.strategy;

public class ConcreteStrategy implements Strategy {

	@Override
	public void operate() {
		System.out.println("Concrete Strategy。");
	}

}
