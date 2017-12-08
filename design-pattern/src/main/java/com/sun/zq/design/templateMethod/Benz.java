package com.sun.zq.design.templateMethod;

public class Benz extends Car{
	private boolean isAlarm;
	
	@Override
	protected void start() {
		System.out.println("benz is starting...");
		
	}

	@Override
	protected void stop() {
		System.out.println("benz is stoping...");
		
	}

	@Override
	protected void alarm() {
		System.out.println("benz is alarming...");
		
	}

	@Override
	protected void engine() {
		System.out.println("benz is engineing...");
		
	}
	
	public void run() {
		super.run();
	}

	public boolean isAlarm() {
		return this.isAlarm;
	}

	public void setAlarm(boolean isAlarm) {
		this.isAlarm = isAlarm;
	}

}
