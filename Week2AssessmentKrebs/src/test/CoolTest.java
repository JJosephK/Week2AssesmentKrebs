package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.CarColorTest;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Sep 9, 2021
 */
public class CoolTest {
	Car car = new Car();
	CarColorTest colorTest = new CarColorTest();
	@Before 
	public void setUp() throws Exception{
		
	}
	//Tests if string is correct
	@Test
	public void testCoolEquals() {
		car.setColor("Red");
		String value = colorTest.isCool(car);
		assertEquals("This car is cool.", value);
		
	}
	//Tests if boolean is correct
	@Test
	public void testCoolNotEquals() {
		car.setColor("blue");
		assertFalse(colorTest.coolBool(car));
	}


}
