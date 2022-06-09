package application;
	

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			HBox hbox = new HBox();
			hbox.setPadding(new Insets(10));
			hbox.setSpacing(10);
			
			TextField textField = new TextField();
			textField.setPrefWidth(200);
			
			Button button = new Button();
			button.setText("Ȯ��");
			
			ObservableList list = hbox.getChildren(); 
			//hbox�� observableList ���
			list.add(textField); 	// textfield�� ��Ʈ�� ��ġ
			list.add(button);		// button�� ��Ʈ�� ��ġ
			
			Scene scene = new Scene(hbox);
			
			stage.setScene(scene);
			stage.show();
			stage.setTitle("AppMain");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}