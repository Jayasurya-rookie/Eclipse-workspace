package com.kodnestAggregate.cc;

public class airlines {
	String airname;
	pilot Pilot;
	public airlines(String airname,pilot Pilot) {
		this.Pilot=Pilot;
		this.airname=airname;
	}
	void operate() {
		System.out.println(airname+" operating");
		Pilot.fly();
	}

}
