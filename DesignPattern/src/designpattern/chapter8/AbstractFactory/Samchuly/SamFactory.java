package designpattern.chapter8.AbstractFactory.Samchuly;

import designpattern.chapter8.AbstractFactory.abst.BikeFactory;
import designpattern.chapter8.AbstractFactory.abst.Body;
import designpattern.chapter8.AbstractFactory.abst.Wheel;

public class SamFactory implements  BikeFactory{

	@Override
	public Body createBody() {
		
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
