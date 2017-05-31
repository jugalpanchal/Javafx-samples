package com.jugalpanchal.javafxprototype.controllers;

import java.util.ArrayList;
import java.util.List;

import com.jugalpanchal.javafxprototype.models.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class AutoMobileAppController extends BaseController {

	@FXML
	private FooterController footerController;
	
	@FXML	
	private ComboBox<CompanyModel> cbCompanies;
	
	@FXML	
	private ComboBox<CarModel> cbCars;
	
	@FXML
	private TableView<VariantModel> tvVariants;
	
	public AutoMobileAppController() {
		super();
	}
	
	@FXML
	private void initialize() {
	
		//Mock Data.
		List<CompanyModel> companies = new ArrayList<>();
		companies.add(new CompanyModel(101, "Honda"));
		companies.add(new CompanyModel(102, "Toyota"));
		companies.add(new CompanyModel(103, "Nissan"));
		companies.add(new CompanyModel(104, "BMW"));
		
		this.cbCompanies.setItems(FXCollections.observableList(companies));
		
		this.cbCompanies.setCellFactory(new Callback<ListView<CompanyModel>, ListCell<CompanyModel>>() {
			
			@Override
			public ListCell<CompanyModel> call(ListView<CompanyModel> param) {
				return new ListCell<CompanyModel>() {
					
					@Override
					protected void updateItem(CompanyModel item, boolean empty) {
						super.updateItem(item, empty);
						if (item == null || empty) {
		                    setGraphic(null);
		                } else {
		                    setText(item.getName());
		                }
					}
				};
			}
		});
		
		this.cbCompanies.getSelectionModel().selectFirst();
		this.cbCars.getSelectionModel().selectFirst();
	}
	
	@FXML
	private void selectedCompany(ActionEvent companyEvent) {
		System.out.println("selected Company");
	}
	
	@FXML	
	private void selectedCar(ActionEvent carEvent) {
		System.out.println("selected Car");
	}
	
	@FXML
	private void addVariant() {
		ObservableList<VariantModel> variants = this.tvVariants.getItems();
		variants.add(new VariantModel(105L,"LX"));
	}
}
