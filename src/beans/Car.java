package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Inject @Qualifier(value="e1")
	private Engine engine;

	
	public void printData()
	{
		System.out.println("Inside Car, printData():"+engine.getEngineName());
	}

}
