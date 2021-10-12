package com.qa.manager;

import com.qa.model.*;

public class Manager {

	private Garage curGarage;
	
	
	public Garage createGarage() {
		Garage newGarage = new Garage();
		curGarage = newGarage;
		return curGarage;
	}
	
	public Vehicle createCar(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed,
			float acceleration, int baseValue, int numDoors, int bootSpace, boolean hasSeatWarmers) {
		Car car = new Car(id, type, colour, engineSize, isPreowned, age, topSpeed, acceleration,baseValue, numDoors, bootSpace, hasSeatWarmers);
		return car;
	}
	
	public Vehicle createBoat(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed,
			float acceleration, int baseValue, int numEngines, String radioModel) {
		SpeedBoat boat = new SpeedBoat(id, type, colour, engineSize, isPreowned, age, topSpeed,
				acceleration, baseValue, numEngines, radioModel);
		return boat;
	}
	
	public Vehicle createMotorbike(String id, String type, String colour, float engineSize, boolean isPreowned, int age, int topSpeed,
			float acceleration, int baseValue, int wheels, boolean hasPassengerSeats, boolean hasMudguards) {
		Motorbike bike = new Motorbike(id, type, colour, engineSize, isPreowned, age,topSpeed,
				acceleration, baseValue, wheels, hasPassengerSeats, hasMudguards);
		return bike;
	}
	
	public Garage addToGarage(Vehicle vehicle) {
		curGarage.addVehicle(vehicle);
		return curGarage;
	}
	
	public void readGarage() {
		for(int i = 0; i < curGarage.getSize(); i++) {
			System.out.println(curGarage.get(i));
		}
	}
	
	public void readGarage(int index) {
		System.out.println(curGarage.get(index));
	}

	public void removeGarage(int index) {
		curGarage.removeIndex(index);
	}
	
	
	
	public void clearGarage() {
		curGarage.empty();
	}
	
	public void replaceGarage(int index, Vehicle vehicle) {
		curGarage.removeIndex(index);
		curGarage.addVehicle(vehicle, index);
	}
	

	public void fixGarage(int index) {
		curGarage.fix(index);
	}
	
	public void fixGarage(String id) {
		curGarage.fix(id);
	}
	
	public void fixGarageAll() {
		curGarage.fixAll();
	}
	
	public void calcTypeGarage() {
		curGarage.fixType();
	}
	
	public void removeTypeGarage(String type) {
		curGarage.removeType(type);
	}
	
}


