/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.CountDownLatch;

/**
 * @author Anish Singh
 *
 */
public class CountDownLatchPrac implements Runnable {

	private CountDownLatch latch;

	/**
	 * 
	 */
	public CountDownLatchPrac(CountDownLatch latch) {
		this.latch = latch;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Printing Thread " + Thread.currentThread().getName() + " started.");
		this.latch.countDown();
		System.out.println("Printing Thread " + Thread.currentThread().getName() + " finished.");
	}

}
