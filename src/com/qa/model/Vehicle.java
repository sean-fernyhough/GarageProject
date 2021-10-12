package com.qa.model;

public class Vehicle {

	private String id;
	private String type;
	private String colour;
	private float engineSize;
	private boolean isPreowned;
	private int age;
	private int topSpeed;
	private float acceleration;
	private int baseValue;
	
	
	public Vehicle(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed, float acceleration, int baseValue) {
		this.id = id;
		this.type = type;
		this.colour = colour;
		this.engineSize = engineSize;
		this.isPreowned = isPreowned;
		this.age = age;
		this.topSpeed = topSpeed;
		this.acceleration = acceleration;
		this.baseValue = baseValue;
	}
	
<<<<<<< HEAD
	public float calcValue() {
		float value = baseValue + (engineSize * 2000) + (topSpeed * 10) + (acceleration * 30);
		value -= (age * 80);
		if(isPreowned) {
			value -= value * 0.6;
			return value;
		}else {
		return value;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	public boolean isPreowned() {
		return isPreowned;
	}

	public void setPreowned(boolean isPreowned) {
		this.isPreowned = isPreowned;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public float getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(float acceleration) {
		this.acceleration = acceleration;
	}

	public int getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}

	}
	
	
	
=======
	
}
>>>>>>> dev
