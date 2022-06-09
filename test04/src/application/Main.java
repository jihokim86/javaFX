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
			//�ʿ��Ѱ��� �����ϱ�?
			// node < container < scene < stage
			
			StackPane pane = new StackPane();
			Scene scene = new Scene(pane,300,300);
			stage.setScene(scene);
			stage.show();
			
			//����,��ư�� ����ϱ� ���� ��ü ����
			Label label = new Label();
			Button button = new Button();
			//�����̳� �޼ҵ忡 �ִ� ���� ����??�ϱ� ���� chil.add
			pane.getChildren().addAll(label,button);
			
			//�۾��� �־��?
			label.setText("test");
			//�۾� ũ��, ��, ���� ����
			label.setStyle("-fx-font-size:50");
//			label.setStyle("-fx-color-fill:red"); ���ٷ� �ۼ��ؾ���
//			label.setStyle("-fx-background-color:yellow");
			
			//��ư�� �־��?
			button.setText("add");
			button.setStyle("-fx-font-size:50");
			
			//���̺� �� ��ư�� ��ġ ������??
			pane.setAlignment(button, Pos.BOTTOM_CENTER);
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}