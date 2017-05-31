package com.jugalpanchal.javafxprototype.models;

public class VariantModel extends BaseModel {
	private String name;

	public VariantModel() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public VariantModel(long id, String name) {
		this.setId(id);
		this.setName(name);
	}
}
