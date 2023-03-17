package model;

import org.springframework.stereotype.Service;

/*<bean id = "emp01" class = "model.Employee" >
<property name = "name" value = "soojan"/>
<property name = "age" value = "20"/>

</bean>    */

@Service("myEmployee")
public class Employee {
	
	String name="soojan";
	int age=20;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
