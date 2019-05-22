/**
 * 
 */
package org.practice.ds.traversals;

import org.practice.ds.contracts.Stack;
import org.practice.ds.contracts.Traverse;
import org.practice.ds.structure.BinaryTree;
import org.practice.ds.structure.StackImple;

/**
 * @author Anish Singh
 *
 */
public class SpiralOrderTraversal implements Traverse<BinaryTree<Integer>> {

	public static void main(String args[]) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
		tree.addNode(new BinaryTree<Integer>(2));
		tree.addNode(new BinaryTree<Integer>(10));
		tree.addNode(new BinaryTree<Integer>(5));
		tree.addNode(new BinaryTree<Integer>(4));
		tree.addNode(new BinaryTree<Integer>(8));
		tree.addNode(new BinaryTree<Integer>(6));
		tree.addNode(new BinaryTree<Integer>(9));
		tree.addNode(new BinaryTree<Integer>(7));
		Traverse<BinaryTree<Integer>> traversal = new SpiralOrderTraversal();
		traversal.traverse(tree);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.Traverse#traverse(java.lang.Object)
	 */
	@Override
	public void traverse(BinaryTree<Integer> root) {
		Stack<BinaryTree<Integer>> leftRightOrderedChileStack = new StackImple<BinaryTree<Integer>>();
		Stack<BinaryTree<Integer>> rightleftOrderedChileStack = new StackImple<BinaryTree<Integer>>();
		leftRightOrderedChileStack.push(root);
		System.out.print("Spiral Level Order Traversal Output : ");
		while (true) {
			while (!leftRightOrderedChileStack.isEmpty()) {
				BinaryTree<Integer> node = leftRightOrderedChileStack.pop();
				System.out.print(node.getValue() + " ");
				if (node.getLeftBinaryTree() != null)
					rightleftOrderedChileStack.push(node.getLeftBinaryTree());
				if (node.getRightBinaryTree() != null)
					rightleftOrderedChileStack.push(node.getRightBinaryTree());
			}
			if (rightleftOrderedChileStack.isEmpty()) {
				break;
			}
			while (!rightleftOrderedChileStack.isEmpty()) {
				BinaryTree<Integer> node = rightleftOrderedChileStack.pop();
				System.out.print(node.getValue() + " ");
				if (node.getRightBinaryTree() != null)
					leftRightOrderedChileStack.push(node.getRightBinaryTree());
				if (node.getLeftBinaryTree() != null)
					leftRightOrderedChileStack.push(node.getLeftBinaryTree());
			}
		}

	}

}
