package com.github.designpattern.adapter;

public class Adapter extends AdapteeImpl implements Target {

	@Override
	public void request() {
		this.specificRequest();
		System.out.println("Request.");
	}

}
