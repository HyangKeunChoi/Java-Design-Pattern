package designpattern.chapter8.AbstractFactory.GTBike;

import designpattern.chapter8.AbstractFactory.abst.BikeFactory;
import designpattern.chapter8.AbstractFactory.abst.Body;
import designpattern.chapter8.AbstractFactory.abst.Wheel;

public class gtBikeFactory implements BikeFactory{

	@Override
	public Body createBody() {
		
		return new gtbody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new gtwheel();
	}

	
}
