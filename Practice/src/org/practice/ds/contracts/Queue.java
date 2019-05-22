/**
 * 
 */
package org.practice.ds.contracts;

/**
 * @author Anish Singh
 *
 */
public interface Queue<T extends Object> {
	
	void offer(T data);
	
	T poll();
	
	boolean isEmpty();
	
}
