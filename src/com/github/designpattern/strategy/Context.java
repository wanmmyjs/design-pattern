package com.github.designpattern.strategy;

public class Context {

	public Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}

}
