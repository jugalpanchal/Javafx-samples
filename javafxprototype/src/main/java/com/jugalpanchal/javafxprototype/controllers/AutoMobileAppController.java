package com.jugalpanchal.javafxprototype.controllers;

import java.util.ArrayList;
import java.util.List;

import com.jugalpanchal.javafxprototype.models.CompanyModel;
import com.jugalpanchal.javafxprototype.models.VariantModel;

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
	private List<CompanyModel> companies = new ArrayList<>();
	
	@FXML	
	private ComboBox<CompanyModel> cbCompanies;
	
	@FXML
	private TableView<VariantModel> tvVariants;
	
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
		
		cbCompanies.setCellFactory(new Callback<ListView<CompanyModel>, ListCell<CompanyModel>>() {
			
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
	}
	
	@FXML
	private void addVariant() {
		ObservableList<VariantModel> data = tvVariants.getItems();
        data.add(new VariantModel(107L,"Unknow"));
	}
}
