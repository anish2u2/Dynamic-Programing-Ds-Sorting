/**
 * 
 */
package org.practice.ds.structure;

/**
 * @author Anish Singh
 *
 */
public class StackImple<T> implements org.practice.ds.contracts.Stack<T> {

	private static final int INITIAL_CAPACITY = 10;

	private Object[] data = new Object[INITIAL_CAPACITY];

	private int size = -1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#push(java.lang.Object)
	 */
	@Override
	public void push(T data) {
		this.data[++size] = data;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#pop()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return (T) data[size--];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == -1 ? true : false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
