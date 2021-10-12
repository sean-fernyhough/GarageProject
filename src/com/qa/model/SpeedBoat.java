package com.qa.model;

public class SpeedBoat extends Vehicle {

	private int numEngines;
	private String radioModel;

	public SpeedBoat(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed,
			float acceleration, int baseValue, int numEngines, String radioModel) {
		super(id, type, colour, engineSize, isPreowned, age, topSpeed, acceleration, baseValue);
		this.numEngines = numEngines;
		this.radioModel = radioModel;
		
	}
	
	@Override
	public float calcValue() {
		float value = getBaseValue() + (getEngineSize() * 2000) + (getTopSpeed() * 10) + (getAcceleration() * 30) + (numEngines * 2);
		value -= (getAge() * 80);
		if(isPreowned()) {
			value -= value * 0.6;
			return value;
		}else {
		return value;
		}
	}

	public int getNumEngines() {
		return numEngines;
	}

	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}

	public String getRadioModel() {
		return radioModel;
	}

	public void setRadioModel(String radioModel) {
		this.radioModel = radioModel;
	}
	
	
	
	
	

}
