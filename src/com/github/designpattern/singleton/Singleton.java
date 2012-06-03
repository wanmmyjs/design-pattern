package com.github.designpattern.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		// Don't instance me.
	}

	public static Singleton getInstance() {
		// Double-Check Locking
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	public void operate() {
		System.out.println("Do your stuff.");
	}

}
