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
	
	public float fixDiff(String id) {
		float value = 0;
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getId() == id) {
				Vehicle vehicle = garage.get(i);
				String type = vehicle.getType();
					if(type == "car") {
						value = vehicle.calcValue() * 3 ;
					}else if (type == "motorbike") {
						value = vehicle.calcValue() * 0.8f;
					}else if (type == "speed boat") {
						value = vehicle.calcValue() * 10;
					}
				value = garage.get(i).calcValue();
				return value;
			}
			}
		return value;
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
	
	public float fixAll(String id) {
		float value = 0;
		for(int i = 0; i < garage.size(); i++ ) {
				value += garage.get(i).calcValue();
			}
		return value;
			}
	
	

	public void removeId(String id) {
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getId() == id) {
				garage.remove(i);
			}
			}
	}
	
	public void removeTypeAll(String type) {
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getType() == type) {
				garage.remove(i);
			}
			}
	}
	
	public void removeTypeSingle(String type) {
		for(int i = 0; i < garage.size(); i++ ) {
			if (garage.get(i).getType() == type) {
				garage.remove(i);
				break;
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
	
