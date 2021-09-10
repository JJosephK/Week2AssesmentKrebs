package test;
import model.Car;
import model.CarDisposal;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Sep 9, 2021
 */
public class DisposalTest {
	Car car = new Car();
	CarDisposal carDisposal = new CarDisposal();
	@Before 
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testBooleanEquals() {
		car.setAge(30);
		
		boolean value = carDisposal.toDisposeOf(car);
		assertEquals(false, value);
	}
	
	@Test
	public void testBooleanTrue() {
		car.setAge(41);
		assertTrue(carDisposal.toDisposeOf(car));
		
	}
	
	
	

}
