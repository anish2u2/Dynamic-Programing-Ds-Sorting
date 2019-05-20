/**
 * 
 */
package org.practice.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Anish Singh
 *
 */
public class AsynchronousTask {

	CompletableFuture<String> completableFuture = new CompletableFuture<String>();

	{
		completableFuture.supplyAsync((Supplier<String>) () -> {
			System.out.println("Completing 1");
			return "com";
		}).runAsync(new Runnable() {

			@Override
			public void run() {
			System.out.println("Printing..");

			}
		});
	}

}
