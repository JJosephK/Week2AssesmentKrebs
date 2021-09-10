package model;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Sep 9, 2021
 */
public class CarDisposal {

	public  boolean toDisposeOf(Car car) {
		boolean disposable;
		if (car.getAge() > 40) {
			disposable = true;
		}else {
			disposable = false;
		}
		return disposable;
	}
}
