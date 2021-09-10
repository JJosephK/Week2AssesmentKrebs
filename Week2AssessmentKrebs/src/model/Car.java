package model;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Sep 9, 2021
 */
public class Car {
	private String name;
	private int age;
	private String color;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public Car() {
		super();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Car(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Car(String color) {
		this.color = color;
	}
}
