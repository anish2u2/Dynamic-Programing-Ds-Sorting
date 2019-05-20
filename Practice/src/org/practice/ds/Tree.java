/**
 * 
 */
package org.practice.ds;

/**
 * @author Anish Singh
 *
 */
public class Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree firstTree = new BinaryTree(0);
		// BinaryTree secondTree=new BinaryTree(1);

		for (int counter = 0; counter < 5; counter++) {
			// firstTree.addNode(new BinaryTree(counter));
		}
		firstTree.addNode(new BinaryTree(0));
		firstTree.addNode(new BinaryTree(1));
		firstTree.addNode(new BinaryTree(0));
		firstTree.addNode(new BinaryTree(1));
		firstTree.addNode(new BinaryTree(0));
		firstTree.addNode(new BinaryTree(0));
		firstTree.addNode(new BinaryTree(1));

		printValue(firstTree);
		// printValue(secondTree);
	}

	public static void printValue(BinaryTree tree) {
		if (tree != null) {
			printValue(tree.getLeftTree());
			System.out.println(tree.getValue());
			printValue(tree.getRightTree());
		}
	}

	static class BinaryTree {
		private BinaryTree leftTree;
		private BinaryTree rightTree;

		private int value = -1;

		/**
		 * 
		 */
		public BinaryTree(int value) {
			// TODO Auto-generated constructor stub
			this.value = value;
			// System.out.println("pushed values");
		}

		public BinaryTree getLeftTree() {
			return leftTree;
		}

		public void setLeftTree(BinaryTree leftTree) {
			this.leftTree = leftTree;
		}

		public BinaryTree getRightTree() {
			return rightTree;
		}

		public void setRightTree(BinaryTree rightTree) {
			this.rightTree = rightTree;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public void addNode(BinaryTree node) {
			if (this.value == -1) {
				leftTree = node.getLeftTree();
				rightTree = node.getRightTree();
				value = node.getValue();
				return;
			}
			insertNode(this, node);
		}

		public void insertNode(BinaryTree rootNode, BinaryTree node) {
			BinaryTree currentNode = rootNode, tempNode = currentNode;
			while (true) {
				if (currentNode == null) {
					return;
				} else if (currentNode.getValue() >= node.getValue()) {
					tempNode = currentNode;
					currentNode = currentNode.getLeftTree();
					if (currentNode == null) {
						System.out.println(tempNode.getValue() + " Left node adding of value " + node.getValue());
						tempNode.setLeftTree(node);
						return;
					}
				} else {
					tempNode = currentNode;
					currentNode = currentNode.getRightTree();
					if (currentNode == null) {
						System.out.println(tempNode.getValue() + " Right node adding of value " + node.getValue());
						tempNode.setRightTree(node);
						return;
					}
				}
			}
		}

		public void addLeftNode(BinaryTree node) {
			this.setLeftTree(node);
		}

		public void addRightNode(BinaryTree node) {
			this.setRightTree(node);
		}

	}

}
