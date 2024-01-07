package com.multithreading.project;

public class Producer implements Runnable {

	private Example example;

	public Producer(Example example) {
		super();
		this.example = example;
	
	Thread th = new Thread(this,"Producer");
	th.start();
}

  public void run() {
	  try {
		  
	  
	  example.produce();
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
  }
}