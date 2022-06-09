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
			text.setText("hello javaFx"); //출력하기~~
			pane.getChildren().add(text); //출력하기~~
			//CSS 폰트사이즈 및 색 조정, 나중에는 외부파일로 처리해야함
			text.setStyle("-fx-font-size:50; -fx-text-fill:red; -fx-background-color:yellow");
					
					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
