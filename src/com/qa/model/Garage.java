package com.qa.model;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public Garage() {
		
	}
	
	
	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public float fix(String id) {
		float value = 0;
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getId() == id) {
				float subValue = garage.get(i).calcValue();
				return subValue;
			}
			}
		return value;
		}
	
	public void empty() {
		garage.clear();
	}
		
	}
	
