/**
 * 
 */
package org.practice.ds.contracts;

/**
 * @author Anish Singh
 *
 */
public interface Stack<T> {

	void push(T data);

	T pop();

	boolean isEmpty();

	int size();

}
