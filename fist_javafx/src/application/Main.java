package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//stage > scene > container > node
			
									//node는 어디감??
			Pane pane = new Pane(); //pane 이라는 container
					
			Scene scene = new Scene(pane,300,500);
			
			stage.setScene(scene);
			
			stage.show();
			stage.setTitle("My window");
			stage.setResizable(false);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
