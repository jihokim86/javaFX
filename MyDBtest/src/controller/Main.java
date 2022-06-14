package controller;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Component;
import model.ComponentDAO;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	
	@FXML private BorderPane rootLayout;
	@FXML private AnchorPane AnchorPane;
	
	private Stage primaryStage;
	
	private static final ObservableList<Component> componentList = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			ComMainController comMainController = new ComMainController();
			comMainController.setPrimaryStage(primaryStage);
			
			setRootLayout();
			setComMainView();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	//*********************setComMainView********************************
	public void setComMainView() {
		
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/ComMainView.fxml"));
			AnchorPane comMainView = (AnchorPane) loader.load();
			rootLayout.setCenter(comMainView);
			
			ComMainController controller = loader.getController();
			controller.setMain(this);
			
			ComponentDAO componentDAO = new ComponentDAO();
			ObservableList<Component> tempList = componentDAO.getComponentList();
			for(int i = 0; i < tempList.size(); i++) {
				componentList.add(tempList.get(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//********************* setRootLayout  ********************************
	public void setRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}//end of class



