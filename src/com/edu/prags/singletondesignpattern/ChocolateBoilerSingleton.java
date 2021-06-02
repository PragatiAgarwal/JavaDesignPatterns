package com.edu.prags.singletondesignpattern;

public class ChocolateBoilerSingleton {

	//One and only one instance of the class
	private static ChocolateBoilerSingleton singleChocoInstance;
	
	private boolean empty;
	private boolean boiled;
	
	// Private Constructor ensures that the object cannot be instantiated outside the class
	
	private ChocolateBoilerSingleton() {
		
		this.empty = true;
		this.boiled = false;
	}
	
	//Global access to the object using static method
	
	public static ChocolateBoilerSingleton getInstance() {
		
		if(singleChocoInstance == null) {
			singleChocoInstance = new ChocolateBoilerSingleton();
		}
		
		return singleChocoInstance;
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
