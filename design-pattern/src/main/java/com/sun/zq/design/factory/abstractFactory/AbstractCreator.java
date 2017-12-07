package com.sun.zq.design.factory.abstractFactory;

import com.sun.zq.design.factory.abstractFactory.Product.ProductA;
import com.sun.zq.design.factory.abstractFactory.Product.ProductB;

public interface AbstractCreator {
	ProductA createProductA();
	
	ProductB createProductB();
}
