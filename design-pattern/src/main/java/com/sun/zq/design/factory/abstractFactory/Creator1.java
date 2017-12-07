package com.sun.zq.design.factory.abstractFactory;

import com.sun.zq.design.factory.abstractFactory.Product.ProductA;
import com.sun.zq.design.factory.abstractFactory.Product.ProductA1;
import com.sun.zq.design.factory.abstractFactory.Product.ProductB;
import com.sun.zq.design.factory.abstractFactory.Product.ProductB1;

public class Creator1 implements AbstractCreator {
	@Override
	public ProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB1();
	}
	
}
