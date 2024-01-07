package com.multithreading.project;
import java.util.LinkedList;

public class Example {
		LinkedList<Integer> list = new LinkedList<>();
		int capacity=3;
		public synchronized void produce() throws InterruptedException{
			 int value=0;
			
			while(true) {
				synchronized(this) {
					while(list.size()== capacity) 
						wait();
					System.out.println("producer"+value);
					
					list.add(value++);
					notify();
					Thread.sleep(1000);
						
				}
			}
			
		}
		public synchronized void consume() throws InterruptedException{
			
			while(true) {
				synchronized(this) {
					while(list.size()==0) 
						
					wait();
				int first=	list.removeFirst();
					System.out.println("consumer"+first);
					
					notify();
					Thread.sleep(1000);
				}
			}
			
		}
	}

