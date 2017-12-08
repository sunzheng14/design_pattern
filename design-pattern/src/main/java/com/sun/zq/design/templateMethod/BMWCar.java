package com.sun.zq.design.templateMethod;

public class BMWCar extends Car {

	private boolean isAlarm;

	@Override
	protected void start() {
		System.out.println("BMW is starting...");
	}

	@Override
	protected void stop() {
		System.out.println("BMW is stoping...");

	}

	@Override
	protected void alarm() {
		System.out.println("BMW is alarming...");

	}

	@Override
	protected void engine() {
		System.out.println("BMW is engineing...");
	}
	
	@Override
	public boolean isAlarm() {
		return this.isAlarm;
	}

	public void run() {
		super.run();
	}

	public void setAlarm(boolean isAlarm) {
		this.isAlarm = isAlarm;
	}
	
	

}
