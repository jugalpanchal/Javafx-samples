package com.jugalpanchal.javafxprototype.models;

public class VariantModel extends BaseModel {
	
	private String name;

	public VariantModel() {
		super();
	}

	public VariantModel(long id, String name) {
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
