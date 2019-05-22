/**
 * 
 */
package org.practice.ds.structure;

/**
 * @author Anish Singh
 * @param <T>
 *
 */
public class QueueImple<T> implements org.practice.ds.contracts.Queue<T> {

	LinkedList<T> list;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.Queue#offer(java.lang.Object)
	 */
	@Override
	public void offer(T data) {

		if (list == null) {
			list = new LinkedList<T>();
			list.setNodeValue(data);
			return;
		} else if (list.getNextNode() == null) {
			LinkedList<T> newNode = new LinkedList<T>();
			newNode.setNodeValue(data);
			list.setNextNode(newNode);
			return;
		}
		LinkedList<T> node = null, temp = null;
		while ((node = list.getNextNode()) != null) {
			temp = node;
		}
		LinkedList<T> newNode = new LinkedList<T>();
		newNode.setNodeValue(data);
		temp.setNextNode(newNode);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.Queue#poll()
	 */
	@Override
	public T poll() {
		T nodeValue = list.getNodeValue();
		list = list.getNextNode();
		return nodeValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.Queue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return list == null ? true : false;
	}

}
