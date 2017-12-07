package com.sun.zq.design.factory.abstractFactory;

import com.sun.zq.design.factory.abstractFactory.Product.ProductA;
import com.sun.zq.design.factory.abstractFactory.Product.ProductB;

public class Client {
	public static void main(String[] args) {
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		
		ProductA pA1 = creator1.createProductA();
		ProductA pA2 = creator2.createProductA();
		pA1.show();
		pA2.show();
		
		ProductB pB1 = creator1.createProductB();
		ProductB pB2 = creator2.createProductB();
		pB1.show();
		pB2.show();
	}
}
