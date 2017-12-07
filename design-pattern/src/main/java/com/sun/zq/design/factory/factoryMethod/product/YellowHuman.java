package com.sun.zq.design.factory.factoryMethod.product;

public class YellowHuman implements Human {

	@Override
	public void run() {
		System.out.println("yellow human run slow!");
	}

	@Override
	public void talk() {
		System.out.println("yellow human talk in chinese!");
	}

}
