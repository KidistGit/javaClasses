package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Create a Car class that will have variables, methods and constructor
// Cerate a map that will hold Ca number and car objects store in it
class Car {
	String make, model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;

	}

	public void display() {
		System.out.println(make + "" + model);
	}
}

public class CarTest {

	public static void main(String[] args) {
		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "XS"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "Mkc"));

		System.out.println(mapCar.size());
		// display only value objects
		Collection<Car> coll = mapCar.values();
		for (Car c : coll) {
			System.out.println(c.make + "---" + c.model);
			c.display();
		}

		// Map key to its corresponding values(enterySet or keySet)
		Set<Entry<Integer, Car>> set = mapCar.entrySet();
		for (Entry<Integer, Car> ent : set) {
			Integer i = ent.getKey();
			Car c = ent.getValue();
			System.out.println("Key " + i + " is associated with value of  " + c.make);

		}
		// using keySet to map keys to values(entrySet or ValueSet)
		Set<Integer> keySet = mapCar.keySet();
		for (int key : keySet) {
			// Integer+map object--->value object(Car type)
			// System.out.println(key + mapCar.get(key).make + mapCar.get(key).model);
			Car car = mapCar.get(key);
			String carDetails = car.make + "_" + car.model;
			System.out.println(key + "=" + carDetails);
		}
		// use iterator
		Iterator<Entry<Integer, Car>> i = set.iterator();
		while (i.hasNext()) {
			Entry<Integer, Car> ent = i.next();
			System.out.println(ent.getKey() + "---" + ent.getValue().make + " " + ent.getValue().model);
		}
	}
}
