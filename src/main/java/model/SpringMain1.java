package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain1 {

	public static void main(String[] args) {
	
		
		//creates Spring container
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("carFactoryService.xml");
				
			
		
				CarFactoryService carFactoryService=(CarFactoryService)applicationContext.getBean("carFactoryService");
				
				System.out.println(carFactoryService);
				
			
		
			
	}

}
