package basics;

import javax.swing.Spring;

public class Car implements Vehicle {
	Spring steering;

	public void drive() {
		System.out.println("car is driven");
	}

}
