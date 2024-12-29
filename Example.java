package com.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Example {
	private String name;
	@Id
	private int id;
	private int age;
	private String address;
	private long Number;
	private String AdharNu;
	
	public Example() {
		
	}

	public Example(String name, int id, int age, String address, long number, String adharNu) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
		Number = number;
		AdharNu = adharNu;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private long getNumber() {
		return Number;
	}

	private void setNumber(long number) {
		Number = number;
	}

	private String getAdharNu() {
		return AdharNu;
	}

	private void setAdharNu(String adharNu) {
		AdharNu = adharNu;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + ", Number=" + Number
				+ ", AdharNu=" + AdharNu + "]";
	}
	
	
}
