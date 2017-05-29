package com.jugalpanchal.javafxprototype.controllers;

import java.util.ArrayList;
import java.util.List;

import com.jugalpanchal.javafxprototype.models.CompanyModel;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class AutoMobileAppController extends BaseController {

	@FXML
	private List<CompanyModel> companies = new ArrayList<>();
	
	@FXML	
	private ComboBox<CompanyModel> cbCompanies;
	
	public AutoMobileAppController() {
		super();
		
		companies.add(new CompanyModel(101, "Honda"));
		companies.add(new CompanyModel(102, "Toyota"));
		companies.add(new CompanyModel(103, "Nissan"));
		companies.add(new CompanyModel(104, "BMW"));
	
	}
	
	@FXML
	private void initialize() {
		
		cbCompanies.setItems(FXCollections.observableList(companies));
	}
}
