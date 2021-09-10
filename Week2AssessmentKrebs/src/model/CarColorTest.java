package model;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Sep 9, 2021
 */
public class CarColorTest {
	public String isCool(Car car) {
		String coolStatus;
		if (car.getColor() == "Red") {
			coolStatus = "This car is cool.";
		}else {
			coolStatus = "This car is not cool.";
		}
		return coolStatus;
	}
	
	public boolean coolBool(Car car) {
		boolean cool;
		if (car.getColor() == "Red") {
			cool = true;
		}else {
			cool = false;
		}
		return cool;
	}
}
