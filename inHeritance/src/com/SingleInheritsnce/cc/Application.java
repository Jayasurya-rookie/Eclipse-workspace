package com.SingleInheritsnce.cc;

public class Application {

	public static void main(String[] args) {
		Bot  dadbot = new Bot();
		
		System.out.println(dadbot.price);
//		dadbot.read();
//		dadbot.write();
//		
		
		ChildBot sonbot = new ChildBot();
		System.out.println(sonbot.model);
		sonbot.teaching();
		sonbot.write();//son bot accessing parents bot
		sonbot.read();
		
		// TODO Auto-generated method stub

	}

}
