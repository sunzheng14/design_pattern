package com.sun.zq.design.factory.product;

public class WhiteHuman implements Human {

	@Override
	public void run() {
		System.out.println("white human run slow than blank human");
	}

	@Override
	public void talk() {
		System.out.println("white human talk in English too");
	}

}
