package com.sun.zq.design.templateMethod;

public class Client {

	public static void main(String[] args) {
		BMWCar bmwCar = new BMWCar();
		bmwCar.setAlarm(false);
		bmwCar.run();
		System.out.println("---------------");
		
		Benz benz = new Benz();
		benz.setAlarm(true);
		benz.run();
	}

}
