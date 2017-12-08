package com.sun.zq.design.templateMethod;

public abstract class Car {
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engine();

	boolean isAlarm() {
		return true;
	}

	void run() {
		this.start();
		this.engine();
		if (this.isAlarm()) {
			this.alarm();
		}

		this.stop();
	}

}
