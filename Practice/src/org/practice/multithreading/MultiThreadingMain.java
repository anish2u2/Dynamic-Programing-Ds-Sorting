/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Anish Singh
 *
 */
public class MultiThreadingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(4);
		/*
		 * CountDownLatch latch=new CountDownLatch(4); service.submit(new
		 * CountDownLatchPrac(latch)); service.submit(new CountDownLatchPrac(latch));
		 * service.submit(new CountDownLatchPrac(latch)); service.submit(new
		 * CountDownLatchPrac(latch)); latch.await();
		 */

		/*
		 * CyclicBarrier barrier = new CyclicBarrier(4); service.submit(new
		 * CyclicBarrierPrac(barrier)); service.submit(new CyclicBarrierPrac(barrier));
		 * service.submit(new CyclicBarrierPrac(barrier)); service.submit(new
		 * CyclicBarrierPrac(barrier));
		 */

		/*
		 * Phaser phaser=new Phaser(4); service.submit(new PhaserPrac(phaser));
		 * service.submit(new PhaserPrac(phaser)); service.submit(new
		 * PhaserPrac(phaser)); service.submit(new PhaserPrac(phaser));
		 * phaser.register(); System.out.println("Starting main.");
		 * phaser.arriveAndAwaitAdvance(); System.out.println("Finishing Main.");
		 * 
		 * AsynchronousTask task=new AsynchronousTask();
		 */
		/*
		 * Lock lock=new ReentrantLock(); ReentrantReadWriteLock reentrantLock=new
		 * ReentrantReadWriteLock(); ReentrantReadWriteLock.ReadLock
		 * readLock=reentrantLock.readLock(); ReentrantReadWriteLock.WriteLock
		 * writeLock=reentrantLock.writeLock(); service.execute(new
		 * LockingTask(readLock)); service.execute(new LockingTask(readLock));
		 * service.execute(new WriterTask(writeLock)); service.execute(new
		 * WriterTask(writeLock));
		 */
		/*
		 * Semaphore semaphore=new Semaphore(2); service.execute(new
		 * SemaphoreTask(semaphore)); service.execute(new SemaphoreTask(semaphore));
		 * service.execute(new SemaphoreTask(semaphore)); service.execute(new
		 * SemaphoreTask(semaphore)); service.execute(new SemaphoreTask(semaphore));
		 */
		Exchanger<String> exchanger = new Exchanger<String>();
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.execute(new ExchangerTask(exchanger));
		service.shutdown();
	}

}
