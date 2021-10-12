package com.qa.model;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public Garage() {
		
	}
	
	
	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public void addVehicle(Vehicle vehicle, int index) {
		garage.add(index, vehicle);;
	}
	
	public void fixType() {
		float carValue = 0;
		float bikeValue = 0;
		float boatValue = 0;
		for(int i = 0; i < garage.size(); i++ ) {
				String type = garage.get(i).getClass().getSimpleName();
				Vehicle vehicle = garage.get(i);
				if(type.equals("Car")) {
					carValue += vehicle.calcValue() * 1.2;
				}else if (type.equals("Motorbike")) {
					bikeValue += vehicle.calcValue() * 0.8;
				}else if (type.equals("SpeedBoat")) {
					boatValue += vehicle.calcValue() * 3;
						
				}
			}
		
		System.out.println("value of cars: " + carValue);
		System.out.println("value of bikes: " + bikeValue);
		System.out.println("value of boats: " + boatValue);
		}
	
	
	public float fix(String id) {
		float value = 0;
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getId() == id) {
				Vehicle vehicle = garage.get(i);
				value = vehicle.calcValue();
				return value;
			}
			}
		return value;
		}
	
	public void fix(int index) {
		float value = 0;
				Vehicle vehicle = garage.get(index);
				value = vehicle.calcValue();
				System.out.println("Repair cost: " + value);
			}
	
	public void fixAll() {
		float value = 0;
		float subValue = 0;
		for(int i = 0; i < garage.size(); i++ ) {
				subValue = garage.get(i).calcValue();
				value += garage.get(i).calcValue();
				System.out.println("Item " + (i + 1) + ":" + subValue);
			}
		System.out.println("Sum of all repair work: " + value);
			}
	
	

	public void removeId(String id) {
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getId() == id) {
				garage.remove(i);
			}
			}
	}
	
	public void removeType(String type) {
		for(int i = 0; i < garage.size(); i++ ) {
				i = 0;
				String checkType = garage.get(i).getClass().getSimpleName();
				Vehicle vehicle = garage.get(i);
				if(checkType.equals("Car") && type.equals("Car")) {
					garage.remove(i);
				}else if (checkType.equals("Motorbike") && type.equals("Motorbike")) {
					garage.remove(i);
				}else if (checkType.equals("SpeedBoat") && type.equals("SpeedBoat")) {
					garage.remove(i);
			}
		}
	}
	
	
	public void removeIndex(int index) {
				garage.remove(index);
			}
	
	
	public void empty() {
		garage.clear();
	}
	
	public Vehicle get(int index) {
		return garage.get(index);
		
	}
	
	
	public int getSize() {
		return garage.size();
	}
		
	}
	
