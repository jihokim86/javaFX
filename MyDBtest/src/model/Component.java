package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Component {

	private final StringProperty componentName;
	private final StringProperty componentCode;
	private final IntegerProperty componentCount;
	private final StringProperty componentPlace;
	
	public String getComponentName() {
		return componentName.get();
	}


	public void setComponentName(String componentName) {
		this.componentName.set(componentName);;
	}


	public String getComponentCode() {
		return componentCode.get();
	}


	public void setComponentCode(String componentCode) {
		this.componentCode.set(componentCode);
	}


	public int getComponentCount() {
		return componentCount.get();
	}


	public void setComponentCount(int componentCount) {
		this.componentCount.set(componentCount);
	}


	public String getComponentPlace() {
		return componentPlace.get();
	}


	public void setComponentPlace(String componentPlace) {
		this.componentPlace.set(componentPlace);
	}
	
	public StringProperty comNameProperty() {
		return componentName;
	}
	
	public StringProperty comCodeProperty() {
		return componentCode;
	}	
	
	public IntegerProperty comCountProperty() {
		return componentCount;
	}	
	
	public StringProperty comPlaceProperty() {
		return componentPlace;
	}
	
	public Component(String componentName, String componentCode, Integer componentCount,String componentPlace) {
		this.componentName = new SimpleStringProperty(componentName);
		this.componentCode = new SimpleStringProperty(componentCode);
		this.componentCount = new SimpleIntegerProperty(componentCount);
		this.componentPlace = new SimpleStringProperty(componentPlace);
	}
	
	

	
}
