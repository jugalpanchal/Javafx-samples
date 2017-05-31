package com.jugalpanchal.javafxprototype.models;

public class CarModel extends BaseModel {
	
	private String name;

	public CarModel() {
		super();
	}

	public CarModel(long id, String name) {
		super(id);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
