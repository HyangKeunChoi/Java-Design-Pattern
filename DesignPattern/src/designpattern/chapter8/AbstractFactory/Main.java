package designpattern.chapter8.AbstractFactory;

import designpattern.chapter8.AbstractFactory.GTBike.gtBikeFactory;
import designpattern.chapter8.AbstractFactory.Samchuly.SamFactory;
import designpattern.chapter8.AbstractFactory.abst.BikeFactory;
import designpattern.chapter8.AbstractFactory.abst.Body;
import designpattern.chapter8.AbstractFactory.abst.Wheel;

public class Main {
	
	public static void main(String[] args) {
		
		BikeFactory factory = new SamFactory();
		BikeFactory factory2 = new gtBikeFactory();
		
		
		// -------------------------------- 
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
		
		// --------------------------------
		
		Body body2 = factory2.createBody();
		Wheel wheel2 = factory2.createWheel();
		
		System.out.println(body2.getClass());
		System.out.println(wheel2.getClass());
		
		
		
	}
}
