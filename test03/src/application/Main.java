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
			
			Label label = new Label();		//���� �ֱ�
			Button button = new Button(); 	// ��ư �ֱ�
			
//			pane.getChildren().add(label); //�̰� ������ ��� �ȵ�
//			pane.getChildren().add(button);
			//getChildren()�޼ҵ�� �����̳ʿ��� �ڽ� �������(üũ�ڽ�,��ư��)�� �������µ� ���
			
			pane.getChildren().addAll(label,button); //�Ѳ����� �ֱ�
			
			
			//���ڳֱ� �� ��������
			button.setText("add");
			button.setStyle("-fx-font-size:15");
			label.setStyle("-fx-font-size:30");
			
			//��ư�ֱ�
//			label.setText(num); //type�� �߸��Ǽ� ������
			label.setText(Integer.toString(num)); //num�� String���� �ٲ��� �־��~
			//��ü�� �Լ��� ���鶧 ���ٽ��� �����, ��ȸ��
			button.setOnAction(e->{
				num++;
				label.setText(Integer.toString(num));
			});
			
			pane.setAlignment(button, Pos.BOTTOM_CENTER); //���ڿ� ��ư��ġ�� ��ġ�� ��ġ����
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	int num = 0 ; //���������� ���
	public static void main(String[] args) {
		launch(args);
	}
}