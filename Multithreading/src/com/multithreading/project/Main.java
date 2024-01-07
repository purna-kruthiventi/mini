package com.multithreading.project;

public class Main {

	public static void main(String[] args) {
		Example example = new Example();
		
		new Producer(example);
		new Consumer(example);
		

	}

}
