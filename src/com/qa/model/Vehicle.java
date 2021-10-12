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
	
}
