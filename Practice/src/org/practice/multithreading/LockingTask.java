/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Anish Singh
 *
 */
public class LockingTask implements Runnable {

	private ReentrantReadWriteLock.ReadLock readLock;
	//private ReentrantReadWriteLock.WriteLock writeLock;

	/**
	 * 
	 */
	public LockingTask(ReentrantReadWriteLock.ReadLock readLock) {
		// TODO Auto-generated constructor stub
		this.readLock = readLock;
		//this.writeLock = writeLock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		readLock.lock();
		System.out.println("Lock acquired by " + Thread.currentThread().getName());
		readLock.unlock();
	}

}
