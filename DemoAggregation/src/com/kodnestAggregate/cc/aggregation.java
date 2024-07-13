package com.kodnestAggregate.cc;

public class aggregation {

	public static void main(String[] args) {
		pilot pil = new pilot("john");
		airlines air = new airlines("indigo",pil);
		//air.operate();
		
		air=null;
		pil.fly();
	


	}

}
