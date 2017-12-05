package com.sun.zq.design.factory;

import com.sun.zq.design.factory.product.Human;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
