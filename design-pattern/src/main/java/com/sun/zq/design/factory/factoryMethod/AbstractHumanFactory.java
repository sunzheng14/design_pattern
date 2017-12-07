package com.sun.zq.design.factory.factoryMethod;

import com.sun.zq.design.factory.factoryMethod.product.Human;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
