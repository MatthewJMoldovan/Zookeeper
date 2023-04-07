package com.mattmoldovan.Zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.setEnergy(300);
	}
	
	public String fly() {
		this.setEnergy(getEnergy()-50);
		return("Quickly flaps wings and launches into the air");
	}
	
	public String eatHumans() {
		this.setEnergy(getEnergy()+25);
		return("Chows down on the slowest runner...Darwinism at its finest");
	}
	
	public String attackTown() {
		this.setEnergy(getEnergy()-100);
		return("Sets its target and goes in for the attack");
	}
	
	

}
