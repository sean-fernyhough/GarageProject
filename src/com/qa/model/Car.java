package com.qa.model;

public class Car extends Vehicle {

	private int numDoors;
	private int bootSpace;
	private boolean hasSeatWarmers;
	
	
	public Car(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed,
			float acceleration, int baseValue, int numDoors, int bootSpace, boolean hasSeatWarmers) {
		super(id, type, colour, engineSize, isPreowned, age, topSpeed, acceleration, baseValue);
		this.numDoors = numDoors;
		this.bootSpace = bootSpace;
		this.hasSeatWarmers = hasSeatWarmers;
	}
	
	@Override
	public float calcValue() {
		float value = getBaseValue() + (getEngineSize() * 2000) + (getTopSpeed() * 10) + (getAcceleration() * 30) + (numDoors * 500) + (bootSpace * 100);
		value -= (getAge() * 80);
		if(hasSeatWarmers) {
			value += 2000;
		}
		if(isPreowned()) {
			value -= value * 0.6;
			return value;
		}else {
		return value;
		}
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	public boolean isHasSeatWarmers() {
		return hasSeatWarmers;
	}

	public void setHasSeatWarmers(boolean hasSeatWarmers) {
		this.hasSeatWarmers = hasSeatWarmers;
	}

	@Override
	public String toString() {
		return "Car [numDoors=" + numDoors + ", bootSpace=" + bootSpace + ", hasSeatWarmers=" + hasSeatWarmers + "]";
	}
	
	
	

}
