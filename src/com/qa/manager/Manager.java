package com.qa.manager;

import java.util.Scanner;

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
	
	public void input() {
		Scanner newInput = new Scanner(System.in);
		System.out.println("Which vehicle would you like to create?: car/bike/boat");
		String choice = newInput.nextLine();
		if (choice.equals("car")) {
			Scanner dInput = new Scanner(System.in);
			System.out.println("Please enter the ID: ");
			String id = dInput.nextLine();
//			dInput.close();
			Scanner cInput = new Scanner(System.in);
			System.out.println("Please enter the colour: ");
			String colour = cInput.nextLine();
//			cInput.close();
			Scanner esInput = new Scanner(System.in);
			System.out.println("Please enter the size of the engine: ");
			float engineSize = (float) esInput.nextFloat();
//			esInput.close();
			Scanner pInput = new Scanner(System.in);
			System.out.println("Is the car Preowned? y|n: ");
			String preowned = pInput.nextLine();
//			pInput.close();
			boolean isPreowned = false;
			if (preowned.equals("y")){
				isPreowned = true;
			}else {
				isPreowned = false;
			}
			Scanner aInput = new Scanner(System.in);
			System.out.println("How old is the car?: ");
			int age = aInput.nextInt();
//			aInput.close();
			Scanner tInput = new Scanner(System.in);
			System.out.println("Please enter it's top speed: ");
			int topSpeed = tInput.nextInt();
//			tInput.close();
			Scanner acInput = new Scanner(System.in);
			System.out.println("Please enter the accceleration: ");
			float acceleration = acInput.nextFloat();
//			acInput.close();
			Scanner vInput = new Scanner(System.in);
			System.out.println("Please enter it's value: ");
			int baseValue = vInput.nextInt();
//			vInput.close();
			Scanner ndInput = new Scanner(System.in);
			System.out.println("Please enter the number of doors: ");
			int numDoors = ndInput.nextInt();
//			ndInput.close();
			Scanner bInput = new Scanner(System.in);
			System.out.println("Please enter the boot volume: ");
			int bootSpace = bInput.nextInt();
//			bInput.close();
			Scanner swInput = new Scanner(System.in);
			System.out.println("does the car have seat warmers?: ");
			String seatwarmers = swInput.nextLine();
//			swInput.close();
			boolean hasSeatWarmers = false;
			if (seatwarmers.equals("y")){
				hasSeatWarmers = true;
			}else {
				hasSeatWarmers = false;
			}
			addToGarage(new Car(id, "car", colour, engineSize, isPreowned, age, topSpeed, acceleration,baseValue, numDoors, bootSpace, hasSeatWarmers));
			System.out.println("car created and added");
			readGarage();
			

			
			
			
		}else {
			System.out.println("error: only works for cars, please re-run this runner and type car");
		}
	}
	
}


