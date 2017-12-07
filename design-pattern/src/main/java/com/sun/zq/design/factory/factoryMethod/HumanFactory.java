package com.sun.zq.design.factory.factoryMethod;

import com.sun.zq.design.factory.factoryMethod.product.Human;

public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)human;
	}

}
