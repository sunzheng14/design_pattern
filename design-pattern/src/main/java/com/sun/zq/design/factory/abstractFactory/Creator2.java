package com.sun.zq.design.factory.abstractFactory;

import com.sun.zq.design.factory.abstractFactory.Product.ProductA;
import com.sun.zq.design.factory.abstractFactory.Product.ProductA2;
import com.sun.zq.design.factory.abstractFactory.Product.ProductB;
import com.sun.zq.design.factory.abstractFactory.Product.ProductB2;

public class Creator2 implements AbstractCreator {
	@Override
	public ProductA createProductA() {
		return new ProductA2();
	}
	
	public ProductB createProductB() {
		return new ProductB2();
	}

}
