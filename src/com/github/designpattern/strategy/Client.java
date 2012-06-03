package com.github.designpattern.strategy;

public class Client {
	public static void main(String args[]) {

		Context context = new Context(new ConcreteStrategy());
		context.operate();

	}
}
