/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.Phaser;

/**
 * @author Anish Singh
 *
 */
public class PhaserPrac implements Runnable{
	
	private Phaser phaser;
	
	/**
	 * 
	 */
	public PhaserPrac(Phaser phaser) {
		// TODO Auto-generated constructor stub
		this.phaser=phaser;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		System.out.println("Printing Thread " + Thread.currentThread().getName() + " started.");
		this.phaser.arriveAndAwaitAdvance();
		System.out.println("Printing Thread " + Thread.currentThread().getName() + " finished.");
		
	}

}
