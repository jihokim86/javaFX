package controller;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import model.Component;


public class BarChartController {
	
	@FXML private BarChart<String, Integer> barChar;
	@FXML private CategoryAxis xAxis;
	
	private ObservableList<String> firstCharacter = FXCollections.observableArrayList();
	
	@FXML
	private void initialize() {
		
		String[] charts = {"A","B","C","D","E","F","G","H",
							"I","J","K","L","M","N","O","P",
							 "Q","R","S","T","U","V","W","X","Y","Z"};
		
		firstCharacter.addAll(Arrays.asList(charts));
		System.out.println(firstCharacter);
		xAxis.setCategories(firstCharacter);
	}
	
	public void setComponentList(List<Component> componentList) {
		int[] counters = new int[26];
		for(Component component : componentList) {
			char character = component.getComponentCode().charAt(0);
			counters[character -65]++;
		}
		
		XYChart.Series<String, Integer> series = new XYChart.Series<>();
		System.out.println(counters.length);
		for (int i = 0; i < counters.length;i++) {
			series.getData().add(new XYChart.Data<>(firstCharacter.get(i) + "",counters[i]));
		}
		barChar.getData().addAll(series);
	}
}
