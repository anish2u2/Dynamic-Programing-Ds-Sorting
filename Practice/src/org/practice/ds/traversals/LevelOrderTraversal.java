/**
 * 
 */
package org.practice.ds.traversals;

import org.practice.ds.contracts.Queue;
import org.practice.ds.contracts.Traverse;
import org.practice.ds.structure.BinaryTree;
import org.practice.ds.structure.QueueImple;

/**
 * @author Anish Singh
 *
 */
public class LevelOrderTraversal implements Traverse<BinaryTree<Integer>> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
		tree.addNode(new BinaryTree<Integer>(2));
		tree.addNode(new BinaryTree<Integer>(10));
		tree.addNode(new BinaryTree<Integer>(5));
		tree.addNode(new BinaryTree<Integer>(4));
		tree.addNode(new BinaryTree<Integer>(8));
		tree.addNode(new BinaryTree<Integer>(6));
		tree.addNode(new BinaryTree<Integer>(9));
		tree.addNode(new BinaryTree<Integer>(7));
		Traverse<BinaryTree<Integer>> traversal = new LevelOrderTraversal();
		traversal.traverse(tree);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.practice.ds.contracts.Traverse#traverse(java.lang.Object)
	 */
	@Override
	public void traverse(BinaryTree<Integer> rootNode) {
		Queue<BinaryTree<Integer>> queue = new QueueImple<BinaryTree<Integer>>();
		queue.offer(rootNode);
		System.out.print("Level Order Traversal Output : ");
		while (!queue.isEmpty()) {
			BinaryTree<Integer> node = queue.poll();
			System.out.print(node.getValue());

			if (node.getLeftBinaryTree() != null) {
				queue.offer(node.getLeftBinaryTree());
			}
			if (node.getRightBinaryTree() != null) {
				queue.offer(node.getRightBinaryTree());
			}
			if (!queue.isEmpty()) {
				System.out.print(",");
			}
		}

	}

}
