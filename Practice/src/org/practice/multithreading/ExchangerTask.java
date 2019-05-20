/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.Exchanger;

/**
 * @author Anish Singh
 *
 */
public class ExchangerTask implements Runnable {

	private Exchanger<String> exchnager;

	/**
	 * 
	 */
	public ExchangerTask(Exchanger<String> exchanger) {
		// TODO Auto-generated constructor stub
		this.exchnager = exchanger;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
		System.out.println(Thread.currentThread().getName()+" "+exchnager.exchange("Hi "));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
