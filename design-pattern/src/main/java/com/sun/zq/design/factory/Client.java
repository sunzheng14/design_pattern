package com.sun.zq.design.factory;

import com.sun.zq.design.factory.product.Human;
import com.sun.zq.design.factory.product.WhiteHuman;
import com.sun.zq.design.factory.product.YellowHuman;

public class Client {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.talk();
		
		Human yellowHuman = factory.createHuman(YellowHuman.class);
		yellowHuman.talk();
	}

}
