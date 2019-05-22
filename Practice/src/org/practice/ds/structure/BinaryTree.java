/**
 * 
 */
package org.practice.ds.structure;

import java.util.Comparator;

/**
 * @author Anish Singh
 *
 */
public class BinaryTree<T> {

	private BinaryTree<T> leftBinaryTree;
	private BinaryTree<T> rightBinaryTree;

	private T value;

	/**
	 * 
	 */
	public BinaryTree(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public BinaryTree<T> getLeftBinaryTree() {
		return leftBinaryTree;
	}

	public void setLeftBinaryTree(BinaryTree<T> leftBinaryTree) {
		this.leftBinaryTree = leftBinaryTree;
	}

	public BinaryTree<T> getRightBinaryTree() {
		return rightBinaryTree;
	}

	public void setRightBinaryTree(BinaryTree<T> rightBinaryTree) {
		this.rightBinaryTree = rightBinaryTree;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void addNode(BinaryTree<T> node) {
		if (this.value == null) {
			leftBinaryTree = node.getLeftBinaryTree();
			rightBinaryTree = node.getRightBinaryTree();
			value = node.getValue();
			return;
		}
		insertNode(this, node);
	}

	public void insertNode(BinaryTree<T> rootNode, BinaryTree<T> node) {
		BinaryTree<T> currentNode = rootNode, tempNode = currentNode;
		while (true) {
			if (currentNode == null) {
				return;
			} else if (comapare(currentNode.getValue() , node.getValue())>=1) {
				tempNode = currentNode;
				currentNode = currentNode.getLeftBinaryTree();
				if (currentNode == null) {
					//System.out.println(tempNode.getValue() + " Left node adding of value " + node.getValue());
					tempNode.setLeftBinaryTree(node);
					return;
				}
			} else {
				tempNode = currentNode;
				currentNode = currentNode.getRightBinaryTree();
				if (currentNode == null) {
					//System.out.println(tempNode.getValue() + " Right node adding of value " + node.getValue());
					tempNode.setRightBinaryTree(node);
					return;
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public int comapare(T object1, T object2) {
		if (object1.getClass().isAssignableFrom(Comparable.class)) {
			Comparable<T> compare = (Comparable<T>) object1;
			return compare.compareTo(object2);
		} else if (object1.getClass().isAssignableFrom(Comparator.class)) {
			Comparator<T> compare = (Comparator<T>) object1;
			return compare.compare(object1, object2);
		} else {
			return object1.hashCode() - object2.hashCode();
		}
	}

	public void addLeftNode(BinaryTree<T> node) {
		this.setLeftBinaryTree(node);
	}

	public void addRightNode(BinaryTree<T> node) {
		this.setRightBinaryTree(node);
	}

}
