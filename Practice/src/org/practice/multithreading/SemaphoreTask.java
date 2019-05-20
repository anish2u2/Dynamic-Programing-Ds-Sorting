/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.Semaphore;

/**
 * @author Anish Singh
 *
 */
public class SemaphoreTask implements Runnable {

	private Semaphore semaphore;

	/**
	 * 
	 */
	public SemaphoreTask(Semaphore semaphore) {
		// TODO Auto-generated constructor stub
		this.semaphore = semaphore;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Trying to acquire lock " + Thread.currentThread().getName());
		semaphore.acquireUninterruptibly();
		System.out.println("Lock acquired by " + Thread.currentThread().getName());
		semaphore.release();
	}

}
