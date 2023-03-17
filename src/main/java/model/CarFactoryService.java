package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*<bean id = "cfs01" class = "model.CarFactoryService">
<property name = "name" value = "MyFactory"/>
<property name = "address" value = "fremont"/>
 <property name = "car" ref = "car01"/>      
<property name = "employee" ref = "emp01"/>

</bean> */

@Service
public class CarFactoryService { 
	
	String name="MyFactory";
	String address="fremont";
	
	@Autowired //By Type
	Car carr;
	
	@Autowired
	@Qualifier("myEmployee") //By Name
	Employee employeee;
	
	
	public CarFactoryService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CarFactoryService(String name, String address, Car carr, Employee employeee) {
		super();
		this.name = name;
		this.address = address;
		this.carr = carr;
		this.employeee = employeee;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Car getCarr() {
		return carr;
	}


	public void setCarr(Car carr) {
		this.carr = carr;
	}


	public Employee getEmployeee() {
		return employeee;
	}


	public void setEmployeee(Employee employeee) {
		this.employeee = employeee;
	}


	@Override
	public String toString() {
		return "CarFactoryService [name=" + name + ", address=" + address + ", carr=" + carr + ", employeee="
				+ employeee + "]";
	}
	
	
	
	
	

}
