package com.qa.runner;

import com.qa.manager.Manager;

public class Runner {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
	
		manager.createGarage();
		
		manager.input();
		
		System.out.println("");
		
		manager.addToGarage(manager.createCar("id-1", "car", "red", 1.2f, false, 8, 90, 2.5f, 500, 5, 20, false));
		manager.addToGarage(manager.createCar("id-2", "car", "blue", 1.6f, false, 8, 90, 2.5f, 600, 5, 20, true));
		manager.addToGarage(manager.createMotorbike("id-3", "motorbike", "yellow", 0.6f, true, 8, 90, 2.5f, 800, 2, true, false));
		manager.addToGarage(manager.createBoat("id-4", "boat", "whit", 1.8f, false, 8, 90, 2.5f, 2000, 1, "X23-4"));
		
		manager.readGarage();
		
		System.out.println("");
		
		manager.readGarage(1);

		System.out.println("");
		
		manager.removeGarage(1);
		
		System.out.println("");
		
		manager.readGarage();
		
		System.out.println("");
		
		manager.replaceGarage(0, manager.createMotorbike("id-8", "motorbike", "grey", 0.6f, false, 8, 90, 2.5f, 500, 2, true, false));
		
		System.out.println("");
		
		manager.readGarage();
		
		System.out.println("");
		
		manager.fixGarage(2);

		System.out.println("");
		
		manager.readGarage();
		
		System.out.println("");
		
		manager.fixGarageAll();
		
		System.out.println("");
		
		manager.calcTypeGarage();
		
		System.out.println("");
		
		manager.readGarage();
		
		System.out.println("");
		
		manager.removeTypeGarage("Motorbike");
		
		System.out.println("");
		
		manager.readGarage();
		
		
	}

}
