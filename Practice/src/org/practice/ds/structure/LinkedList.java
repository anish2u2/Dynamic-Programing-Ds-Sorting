/**
 * 
 */
package org.practice.ds.structure;

/**
 * @author Anish Singh
 *
 */
public class LinkedList<T> {

	private T nodeValue;

	private LinkedList<T> nextNode;

	/**
	 * 
	 */
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public LinkedList(T data) {
		this.nodeValue = data;
	}

	public T getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(T nodeValue) {
		this.nodeValue = nodeValue;
	}

	public LinkedList<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedList<T> nextNode) {
		this.nextNode = nextNode;
	}

}
