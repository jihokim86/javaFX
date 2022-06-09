package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			//stage > scene > container > node
					
			
			StackPane pane = new StackPane();
			Scene scene = new Scene(pane,300,500);
			stage.setScene(scene);
			stage.show();
			
			Label text = new Label();
			text.setText("hello javaFx"); //����ϱ�~~
			pane.getChildren().add(text); //����ϱ�~~
			//CSS ��Ʈ������ �� �� ����, ���߿��� �ܺ����Ϸ� ó���ؾ���
			text.setStyle("-fx-font-size:50; -fx-text-fill:red; -fx-background-color:yellow");
					
					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}