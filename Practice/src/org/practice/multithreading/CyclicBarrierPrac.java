/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Anish Singh
 *
 */
public class CyclicBarrierPrac implements Runnable {

	private CyclicBarrier barrier;

	/**
	 * 
	 */
	public CyclicBarrierPrac(CyclicBarrier barrier) {
		// TODO Auto-generated constructor stub
		this.barrier = barrier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
		System.out.println("Printing Thread " + Thread.currentThread().getName() + " started.");
		this.barrier.await();
		System.out.println("Printing Thread " + Thread.currentThread().getName() + " finished.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
