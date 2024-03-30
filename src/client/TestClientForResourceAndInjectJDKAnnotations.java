package client;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class TestClientForResourceAndInjectJDKAnnotations {
	

	public TestClientForResourceAndInjectJDKAnnotations() {
		
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring8.xml");
		Car car=(Car)cap.getBean("c");
		car.printData();

	}

}
