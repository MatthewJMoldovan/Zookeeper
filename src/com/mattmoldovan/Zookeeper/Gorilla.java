package com.mattmoldovan.Zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	
	public String throwObject() {
		this.setEnergy(getEnergy()-5);
		return ("Flings something gross at you");
	}

	public String eatBananas() {
		this.setEnergy(getEnergy()+10);
		return("Chows down on a ripe nana");	
	}
	
	public String useClimb() {
		this.setEnergy(getEnergy()-10);
		return("Quickly climbs to the top like King Kong");
	}

}
