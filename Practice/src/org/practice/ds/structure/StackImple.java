/**
 * 
 */
package org.practice.ds.structure;

/**
 * @author Anish Singh
 *
 */
public class StackImple<T> implements org.practice.ds.contracts.Stack<T> {

	private int initialCapacity = 10;

	private double loadFactor = 0.75;

	private Object[] data = new Object[initialCapacity];

	private int size = -1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#push(java.lang.Object)
	 */
	@Override
	public void push(T data) {
		if (++size == initialCapacity) {
			Object[] array = new Object[(int) (initialCapacity * loadFactor)];
			System.arraycopy(this.data, 0, array, 0, this.data.length);
			this.data = array;
		}
		this.data[size] = data;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#pop()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if (size == -1) {
			new RuntimeException("Stack underflow.");
		}
		T result = (T) data[size];
		data[size--] = null;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.StackI#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size <= -1 ? true : false;
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
