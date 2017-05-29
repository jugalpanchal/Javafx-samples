package com.jugalpanchal.javafxprototype.models;

public class CompanyModel extends BaseModel {

	private String name;

	public CompanyModel() {

	}

	public CompanyModel(long id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
