package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//stage > scene > container > node
			
			StackPane pane = new StackPane(); // container
			Scene scene = new Scene(pane,150,150);
			stage.setScene(scene);
			stage.show();
			
			Label label = new Label();
			pane.getChildren().add(label); //이거 없으면 출력 안됨
			//getChildren()메소드는 컨테이너에서 자식 구성요소(체크박스,버튼등)을 가져오는데 사용
			//기본값은 중앙 배치임~ 변경해보자
											
			label.setText("test"); //기본값은 중앙 배치
			pane.setAlignment(label, Pos.TOP_CENTER); //상단 중앙 배치
			label.setStyle("-fx-font-size:30");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
