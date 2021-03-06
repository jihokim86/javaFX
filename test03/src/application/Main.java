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
			
			//stage > scene > container > node
			
			StackPane pane = new StackPane(); // container
			Scene scene = new Scene(pane,300,300);
			stage.setScene(scene);
			stage.show();
			
			stage.setTitle("add program");
			stage.setResizable(false);
			
			Label label = new Label();		//글자 넣기
			Button button = new Button(); 	// 버튼 넣기
			
//			pane.getChildren().add(label); //이거 없으면 출력 안됨
//			pane.getChildren().add(button);
			//getChildren()메소드는 컨테이너에서 자식 구성요소(체크박스,버튼등)을 가져오는데 사용
			
			pane.getChildren().addAll(label,button); //한꺼번에 넣기
			
			
			//글자넣기 및 글자조절
			button.setText("add");
			button.setStyle("-fx-font-size:15");
			label.setStyle("-fx-font-size:30");
			
			//버튼넣기
//			label.setText(num); //type이 잘못되서 오류남
			label.setText(Integer.toString(num)); //num을 String으로 바꺼서 넣어라~
			//객체를 함수로 만들때 람다식을 사용함, 일회성
			button.setOnAction(e->{
				num++;
				label.setText(Integer.toString(num));
			});
			
			pane.setAlignment(button, Pos.BOTTOM_CENTER); //글자와 버튼위치가 겹치니 위치조정
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	int num = 0 ; //전역변수로 사용
	public static void main(String[] args) {
		launch(args);
	}
}
