package com.qa.model;

public class Motorbike extends Vehicle {

	private int wheels;
	private boolean hasPassengerSeats;
	private boolean hasMudguards;
	
	public Motorbike(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed,
			float acceleration, int baseValue, int wheels, boolean hasPassengerSeats, boolean hasMudguards) {
		super(id, type, colour, engineSize, isPreowned, age, topSpeed, acceleration, baseValue);
		this.wheels = wheels;
		this.hasPassengerSeats = hasPassengerSeats;
		this.hasMudguards = hasMudguards;
	}
	
	
	@Override
	public float calcValue() {
		float value = getBaseValue() + (getEngineSize() * 2000) + (getTopSpeed() * 10) + (getAcceleration() * 30) + (wheels * 500);
		value -= (getAge() * 80);
		if(hasMudguards) {
			value += 500;
		}
		if(hasPassengerSeats) {
			value += 1000;
		}
		if(isPreowned()) {
			value -= value * 0.6;
			return value;
		}else {
		return value;
		}
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public boolean isHasPassengerSeats() {
		return hasPassengerSeats;
	}


	public void setHasPassengerSeats(boolean hasPassengerSeats) {
		this.hasPassengerSeats = hasPassengerSeats;
	}


	public boolean isHasMudguards() {
		return hasMudguards;
	}


	public void setHasMudguards(boolean hasMudguards) {
		this.hasMudguards = hasMudguards;
	}


	@Override
	public String toString() {
		return "Motorbike [wheels=" + wheels + ", hasPassengerSeats=" + hasPassengerSeats + ", hasMudguards="
				+ hasMudguards + "]";
	}

	
	
}





