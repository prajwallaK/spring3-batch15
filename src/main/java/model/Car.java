package model;

import org.springframework.stereotype.Service;

/*<bean id = "car01" class = "model.Car" >
<property name = "name" value = "BMW"/>
<property name = "model" value = "M001"/>
<property name = "price" value = "300"/>
</bean>*/
@Service
public class Car {
	
	String name="BMW";
	String model="M001"; 
	String price="300";
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String model, String price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
	

}
