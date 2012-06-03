package com.github.designpattern.adapter;

public class AdapteeImpl implements Adaptee {

	@Override
	public void specificRequest() {
		System.out.println("Specific Request.");
	}

}
