package com.sun.zq.design.factory.product;

public class BlankHuman implements Human {

	@Override
	public void run() {
		System.out.println("blank human is run fast!");
	}

	@Override
	public void talk() {
		System.out.println("blank human is talk in English!");
	}

}
