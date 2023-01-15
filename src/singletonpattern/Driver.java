package singletonpattern;

public class Driver {

	public static void main (String [] args) {
		
			
		
		  Thread t1 = new Thread(new Runnable() {
		  
		  @Override public void run() { 
		  
			  ChocolateBoilerSingleton.getInstance().fill();
		  } });
		  
		  
		  Thread t2 = new Thread(new Runnable() {
		  
		  @Override public void run() { 
			  ChocolateBoilerSingleton.getInstance().fill();
		  } });
		  
		  t1.start(); t2.start();
		 	
		
//		ChocolateBoiler obj = new ChocolateBoiler();
//		ChocolateBoiler obj1 = new ChocolateBoiler();
//		
		// https://stackoverflow.com/questions/30684579/whats-wrong-when-not-using-singleton-pattern
		
//		obj.fill();
//		obj1.boil();
//		obj1.fill();
//		obj.drain();
//		obj.boil();
//		obj1.drain();
		
	}

}
