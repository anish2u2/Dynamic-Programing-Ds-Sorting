/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Anish Singh
 *
 */
public class WriterTask implements Runnable {

	private ReentrantReadWriteLock.WriteLock writerLock;

	/**
	 * 
	 */
	public WriterTask(ReentrantReadWriteLock.WriteLock writerLock) {
		// TODO Auto-generated constructor stub
		this.writerLock = writerLock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		writerLock.lock();
		System.out.println("writer lock " + Thread.currentThread().getName());
		writerLock.unlock();
	}

}
