package com.edu.prags.singletondesignpattern;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public boolean isEmpty() {
		return this.empty;
	}
	
	public boolean isBoiled() {
		return this.boiled;
	}
	
	public void fill () {
		if(isEmpty() && !isBoiled()) {
			System.out.println("Fill the boiler");
			this.empty = false;
			this.boiled = false;
		}
		else {
			System.out.println("Cannot fill");
		}
	}
	
	public void boil () {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("Boil the mixture");
			this.boiled = true;
		}
		else {
			System.out.println("Cannot boil");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("drain the mixture");
			this.empty = true;
			this.boiled = false;
		}
		else {
			System.out.println("Cannot drain");
		}
	}

}
