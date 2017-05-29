package com.jugalpanchal.javafxprototype.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FooterController extends BaseController {

	@FXML
	Label lblStatus;
	
	public FooterController() {
		
	}
	
	@FXML
	private void initialize() {
		lblStatus.setText("OK");
	}
}
