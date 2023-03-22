package com.sample.mavenDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle obj = (Vehicle)context.getBean("car"); 
    	// getBean will give the object of the object(obj) so typecast to vehicle
    	//applicationcontext will give the object of vehicle but it doesnt know what vehicle is that
    	// to do that create a xml file => mention which object u need whenever u call a vehicle
    	obj.drive();
    }
}
