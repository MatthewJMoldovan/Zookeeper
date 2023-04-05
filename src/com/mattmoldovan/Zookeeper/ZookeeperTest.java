package com.mattmoldovan.Zookeeper;

public class ZookeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla harambe = new Gorilla();
		
		System.out.println(harambe.throwObject());
		System.out.println(harambe.throwObject());
		System.out.println(harambe.throwObject());
		System.out.println(harambe.eatBananas());
		System.out.println(harambe.eatBananas());
		System.out.println(harambe.useClimb());
		System.out.println(harambe.displayEnergy());
		
		
		Bat manBat = new Bat();
		
		System.out.println(manBat.attackTown());
		System.out.println(manBat.attackTown());
		System.out.println(manBat.attackTown());
		System.out.println(manBat.eatHumans());
		System.out.println(manBat.eatHumans());
		System.out.println(manBat.fly());
		System.out.println(manBat.displayEnergy());
	}

}
