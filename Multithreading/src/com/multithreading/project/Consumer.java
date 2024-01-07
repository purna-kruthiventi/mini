package com.multithreading.project;

public class Consumer implements Runnable {
private Example example;

public Consumer(Example example) {
	super();
	this.example = example;

  Thread th = new Thread(this,"consumer");
         th.start();
}
  public void run() {
	  try {
		  
	  
	 example.consume();
	  } catch(InterruptedException e) {
		  e.printStackTrace();
	  }
 }
	
	
}
