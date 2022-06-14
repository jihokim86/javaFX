package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Component;


public class ComDataController {
	
	private Component component;
	private Stage dialogStage;
	private int ReturnValue;
	
	@FXML private TextField cnameField;
	@FXML private TextField cnumberField;
	@FXML private TextField ccountField;
	@FXML private TextField clocField;
	@FXML private Button btn1;
	
	@FXML
	private void confirmAction() {
		if(valid()) {
			component.setComponentName(cnameField.getText());
			component.setComponentCode(cnumberField.getText());
			component.setComponentCount(Integer.valueOf(ccountField.getText()));
			component.setComponentPlace(clocField.getText());
			
			ReturnValue = 1;
			dialogStage.close();
		}
	}
	
	@FXML
	private void censerAction() {
		dialogStage.close();
	}
	
	private boolean valid() {
		String errorMessge = "";
		if( cnameField.getText() == null || cnameField.getText().equals("")) {
			errorMessge += "부품 이름을 입력하세요. \n";
		}
		if( cnumberField.getText() == null || cnumberField.getText().equals("")) {
			errorMessge += "부품 코드을 입력하세요. \n";
		}
		if( ccountField.getText() == null || ccountField.getText().equals("")) {
			errorMessge += "수량을 입력하세요. \n";
		}
		if( clocField.getText() == null || clocField.getText().equals("")) {
			errorMessge += "위치를 입력하세요. \n";
		}
		if( errorMessge.equals("")) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(dialogStage);
			alert.setTitle("오류 메시지");
			alert.setHeaderText("값을 제대로 입력하세요.");
			alert.setContentText(errorMessge);
			alert.showAndWait();
			return false;
		}
	}
	
	public Component getComponent() {
		return component;
	}
	public void setComponent(Component component) {
		this.component = component;
		cnameField.setText(component.getComponentName());
		cnumberField.setText(component.getComponentCode());
		ccountField.setText(String.valueOf(component.getComponentCount()));
		clocField.setText(component.getComponentPlace());

	}

	public Stage getDialogStage() {
		return dialogStage;
	}
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	public int getReturnValue() {
		return ReturnValue;
	}
	public void setReturnValue(int returnValue) {
		ReturnValue = returnValue;
	}
	

}
