package application;
	

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//필요한것이 무엇일까?
			// node < container < scene < stage
			
			StackPane pane = new StackPane();
			Scene scene = new Scene(pane,300,300);
			stage.setScene(scene);
			stage.show();
			
			//글자,버튼을 사용하기 위한 객체 생성
			Label label = new Label();
			Button button = new Button();
			//컨테이너 메소드에 있는 것을 적용??하기 위해 chil.add
			pane.getChildren().addAll(label,button);
			
			//글씨를 넣어볼까?
			label.setText("test");
			//글씨 크기, 색, 배경색 조절
			label.setStyle("-fx-font-size:50");
//			label.setStyle("-fx-color-fill:red"); 한줄로 작성해야함
//			label.setStyle("-fx-background-color:yellow");
			
			//버튼을 넣어볼까?
			button.setText("add");
			button.setStyle("-fx-font-size:50");
			
			//레이블 및 버튼의 위치 조정은??
			pane.setAlignment(button, Pos.BOTTOM_CENTER);
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
